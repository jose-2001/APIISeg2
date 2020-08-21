package ui;
import java.util.Scanner;

import model.Person;
import model.Shop;
public class Main {

	//attributes
	
	public static Scanner sc= new Scanner(System.in);
	
	//relations
	
	private static Shop shop= new Shop(0);
	
	public static void main(String[] args) {
		int dec;
		do {
		menu();
		 dec = sc.nextInt();
		switch(dec) {
		case 1:
			option1();
			break;
		case 2:
			option2();
			break;
		case 3:
			option3();
			break;
			default:
			System.out.println("Por favor ingrese una opción válida");
		}
		}while(dec!=3);
		
	}

	public static void menu() {
		System.out.println("Bienvenido al minimercado "+shop.getName());
		System.out.println("Digite 1 para registrar el ingreso de una nueva persona");
		System.out.println("Digite 2 para consultar la cantidad de personas que han intentado ingresar al minimercado");
		System.out.println("Digite 3 para cerrar el menu");
	}
	public static void option1() {
		System.out.println("Registrando una nueva persona");
		System.out.println("Digite 1 si el documento de la persona es una Tarjeta de Identidad");
		System.out.println("Digite 2 si el documento de la persona es una Cedula de Ciudadania");
		System.out.println("Digite 3 si el documento de la persona es una Cedula de Extranjeria");
		System.out.println("Digite 4 si el documento de la persona es un Pasaporte");
		int dec=sc.nextInt();
		String idt="";
		switch(dec) {
		case 1:
			idt=Person.TI;
			break;
		case 2:
			idt=Person.CC;
			break;
		case 3:
			idt=Person.CE;
			break;
		case 4:
			idt=Person.PP;
			break;
		}
		System.out.println("Ingrese el numero de identificacion de la persona");
		String idn=sc.nextLine();
		/*try{
			shop.registerPerson(idt,idn);
		}
		catch{}
		*/
	}
	public static void option2() {
	
	}
	public static void option3() {
	
	}
}
