package singleton;

public class DBConnection {

    private String connectionString;

    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    };

    private static DBConnection instance;

    public static DBConnection getInstance(String connectionString) {
        if (instance == null) {
            instance = new DBConnection(connectionString);
        }
        return instance;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
