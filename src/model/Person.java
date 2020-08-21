package model;

public class Person {

	//constants
	public static final String TI="Tarjeta de Identidad";
	public static final String CC="Cedula de Ciudadania";
	public static final String CE="Cedula de Extranjería";
	public static final String PP="Pasaporte";
	
	//attributes
	private String idType;
	private String idNumber;

	//methods 

	public Person(String idt, String idn) {
		idType = idt;
		idNumber = idn;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	

	
}
