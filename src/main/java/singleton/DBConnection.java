package singleton;

public class DBConnection {

    private static DBConnection instance;
    private String connectionString;

    // Construtor privado impede criação de novas instâncias
    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    // Método de acesso público à instância Singleton
    public static DBConnection getInstance(String connectionString) {
        if (instance == null) {
            instance = new DBConnection(connectionString);
        } else {
            System.out.println("Instância já criada com a connection string: " + instance.connectionString);
        }
        return instance;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}