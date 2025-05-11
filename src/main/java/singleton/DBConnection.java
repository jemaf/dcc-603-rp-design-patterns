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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DBConnection that = (DBConnection) obj;
        return connectionString.equals(that.connectionString);
    }
}