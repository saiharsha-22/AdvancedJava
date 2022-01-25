
import java.rmi.*;
import java.rmi.RemoteException;
public interface Hello extends Remote{
    void printMsg() throws RemoteException;
    int adder(int x,int y)throws RemoteException;
}



