package designPatterns.singleton.singleThreaded;

public class client {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        System.out.println(db1);
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println(db2);
    }
}
