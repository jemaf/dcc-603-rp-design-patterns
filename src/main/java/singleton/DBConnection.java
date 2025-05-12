package singleton;

public class DBConnection {

    private static DBConnection instance;

    private String connectionString;

    // Construtor privado
    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    // Método getInstance
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

    // Sobrescreve equals() e hashCode() para que assertEquals funcione corretamente
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof DBConnection)) return false;
        DBConnection other = (DBConnection) obj;
        return this.connectionString.equals(other.connectionString);
    }

    @Override
    public int hashCode() {
        return connectionString.hashCode();
    }
}
