import java.io.BufferedReader;
import java.io.FileReader;
import java.security.MessageDigest;
import java.math.BigInteger;

public class Cracker{
    public static void main(String[] args) throws Exception{
        String common_passwords_path = "C:\\Users\\redfl\\OneDrive\\Desktop\\CS645\\P1_files\\common-passwords.txt";
        String shadow_path = "C:\\Users\\redfl\\OneDrive\\Desktop\\CS645\\P1_files\\shadow";
        BufferedReader shadow = new BufferedReader(new FileReader(shadow_path));
        String sPass, dPass = "";
        System.out.println("\n#################  Cracked Passwords  #################");
        while((sPass = shadow.readLine()) != null){
            BufferedReader dict = new BufferedReader(new FileReader(common_passwords_path));
            String[] shadowData = sPass.split(":");
            while((dPass = dict.readLine()) != null){
                String[] s = shadowData[1].split("\\$");
                if (MD5Shadow.crypt(dPass,s[2]).equals(s[3])){
                    System.out.println(shadowData[0]+": " + dPass);
                    break;
                }
            }
            dict.close();
        }
        shadow.close();
    }
}