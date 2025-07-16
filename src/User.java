public class User {
    String email = "not provided";
    String username = "guest";
    int age = 0;

    User(){
    }

    User(String username){
        this.username = username;
    }

    // method overloading
    User(String username, String email){
        this.username = username;
        this.email = email;
    }
}
