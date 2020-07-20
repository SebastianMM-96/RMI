import java.rmi.registry.*;
public class Principal {
	public static void main (String []args) {
		try {
// Habilitamos el Registro con un puerto
			Registry registry = LocateRegistry.createRegistry(5520);
// // Le decimos al registro que un objeto Server podra ser
// // intanciado con el ID "Server"
// // por lo tanto la direccion de este objeto seria:
// // "rmi://localhost:2320/Server"
			registry.rebind("Servidor", new Servidor());
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}