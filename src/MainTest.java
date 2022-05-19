public class MainTest {
    public static void main(String[] args) {
        EncryptedP p1 = new EncryptedP("abcdeyz1","user1","tag1");
        EncryptedP p2 = new EncryptedP("abcdeyz2","user2","tag2");
        EncryptedP p3 = new EncryptedP("abcdeyz3","user3","tag3");
        PwSafe testSafe = new PwSafe(p1,p2,p3);
        System.out.println(testSafe);
        testSafe.setPath("pwsafe.safe");
    }
}
