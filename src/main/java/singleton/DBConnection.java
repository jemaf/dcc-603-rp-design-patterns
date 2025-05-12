package singleton;

public class DBConnection {

    private String connectionString;
    private static final DBConnection instance = new DBConnection("jdbc:default:connection"); // Initialize with a default or load from config

    private DBConnection(String connectionString) {
        // Simulate time-consuming resource setup
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.connectionString = connectionString;
    }

    public static DBConnection getInstance() {
        return instance;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
