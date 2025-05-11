package singleton;

public class DBConnection {
    private static DBConnection INSTANCE;

    private String connectionString;

    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static DBConnection getInstance(String connectionString) {
        if (INSTANCE == null) INSTANCE = new DBConnection(connectionString);
        return INSTANCE;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
