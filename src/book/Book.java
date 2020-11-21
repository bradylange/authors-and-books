package book;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: Book
 * Language: Java
 * Date: 10/2/17
 * Description: This class contains attributes that belong to a book with only one author and algorithms to modify the attributes.
 */

// This class contains attributes that belong to a book with only one author
public class Book 
{ 
	// State variables
	private String name;												// Book's title
	private Author author;												// Book's author
	private double price;												// Book's sales price
// ------------------- Default Constructor -------------------
	// Default Constructor
	public Book()
	{
		// Instantiate default properties
		name = "";
		author = null;
		price = 0;
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Name, Author, Sales Price 
	public Book(String name, Author author, double price)
	{
		// Instantiate properties with parameter values 
		this.name = name;
		this.author = author;
		this.price = price;
	}
// ------------------- End Alternate Constructor -------------------
	
// Setters:
// ------------------- Set Name Method -------------------
	// Method that alters the name of the book
	public void setName(String newName)
	{
		this.name  = newName;											// Alter the book's name 
	}
// ------------------- End Set Name Method -------------------
	
// ------------------- Set Author Method -------------------
	// Method that alters the author of the book
	public void setAuthor(Author newAuthor)
	{
		this.author = newAuthor;										// Alter the book's author 
	}
// ------------------- End Set Author Method -------------------
	
// ------------------- Set Price Method -------------------
	// Method that alters the price of the book
	public void setPrice(double price)
	{
		this.price = price;												// Alter the book's sale price 
	} 
// ------------------- End Set Price Method -------------------	
	
// Getters:
// ------------------- Get Name Method -------------------
	// Method that returns the name of book
	public String getName()
	{
		return name;													// Return the name of the book
	} 
// ------------------- End Get Name Method -------------------
	
// ------------------- Get Author Method -------------------
	// Method that returns the author
	public Author getAuthor()
	{
		return author;													// Return the author of the book
	} 
// ------------------- End Get Author Method -------------------
	
// ------------------- Get Price Method -------------------
	// Method that returns the price
	public double getPrice()
	{
		return price;													// Return the price of the book
	} 
// ------------------- End Get Price Method -------------------
	
// ------------------- To String Method -------------------
	// Method that converts the book's data to a String
	public String toString()
	{
		return "Book name: " + name + "\nBy: " + author;				// Return the book's data 
	} 
// ------------------- End To String Method -------------------
} // End of class Book
