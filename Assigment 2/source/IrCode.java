import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//For writing the 3 address code into the generatedCode.tac file
public class IrCode {
    String filePath;

    public IrCode(String path) {
        this.filePath = path;
    }

    public void write(String str) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.filePath));
            writer.write(str);
            writer.close();
        }
        catch (IOException e) {
        }
    }

    public void prepend(String str) {
        try {
            String s = Files.readString(Path.of(this.filePath));
            this.write(String.format("%s\n%s", str, s));
        }
        catch (IOException e) {
        }
    }

    public void append(String str){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.filePath, true));
            writer.append(str);
            writer.close();
        }
        catch (IOException e) {
        }
    }
}