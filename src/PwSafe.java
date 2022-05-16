import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

public class PwSafe {
    private ArrayList<EncryptedP> data;

    public void readSafe () {
        try {
            for (Object o : (JSONArray) JSONValue.parse(Files.readString(Paths.get("../pwsafe.pw")))) {
                data.add((EncryptedP) o);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void writeSafe () {
        String safeString = JSONValue.toJSONString(data);
        try {
            Files.writeString(Paths.get("../pwsafe.pw"), safeString, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
