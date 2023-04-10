package designPatterns.singleton.singleThreaded;

public class DatabaseConnection {
    private static DatabaseConnection db = null;

    private DatabaseConnection() {

    }

    public static DatabaseConnection getInstance(){
        if(db == null){
            db = new DatabaseConnection();
        }
        return db;
    }
}
