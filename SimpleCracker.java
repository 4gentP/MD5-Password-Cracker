import java.io.BufferedReader;
import java.io.FileReader;
import java.security.MessageDigest;
import java.math.BigInteger;

public class SimpleCracker{
    
    public static String toHex(byte[] bytes){
        BigInteger bi = new BigInteger(1, bytes);
        return String.format("%0" + (bytes.length << 1) + "X", bi);
    }

    public static String hash(String saltedPass) throws Exception{
        MessageDigest digester = MessageDigest.getInstance("MD5");
        return toHex(digester.digest(saltedPass.getBytes()));
    }

    public static void main(String[] args) throws Exception{
        String common_passwords_path = "C:\\Users\\redfl\\OneDrive\\Desktop\\CS645\\P1_files\\common-passwords.txt";
        String simple_shadow_path = "C:\\Users\\redfl\\OneDrive\\Desktop\\CS645\\P1_files\\shadow-simple";
        BufferedReader shadow = new BufferedReader(new FileReader(simple_shadow_path));
        
        String sPass = "";
        String dPass = "";
        System.out.println("\n#################  Cracked Passwords  #################");
        while((sPass = shadow.readLine()) != null){
            BufferedReader dict = new BufferedReader(new FileReader(common_passwords_path));
            String[] shadowData = sPass.split(":");
            //System.out.println(shadowData[0]+":"+shadowData[1]+":"+shadowData[2]);
            while((dPass = dict.readLine()) != null){
                String s = shadowData[1] + dPass;
                if (hash(s).equals(shadowData[2])){
                    System.out.println(shadowData[0]+": " + dPass);
                    break;
                }
            }
            dict.close();
        }
        shadow.close();
    }
}