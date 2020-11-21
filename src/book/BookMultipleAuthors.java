package book;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: BookMultipleAuthors
 * Language: Java
 * Date: 10/2/17
 * Description: This class contains attributes that belong to books that have multiple authors and algorithms to modify the attributes.
 */

// This class contains attributes that belong to a book with many authors
public class BookMultipleAuthors
{
	// Instance variables
	private String name;																	// Book's name
	private Author [] manyAuthors;															// Book's multiple authors
	private double price;																	// Book's sales price
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Name, Sales Price, Authors 
	public BookMultipleAuthors(String name, double price, Author [] manyAuthors)
	{
		// Instantiate properties with parameter values 
		this.name = name;
		this.price = price;
		this.manyAuthors = new Author[manyAuthors.length];									// Instantiate authors
		
		for (int i = 0; i < manyAuthors.length; i++)										// Loop through each author
		{
			this.manyAuthors[i] = manyAuthors[i];											// Instantiate the author
		} 
	} 
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Print Author's Name's Method -------------------
	// Method that prints all of the authors names
	public void printAuthorsNames()
	{	
		String authorsNames = "";
		
		for (int i = 0; i < manyAuthors.length; i++)										// For each author
		{
			authorsNames += manyAuthors[i].getNameFormatted();								// Concatenate authors' name's
		}
		
		System.out.println(authorsNames);													// Print authors' name's
	}
// ------------------- End Print Author's Name's Method -------------------
	
// ------------------- Get Author's Name's Method -------------------
	// Method that returns all of the authors names
	public String getAuthorsNames()
	{	
		String authorsNames = "";
		
		for (int i = 0; i < manyAuthors.length; i++)										// For each author
		{
			authorsNames += manyAuthors[i].getNameFormatted();								// Concatenate authors' name's
		}
		
		return authorsNames;																// Return authors' name's
	}	
// ------------------- End Get Author's Name's Method -------------------
	
// ------------------- To String Method -------------------
	// Method that converts the books with multiple authors data to a String
	public String toString()
	{
		return "Book name: " + name + "\nPrice: " + price + "\nBy:\n" + getAuthorsNames();	// Return books with multiple authors data 
	}
// ------------------- End To String Method -------------------
} // End of class BookMultipleAuthors