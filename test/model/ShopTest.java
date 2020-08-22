package model;

import static org.junit.jupiter.api.Assertions.*;
import exceptions.*;
import org.junit.jupiter.api.Test;

class ShopTest {

	private Shop myShop; 
	public void setupScenario1(){
		myShop= new Shop();
	}
	
	@Test
	void testRegisterPerson1() {
		setupScenario1();
		String idt= Person.TI;
		String idn="123456789";
		int date=1;
		try
		{
			myShop.registerPerson(idt, idn, date);
			fail("controller should not read this");
		}
		catch(PersonIsUnderageException piue)
		{
			assertEquals(myShop.getClients().size(),0,"There should be no one registered");
			assertEquals(myShop.getPersonCounter(),1,"The attempt should have been registered");
		}
		catch(NotAssignedDayException nade)
		{
			fail("PersonIsUnderageException expected");
		}
	}
	@Test
	void testRegisterPerson2() {
		setupScenario1();
		String idt= Person.CC;
		String idn="123456789";
		int date=1;
		try
		{
			myShop.registerPerson(idt, idn, date);

		}
		catch(PersonIsUnderageException piue)
		{
			fail("No Exception expected");
		}
		catch(NotAssignedDayException nade)
		{
			fail("No Exception expected");

		}
		assertEquals(myShop.getClients().size(),1,"There should be one person registered");
		assertEquals(myShop.getPersonCounter(),1,"The attempt should have been registered");
		assertEquals(idt,myShop.getClients().get(0).getIdType(),"The person's ID Type was not registered correctly");
		assertEquals(idn,myShop.getClients().get(0).getIdNumber(),"The person's ID Number was not registered correctly");
	}
	@Test
	void testRegisterPerson3() {
		setupScenario1();
		String idt= Person.CE;
		String idn="123456719";
		int date=2;
		try
		{
			myShop.registerPerson(idt, idn, date);

		}
		catch(PersonIsUnderageException piue)
		{
			fail("No Exception expected");
		}
		catch(NotAssignedDayException nade)
		{
			fail("No Exception expected");

		}
		assertEquals(myShop.getClients().size(),1,"There should be one person registered");
		assertEquals(myShop.getPersonCounter(),1,"The attempt should have been registered");
		assertEquals(idt,myShop.getClients().get(0).getIdType(),"The person's ID Type was not registered correctly");
		assertEquals(idn,myShop.getClients().get(0).getIdNumber(),"The person's ID Number was not registered correctly");
	}
	@Test
	void testRegisterPerson4() {
		setupScenario1();
		String idt= Person.PP;
		String idn="123456789";
		int date=2;
		try
		{
			myShop.registerPerson(idt, idn, date);
			fail("controller should not read this");
		}
		catch(PersonIsUnderageException piue)
		{
			fail("NotAssignedDayException expected");
		}
		catch(NotAssignedDayException nade)
		{
			assertEquals(myShop.getClients().size(),0,"There should be no one registered");
			assertEquals(myShop.getPersonCounter(),1,"The attempt should have been registered");
		}
	}
	@Test
	void testRegisterPerson5() {
		setupScenario1();
		String idt= Person.CE;
		String idn="123456719";
		int date=1;
		try
		{
			myShop.registerPerson(idt, idn, date);
			fail("controller should not read this");
		}
		catch(PersonIsUnderageException piue)
		{
			fail("NotAssignedDayException expected");
		}
		catch(NotAssignedDayException nade)
		{
			assertEquals(myShop.getClients().size(),0,"There should be no one registered");
			assertEquals(myShop.getPersonCounter(),1,"The attempt should have been registered");
		}
	}
}
