package book_application;

import book.Author;
import book.Book;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: BookApplication
 * Language: Java
 * Date: 10/2/17
 * Description: This program tests the functionality of the Book class.
 */

// This class tests the Book class 
public class BookApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String [] args) 
	{
		System.out.println("***************************************** Book with One Author: *******************************************");
		// Instantiate author information
		Author authorCollins = new Author("William Collins", "collinsw@lafayette.edu", 'M');
		
		// Instantiate book information
		Book dataStructuresBook = new Book("Data Structures and the Java Collections Framework", authorCollins, 112.89);
		
		// Print out the author and book
		System.out.println(dataStructuresBook);
		System.out.println("*********************************************************************************************\n");
		
		// Change the authors email
		dataStructuresBook.getAuthor().setEmail("collinsw@cs.lafayette.edu");
		
		// Print out the updated information
		System.out.println("Updated Author's Email Address: ");
		System.out.println("*********************************************************************************************");
		System.out.println(dataStructuresBook);
		System.out.println("*********************************************************************************************\n");
	} 
// ------------------- End Main Method -------------------
} // End of class BookApplication

