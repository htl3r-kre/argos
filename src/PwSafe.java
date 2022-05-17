import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

/**
 * A class to store {@link EncryptedP}asswords
 */
public class PwSafe {
    private ArrayList<EncryptedP> data;
    private String path = "../pwsafe.pw";

    /**
     * adds a password to the safe list ({@link PwSafe#data})
     * @param pw type: {@link EncryptedP}; the password, which is added
     * @return true if the password was set successfully
     */
    public boolean addPw (EncryptedP pw) {
        return data.add(pw);
    }

    /**
     * sets the path for the safe
     * @param path the path where the safe should be located
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * reads the safe from a file at {@link PwSafe#path} (with JSON)
     */
    public void readSafe () {
        try {
            for (Object o : (JSONArray) JSONValue.parse(Files.readString(Paths.get(path)))) {
                data.add((EncryptedP) o);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * writes the safe to a file at {@link PwSafe#path}
     */
    public void writeSafe () {
        String safeString = JSONValue.toJSONString(data);
        try {
            Files.writeString(Paths.get("../pwsafe.pw"), safeString, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
