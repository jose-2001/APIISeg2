package model;

import java.util.ArrayList;
import java.util.List;

import exceptions.*;

public class Shop {

	//attributes
	
	private int personCounter;
	private String name;
	
	//relations
	
	private List<Person> clients;
	
	//methods
	
	public Shop() {
		personCounter=0;
		name="Mi Barrio Te Quiere";
		clients= new ArrayList<Person>();
	}
	
	public int getPersonCounter() {
		return personCounter;
	}
	
	public void setPersonCounter(int pc) {
		personCounter=pc;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
	
	public List<Person> getClients() {
		return clients;
	}

	public void setClients(List<Person> clients) {
		this.clients = clients;
	}
	
	public void registerPerson(String idt,String idn, int date) throws NotAssignedDayException,PersonIsUnderageException {
		
		setPersonCounter(getPersonCounter()+1);
		if(idt.equals(Person.TI))
		{
			throw new PersonIsUnderageException();
		}
		else {
			if( date%2!=0)
			{
				if(idn.charAt(idn.length()-2)%2==0)
				{
					Person toRegister= new Person (idt,idn);
					clients.add(toRegister);
				}
				else {
					throw new NotAssignedDayException("El penúltimo número del documento de esta persona es impar y debe salir en dias pares");
				}
			}
			else {
				if(idn.charAt(idn.length()-2)%2!=0)
				{
					Person toRegister= new Person (idt,idn);
					clients.add(toRegister);
				}
				else {
					throw new NotAssignedDayException("El penúltimo número del documento de esta persona es par y debe salir en dias impares");
				}
			}
		}
	}
}
