package singleton;

public class DBConnection {

    private static DBConnection instance; // Instância única da classe
    private String connectionString;

    // Construtor privado para evitar instâncias externas
    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    // Método estático para obter a instância única
    public static DBConnection getInstance(String connectionString) {
        if (instance == null) {
            synchronized (DBConnection.class) { // Garantir thread safety
                if (instance == null) {
                    instance = new DBConnection(connectionString);
                }
            }
        }
        return instance;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}