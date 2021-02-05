package model;

public class Person 
{
	private String mName ;
	private String mSurname ;
	
	public Person(String pName, String pSurname)
	{
		this.mName 	  = pName ;
		this.mSurname = pSurname ;
	}
	public String getName()
	{
		return this.mName ;
	}
	public String getSurname()
	{
		return this.mSurname ;
	}
}
