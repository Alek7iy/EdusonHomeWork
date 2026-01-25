package UserSistem;

public class User {
    private String userName;
    private int age;

    public User (String userName, int age){
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }
    public int getAge() {
        return age;
    }

    public String toString(){
        return "User" + " UserName" + userName + ", age " + age;
    }
    public int hashCode(){
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        User user = (User) obj;

        if (age != user.age) return false;
        if (!userName.equals(user.userName)) return false;
        return true;
    }
}
