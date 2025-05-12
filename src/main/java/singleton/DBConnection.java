package singleton;

public class DBConnection {
    // Referência de implementação do Singleton: https://engsoftmoderna.info/cap6.html#singleton
    private DBConnection(this.connectionString = connectionString;) {} // construtor privado para impedir do usuário criar instâncias da classe
    private static DBConnection instance = null; // instância única da classe -> chamada no método getInstance
    private String connectionString;

    public static Logger getInstance() {
        if (instance == null){
            instance = new DBConnection();
        }
        return instance;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
