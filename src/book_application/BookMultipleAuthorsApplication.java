package book_application;

import book.Author;
import book.BookMultipleAuthors;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: BookMultipleAuthorsApplication
 * Language: Java
 * Date: 10/2/17
 * Description: This program tests the functionality of the BookMultipleAuthors class.
 */

// This class tests the BookMultipleAuthorsClass
public class BookMultipleAuthorsApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String [] args)
	{
		System.out.println("***************************************** Book with Multiple Authors: *******************************************");
		// Instantiate information for the 3 authors
		Author authorMcLaughlin = new Author("Brett McLaughlin", "brett@oreilly.com", 'M');
		Author authorPolice = new Author("Gary Police", "gpolice@cs.wpi.edu", 'M');
		Author authorWest = new Author("David West", "dwest@ivarjacobson.com", 'M');
		
		// Instantiate the array of authors
		Author [] multipleAuthors = {authorMcLaughlin, authorPolice, authorWest};

		// Create a version 2 of the book that allows for multiple authors
		BookMultipleAuthors objectOrientatedBook = new BookMultipleAuthors("Head First Object-Orientated Analysis & Design", 59.99, multipleAuthors);
		
		// Print out the name of the book, price of it, and number of authors associated with the book
		System.out.println(objectOrientatedBook);
		System.out.println("*********************************************************************************************\n");
		
		// Print out the authors names
		System.out.println("Printing Out Authors' Name's: ");
		System.out.println("*********************************************************************************************");
		objectOrientatedBook.printAuthorsNames();
		System.out.println("*********************************************************************************************\n");
	} 
// ------------------- End Main Method -------------------
} // End of class BookMultipleAuthorsApplication

