package singleton;

public class DBConnection {

    private static DBConnection instance = null;
    private String connectionString;

    // Construtor privado
    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    // Método público para acessar a instância única
    public static DBConnection getInstance(String config) {
        if (instance == null) {
            instance = new DBConnection(config);
        }
        return instance;
    }

    // Método de conexão (mantido igual ao seu)
    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }

    // Getter necessário para os testes
    public String getConnectionString() {
        return this.connectionString;
    }
}
