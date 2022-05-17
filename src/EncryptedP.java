import java.util.ArrayList;

public class EncryptedP {
    protected String value;
    protected ArrayList<String> tags;
    protected String userName;
    public EncryptedP(String... args) {
        if (args.length >= 3) {
            this.value = args[0];
            this.userName = args[1];
            tags = new ArrayList<>();
            for (int i = 2; i < args.length - 1; i++) {
                tags.add(args[i]);
            }
        }
    }
}
