package singleton;

public class DBConnection {
    // Referência de implementação do Singleton: https://engsoftmoderna.info/cap6.html#singleton
    private static DBConnection instance = null; // instância única da classe -> chamada no método getInstance
    private String connectionString;

    private DBConnection(String connectionString) { // construtor privado para impedir do usuário criar instâncias da classe
        this.connectionString = connectionString;
    } 

    public static DBConnection getInstance(String connectionString) {
        if (instance == null){
            instance = new DBConnection(connectionString);
        }
        return instance;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
