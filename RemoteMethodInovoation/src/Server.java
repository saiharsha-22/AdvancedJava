import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class Server extends UnicastRemoteObject implements Hello{

    public Server() throws RemoteException{}
    @Override
    public void printMsg() throws RemoteException {
         System.out.println("This is an example RMI program"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int adder(int x, int y) throws RemoteException {
        return(x+y);
    }
    public static void main(String agrgs[]){
        try{
            Registry registry = LocateRegistry.createRegistry(8000);
            registry.rebind("Hello server",new Server());
            System.out.println("Server Ready");
        }catch(Exception ex){
            System.out.println("Server Exception:"+ex.toString());
            ex.printStackTrace();
        }
    }
}
