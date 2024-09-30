public class Network implements Connectable {
    
    @Override
    public void connectToNetwork(String networkName){
        System.out.println("Fasza gyerek vagy." + networkName);
    }
    
    @Override
    public void disconnectFromNetwork(){
        System.out.println("Szar vagy. Nem sikerült csatlakozni.");
    }

}
