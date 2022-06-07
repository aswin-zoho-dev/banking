import java.util.Arrays;

public class Utils {
    public String encryption(String password) {
        char[] encry = password.toCharArray();
        char temp;
        int i = 0, j = encry.length - 1;
        while (i < j) {
            temp = encry[i];
            encry[i] = encry[j];
            encry[j] = temp;
            i++;
            j--;
        }
        int k =0;
        String encryPassword = "";
        while (k<encry.length) {
            encryPassword = encryPassword + encry[k];
            k++;
        }
        return encryPassword + "isEncrypted";
    }
}
