package EjercicioPromedioArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioPromedioArrayList {
		public static Scanner input=  new Scanner(System.in);
		
		public static int ingresarNumero () {
			int numero;
			numero=input.nextInt();	
				while (numero<0) {
					System.out.println("El numero ingresado no es valido. Ingrese un numero valido ");
					numero=input.nextInt();	
				}
			return numero;
		}
		
		public static double mostrarPromedio(ArrayList<Integer>lista) {
			double promedio=0;
			double total=0;
			int indice=0;
			while (indice<lista.size()) {
				total= total + (lista.get(indice));
				indice++;
			}
			promedio=total/lista.size();
			return promedio;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int cont=0;
	    int posicion=0;
		int num;
		System.out.println("Ingrese la cantidad de numeros que tendra su array");
		int longitudArray=ingresarNumero();
		ArrayList<Integer>numeros= new ArrayList<Integer>(longitudArray);
		while (cont<longitudArray) {
			System.out.println("Ingrese el numero para la posicion: " + posicion + " del array");
			num=ingresarNumero();
			numeros.add(num);
			cont++;
			posicion++;
		}
		System.out.println("Numeros ingresados: " + numeros);
		System.out.println("Promedio del array: "+ mostrarPromedio(numeros));
	}

}
