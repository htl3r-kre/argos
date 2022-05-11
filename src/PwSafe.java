import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PwSafe {
    private ArrayList<String> data = new ArrayList<String>();

    public void loadFile(Path file){
            try (BufferedReader in = Files.newBufferedReader(file, Charset.forName("UTF-8"));
            ) {
                String line;
                while ((line = in.readLine()) != null) {
                    if (line.charAt(0)=='e') {
                        data.add(line);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
