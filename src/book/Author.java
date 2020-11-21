package book;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: Author
 * Language: Java
 * Date: 10/2/17
 * Description: This class contains author related attributes and algorithms to modify the attributes.
 */

// This class contains attributes that belong to an author
public class Author 
{
	// Instance variables
	private String name;										// Author's first and last name
	private String email;										// Author's email address
	private char gender;										// Author's gender
// ------------------- Default Constructor -------------------
	// Default Constructor
	public Author()
	{
		// Instantiate default properties
		name = "";
		email = "";
		gender = 0;
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Name, Email Address, Gender 
	public Author(String name, String email, char gender)
	{
		// Instantiate properties with parameter values 
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
// ------------------- End Alternate Constructor Method -------------------
	
// ------------------- Copy Constructor -------------------
	// Copy Constructor - Author
	public Author(Author obj)
	{
		this.name = obj.name;									// Shallow copy author's name
		this.email = obj.email;									// Shallow copy author's email
		this.gender = obj.gender;								// Shallow copy author's gender
	}
// ------------------- End Copy Constructor -------------------
	
// Setters:
// ------------------- Set Gender Method -------------------
	// Method that alters the gender of the author
	public void setGender(char newGender)
	{
		this.gender = newGender;								// Alter the author's gender 
	}
// ------------------- End Set Gender Method -------------------
	
// ------------------- Set Name Method -------------------
	// Method that alters the first and last name of the author
	public void setName(String newName)
	{
		this.name = newName;									// Alter the author's name 
	}
// ------------------- End Set Name Method -------------------
	
// ------------------- Set Email Method -------------------
	// Method that alters the email of the author
	public void setEmail (String newEmail)
	{
		this.email = newEmail;									// Alter the author's email address 
	}
// ------------------- End Set Email Method -------------------
	
// Getters:
// ------------------- Get Gender Method -------------------
	// Method that returns the gender of the author
	public char getGender()
	{
		return gender;											// Return the author's gender
	}
// ------------------- End Get Gender Method -------------------
	
// ------------------- Get Name Method -------------------
	// Method that returns the name of the author
	public String getName() 
	{
		return name;											// Return the author's name
	}
// ------------------- End Get Name Method -------------------
	
// ------------------- Get Name Formatted Method -------------------
	// Method that returns the name with a design format of the author
	public String getNameFormatted() 
	{
		return ("-" + name + "\n");								// Return the author's name formatted
	}
// ------------------- End Get Name Formatted Method -------------------
	
// ------------------- Get Email Method -------------------
	// Method that returns the email of the author
	public String getEmail()
	{
		return email;											// Return the author's email
	}
// ------------------- End Get Email Method -------------------
	
// ------------------- To String Method -------------------
	// Method that converts the author's data to a String
	public String toString()
	{
		return name + " (" + gender + ")" + " at " + email;		// Return the author's data 
	}
// ------------------- End To String Method -------------------
} // End of class Author
