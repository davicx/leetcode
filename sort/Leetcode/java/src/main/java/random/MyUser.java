package sort;

import java.util.ArrayList;

public class MyUser {
    public int userId;
    public String userName;

    //Constructor
    public MyUser(int userId, String currentUserName) {
        this.userId = userId;
        userName = currentUserName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
