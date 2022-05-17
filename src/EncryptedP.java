import java.util.ArrayList;
import java.util.Arrays;

public class EncryptedP {
    protected String value;
    protected ArrayList<String> tags;
    protected String userName;
    public EncryptedP(String... args) {
        if (args.length >= 3) {
            this.value = args[0];
            this.userName = args[1];
            tags = new ArrayList<>();
            tags.addAll(Arrays.asList(args).subList(2, args.length - 1));
        }
    }
}
