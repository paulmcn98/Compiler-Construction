import java.util.*;
import java.util.stream.Stream;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SymbolTable {
    //Symbol Table
    public Map<String, SymbolTableEntry> ST = new HashMap<>();
    //Undo Stack
    public Stack<String> undoStack = new Stack<>();

    public SymbolTable() {

    }

    public void addSymbol(String id, String type, String location) {
        // Create new instance of SymbolTableEntry and add to the symbol table and push onto the undo stack
        SymbolTableEntry symbol = new SymbolTableEntry(id, type, location);
        ST.put(id, symbol);
        undoStack.push(id);
    }

    // Push the special marker onto the undo stack so we can tell we are entering a local scope
    // Substitute for an enters scope function
    public void StackMarker(String specialMarker){
        undoStack.push(specialMarker);
    }

    //Function for pop off the undo stack when exiting local scope
    public String exitScope(){
        String topOfStack = "";
        if (undoStack.lastElement().equals("}"))
        {
            undoStack.pop();
        }
        else {
            topOfStack = undoStack.pop();
            if(!topOfStack.equals("{")){
                ST.remove(topOfStack);
            }
        }
        return  topOfStack;
    }

    //Return ID of a symbol
    public SymbolTableEntry getSymbolId(String id) {
        return ST.get(id);
    }

    // //Check to see if value type matches the declared type
    public boolean CompareTypeAndValue(String type, String value) throws IllegalArgumentException {
        boolean type_test = false;
        if(getSymbolId(value) != null){
            type_test = type.equalsIgnoreCase(getSymbolId(value).type);
        }
        else if((value != null && !value.equalsIgnoreCase("true") && !value.equalsIgnoreCase("false"))&& type.equalsIgnoreCase("integer"))
        {
            return true;
        }
        else {
            assert value != null;
            if((value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false")) && (type.equalsIgnoreCase("boolean")))
            {
                return true;
            }
        }
        if (type_test)
            return type_test;
        throw new IllegalArgumentException("Illegal type, value should correspond to the declared type");
    }

    // Function for checking if it is a valid comparative statment
    public  boolean CheckIfComparative(String expression) throws IllegalArgumentException{
        String[] ops = { "=", "!=", ">", ">=", "<", "<="};
        String regex = Stream.of(ops).map(Pattern::quote).collect(Collectors.joining("|", "(?i)\\b(?:", ")\\b"));
        //Checking if there are 2 conditions
        String[] arrSplit = expression.split("[&|]");
        if (arrSplit.length == 2){
            //Return true if comparative operator is present in the statement
            if(Pattern.compile(regex).matcher(arrSplit[0]).find() && Pattern.compile(regex).matcher(arrSplit[1]).find());
            {
                return true;
            }
        }
        else if (arrSplit.length == 1)
        {
            //Return true if comparative operator is present in the statement
            if(Pattern.compile(regex).matcher(arrSplit[0]).find())
            {
                return true;
            }
        }
        throw new IllegalArgumentException("Illegal, is not a comparative statement");
    }

}