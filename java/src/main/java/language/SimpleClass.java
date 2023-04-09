package language;

public class SimpleClass {
    public static void main(String[] args) {

        User davey = new User("davey", "shire");
        davey.getUserName();
        davey.getLocation();

    }
}

//Simple Class
class User {
    private String userName;
    private String location;

    public User(String userName, String location) {
        this.userName = userName;
        this.location = location;
    }


    //Get Username
    public String getUserName() {
        System.out.println(userName);
        return userName;
    }

    //Location
    public String getLocation() {
        System.out.println(location);
        return location;
    }

    public void setLocation(String newLocation) {

        this.location = newLocation;
    }


}
