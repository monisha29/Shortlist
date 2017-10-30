package Classes;

/**
 * Created by HPPC on 29-10-2017.
 */

public class Customer {
    private String customerId ;
    private String password;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //TODO : Sonali
    public String login(String id , String password) {
        String userType = "E";
        return userType;
    }
}
