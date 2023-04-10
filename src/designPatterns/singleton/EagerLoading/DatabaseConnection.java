package designPatterns.singleton.EagerLoading;

public class DatabaseConnection {
    private static DatabaseConnection db = new DatabaseConnection();

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        return  db;
    }
}
