public class App {
    public static void main(String[] args) throws Exception {
        Network network = new Network();
        network.connectToNetwork(" Sikerült csatlakozni.");
        network.disconnectFromNetwork();

    }
}
