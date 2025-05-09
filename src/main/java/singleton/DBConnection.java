package singleton;

public class DBConnection {

    private static DBConnection instance;
    private String connectionString;

    // Construtor privado
    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }
    

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
