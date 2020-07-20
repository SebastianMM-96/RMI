import java.rmi.Naming;
import java.io.*;
import java.util.*;

public class Cliente {
	public static void main(String []args) {
/*Para leer una cadena desde el teclado*/
        float res;
        
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String operacion=null;
		System.out.println("Ingresa la cadena de la operación: ");
		try{
			operacion = br.readLine();
		}catch(Exception e){
			e.printStackTrace();
		}

		Scanner operScanner = new Scanner(operacion);
        operScanner.useDelimiter(" ");
        float num1 = operScanner.nextFloat();
        String operador = operScanner.next();
        float num2 = operScanner.nextFloat();

		try {
// Le decimos que use el archivo "rmi.policy" para permisos. Otorgandole todos
			//System.setProperty("java.security.policy","rmi.policy");
// Inicializamos el Security Manager
			//System.setSecurityManager(new SecurityManager());
// Obtenemos una instancia usando el url.
			IServidor s = (IServidor) Naming.lookup("rmi://127.0.0.1:5520/Servidor");
// Invocamos el metodo que se ejecutara remotamente
			if(operador.equals("+")){
                res = s.suma(num1,num2);
            }else if(operador.equals("-")){
                res = s.resta(num1,num2);
            }else if(operador.equals("*")){
                res = s.mult(num1,num2);
            }else{
                res = s.div(num1,num2);
            }
			System.out.println("El resultado es: " + res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}