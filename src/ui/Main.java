package ui;
import java.util.Scanner;

import exceptions.*;

import java.time.LocalDate;
import model.Person;
import model.Shop;
public class Main {

	//attributes
	
	public static Scanner sc= new Scanner(System.in);
	
	//relations
	
	private Shop shop;
	
	public Main()
	{
		shop= new Shop();
	}
	
	public static void main(String[] args) {
		int dec;
		Main main= new Main();
		do {
		main.menu();
		 dec = sc.nextInt();
			sc.nextLine();
		switch(dec) {
		case 1:
			main.option1();
			break;
		case 2:
			main.option2();
			break;
		case 3:
			main.option3();
			break;
			default:
			System.out.println("Por favor ingrese una opción válida");
		}
		}while(dec!=3);
		
	}

	public  void menu() {
		System.out.println("Bienvenido al minimercado "+shop.getName());
		System.out.println("Digite 1 para registrar el ingreso de una nueva persona");
		System.out.println("Digite 2 para consultar la cantidad de personas que han intentado ingresar al minimercado");
		System.out.println("Digite 3 para cerrar el menu");
	}
	public  void option1() {
		System.out.println("Registrando una nueva persona");
		System.out.println("Digite 1 si el documento de la persona es una Tarjeta de Identidad");
		System.out.println("Digite 2 si el documento de la persona es una Cedula de Ciudadania");
		System.out.println("Digite 3 si el documento de la persona es una Cedula de Extranjeria");
		System.out.println("Digite 4 si el documento de la persona es un Pasaporte");
		int dec=sc.nextInt();
		sc.nextLine();
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
		int date= LocalDate.now().getDayOfMonth();
		try{
			shop.registerPerson(idt,idn,date);
			System.out.println("Persona registrada exitosamente");
			System.out.println("Presione Enter para continuar\n");
			sc.nextLine();
		}
		catch(PersonIsUnderageException piue)
		{
			System.err.println(piue.getMessage());
			System.out.println("Presione Enter para continuar");
			sc.nextLine();
		} catch (NotAssignedDayException nade) {
			
			System.err.println(nade.getMessage());
			System.out.println("Presione Enter para continuar");
			sc.nextLine();
		}

	}
	public  void option2() {
	System.out.println("Se ha(n) intentado registrar "+shop.getPersonCounter()+" persona(s)\n");
	System.out.println("Presione Enter para continuar\n\n");
	sc.nextLine();
	}
	public  void option3() {
		System.out.println("¡Hasta luego!");
	}
}
