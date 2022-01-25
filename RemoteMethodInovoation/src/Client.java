import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.util.Scanner;

public class Client {
    private Client() {}
    public static void main(String[] args) throws RemoteException,NotBoundException {
        Client c = new Client();
        c.connectRemote();
    }
    private void connectRemote() throws RemoteException, NotBoundException {
        try {
            Registry registry = LocateRegistry.getRegistry("Localhost",8000);
            Hello h = (Hello)registry.lookup("Hello server");
            System.out.println("In client");
            h.printMsg();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two integer values");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum is: "+h.adder(a,b));
        }
        catch(RemoteException e){
            System.out.println("Exception: "+e);
        }
    }
}