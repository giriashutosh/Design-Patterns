package designPatterns.singleton.doubleCheckLocking;

public class DatabaseConnection {
    private static DatabaseConnection db = null;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        if(db == null){ // T1 AND T2
            synchronized (DatabaseConnection.class){
                if(db == null){
                    db = new DatabaseConnection();
                }
            }
        }
        return  db;
    }
}
