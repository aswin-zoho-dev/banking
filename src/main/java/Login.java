import java.util.Arrays;
import java.util.List;

public class Login {
    String User;
    private String Password;



    public User authorization(String phone, String password, List<User> users) {
        Utils en = new Utils();
        for (int index = 0; index < users.size(); index++) {
            if (users.get(index).phone.equalsIgnoreCase(phone)) {
                if (users.get(index).password.equals(en.encryption(password))) {
                    return users.get(index);
                }
            }
        }
        return null;
    }
}
