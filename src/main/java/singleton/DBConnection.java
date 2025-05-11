package singleton;

public class DBConnection {

    private String connectionString;
    public static DBConnection instance;

    public static DBConnection getInstance(String connectionString) {
        if (instance == null) {
            instance = new DBConnection(connectionString);
        }
        return instance;
    }

    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
    
}
