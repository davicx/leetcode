package tools;

public class User {

    public Integer userID;
    public String userName;
    public String location;

    public User(Integer inputUserID, String inputUserName) {
        this.userID = inputUserID;
        this.userName = inputUserName;
    }

    public Integer getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getLocation() {
        return location;
    }

    public void sayHi() {
        System.out.println("hello!!");
    }


}