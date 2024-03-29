package learning;

public class AUser implements Comparable<AUser> {
    private Integer userID;
    private String userName;

    public AUser(String userName) {
        this.userName = userName;
    }

    //Getter
    public Integer getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }


    //Setter
    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    @Override
    public String toString() {
        return "User{" + "userID=" + userID + ", userName='" + userName;
    }

    @Override
    public int compareTo(AUser o) {
        //Objects.equals("test", new String("test"))
        return o.userID > this.userID ? 1 : -1;

        //return Objects.equals(o.userName, this.userName) ? 1 : -1;
    }
}
