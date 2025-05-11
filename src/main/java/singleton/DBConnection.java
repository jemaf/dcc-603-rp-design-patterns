package singleton;

public class DBConnection {

    private static DBConnection instance;
    private String connectionString;

    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static synchronized DBConnection getInstance(String connectionString) {
        if (instance == null) {
            instance = new DBConnection(connectionString);
        } else if (!instance.connectionString.equals(connectionString)) {
            instance = new DBConnection(connectionString);
        }
        return instance;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DBConnection that = (DBConnection) obj;
        return connectionString.equals(that.connectionString);
    }
}