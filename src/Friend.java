public class Friend {
    String name;
    static int numOfFriends=0;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have "+numOfFriends+" total friends");
    }
}
