import org.apache.commons.codec.digest.DigestUtils;

public class Encryptor {
    public static String hash (String input){
        return DigestUtils.sha256Hex(input);
    }
}
