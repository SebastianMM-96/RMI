import java.rmi.RemoteException;
import java.rmi.Remote;
/*** * * En la interfaz se definen cuales son los métodos que van a poder * * ser accedidos remotamente * */
public interface IServidor extends Remote{

float suma(float no1, float no2) throws RemoteException;

float resta(float no1, float no2) throws RemoteException;

float mult(float no1, float no2) throws RemoteException;

float div(float no1, float no2) throws RemoteException;

}