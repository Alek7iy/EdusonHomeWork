package UserSistem;

public class Main {
    public static void main( String[] args){

        User user1 = new User(" Alex", 21);
        User user2 = new User(" Alex", 21);
        User user3 = new User(" Bob", 22);

        System.out.println("User 1" + user1);
        System.out.println("User 2" + user2);
        System.out.println("User 3" + user3);
        System.out.println();

        System.out.println("hashCode");
        System.out.println("User 1 hashCode " + user1.hashCode());
        System.out.println("User 2 hashCode " + user2.hashCode());
        System.out.println("User 3 hashCode " + user3.hashCode());
        System.out.println();

        System.out.println("User1.equalse(User2)" + user1.equals(user2));
        System.out.println("User1.equalse(User3)" + user1.equals(user3));
        System.out.println("User2.equalse(User3)" + user2.equals(user3));
    }
}
