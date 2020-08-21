package model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import exceptions.NotAssignedDayException;
import exceptions.PersonIsUnderageException;

public class Shop {

	//attributes
	
	private int personCounter;
	private String name;
	
	//relations
	
	private List<Person> clients;
	
	//methods
	
	public Shop(int pc) {
		personCounter=pc;
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
	
	public void registerPerson(String idt,String idn) throws NotAssignedDayException,PersonIsUnderageException {
		if(idt.equals(Person.TI))
		{
			throw new PersonIsUnderageException();
		}
		else {
			if( LocalDate.now().getDayOfMonth()%2!=0)
			{
				
			}
		}
	}
}
