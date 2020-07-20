import java.rmi.*;
import java.rmi.server.*;
/***
* * Esta es la implementacion de nuestro servidor
***/
public class Servidor extends UnicastRemoteObject implements IServidor {
/***
* * Al heredar de UnicastRemoteObject nos obliga a poner
* * este constructor
***/
	public Servidor() throws RemoteException {
		super();
	}
/***
* *Esta es la implementacion de los metodos remotos
***/
	public float suma(float no1, float no2) throws RemoteException {
		return no1 + no2;
	}
	public float resta(float no1, float no2) throws RemoteException {
		return no1 - no2;
	}
	public float mult(float no1, float no2) throws RemoteException {
		return no1 * no2;
	}
	public float div(float no1, float no2) throws RemoteException {
		return no1 / no2;
	}
}
