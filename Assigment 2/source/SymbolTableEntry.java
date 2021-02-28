public class SymbolTableEntry
{
    String identifier;
    String type;
    String location;

    public SymbolTableEntry ()
    {
        this.identifier = "";
        this.type = "";
        this.location = "";
    }

    public SymbolTableEntry (String id, String ty, String loc)
    {
        this.identifier = id;
        this.type = ty;
        this.location = loc;
    }

    public void printEntry ()
    {
        System.out.println (identifier + "/" + type + "/" + location);
    }
}