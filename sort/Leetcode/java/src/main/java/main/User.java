import java.util.ArrayList;

public class User {
    public int userId;
    public String userName;
    private final ArrayList<String> userFriends = new ArrayList<String>();

    //Constructor
    public User(int userId, String currentUserName) {
        this.userId = userId;
        userName = currentUserName;
    }

    //Add Friend
    public void addFriend(String friendName) {
        userFriends.add(friendName);
    }

    //Get Friends
    public ArrayList<String> getFriends() {
        return userFriends;
    }
}
