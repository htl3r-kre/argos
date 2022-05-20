import org.apache.commons.codec.digest.DigestUtils;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Encryptor {
    private static final IvParameterSpec ivspec = new IvParameterSpec(new byte[]{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, });
    private static final String alg = "AES/CBC/PKCS5Padding";

    public static String hash (String input){
        return DigestUtils.sha256Hex(input);
    }

    public static String encrypt (String clearText, String keyHash) throws IOException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {
        SecretKey key = new SecretKeySpec(MessageDigest.getInstance("SHA-256").digest(keyHash.getBytes(StandardCharsets.UTF_8)), "AES");
        Cipher cipher = Cipher.getInstance(alg);
        cipher.init(Cipher.ENCRYPT_MODE, key, ivspec);
        byte[] bytes = cipher.doFinal(clearText.getBytes(StandardCharsets.UTF_8));
        String b64 = new String(Base64.getEncoder().encode(bytes), StandardCharsets.UTF_8);
        return b64;
    }
}
