
import java.math.BigInteger;

public class AddBinary {
    // att

    // method
    public static String addBin(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 =  new BigInteger(b, 2);
        BigInteger ans = num1.add(num2);
        String ansStr = ans.toString(2);
        
        return ansStr;
    }
}
