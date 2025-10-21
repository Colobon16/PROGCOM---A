package clase;

public class VariableYConstante {

	public static void main(String[] args) {
		// Tipos de datos primitivos 
		//Enteros - int
		int edad= 19;
		System.out.print("Mi edad es:"+edad);
		//Decimales
		double estatura=1.8;
		System.out.println(" Mi estatura es " +estatura+" m. ");
		
		//alfanumerico
		String nombre="Sergio";
		System.out.println(nombre.getClass().getSimpleName());
		//char - un solo caracter
		char a='s';
		
		//Booleano
		boolean verdad=true;
		
		var flor="Holitas";
		System.out.println(flor);
		
		String mail="scarrillo761@unab.edu.co";
		System.out.println(mail);
		mail="sergioc3166@gmail.com";
		System.out.println(mail);
		

	}

}
