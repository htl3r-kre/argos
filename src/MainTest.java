import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class MainTest {
    public static void main(String[] args) throws InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException,NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        System.out.println(Encryptor.hash("key"));
        System.out.println(Encryptor.encrypt("hallo","2c70e12b7a0646f92279f427c7b38e7334d8e5389cff167a1dc30e73f826b683"));
        System.out.println(Encryptor.decrypt("xzFK7+i7+yaAqnsre6boBA==","2c70e12b7a0646f92279f427c7b38e7334d8e5389cff167a1dc30e73f826b683"));
        /*EncryptedP p1 = new EncryptedP("hashvalue","user","tag1","tag2");
        EncryptedP p2 = new EncryptedP("hashvalue","user","tag1","tag2");
        EncryptedP p3 = new EncryptedP("hashvalue","user","tag1","tag2");
        PwSafe test = new PwSafe(p1,p2,p3);
        test.writeSafe("safe.pw");*/
    }
}
