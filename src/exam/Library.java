package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Library {
	//Part 3: Implement the Library
	
	//You are expected to use this List to store items
	private List<Readable> items;
	
	public static void main(String[] args) {
		
		//Please do not modify this code.
		//There is space provided for you to add your
		//own tests at the end of the method
		
		//Create the library and some items
		Library lib = new Library("Mid-County Branch");
		Magazine mag1 = new Magazine("Thrasher, March 2021", 87);
		Magazine mag2 = new Magazine("Highlights for Kids, June 2021", 21);
		Book book1 = new Book("1984", "George Orwell", 283);
		Book book2 = new Book("House of Leaves", "Mark Danielewski", 709);
		
		//should be zero
		System.out.println(lib.getNumPages());
		System.out.println(lib.getNumArticles());


		//should show magazine 1 with the following information:
		/*
		  	Thrasher, March 2021, 87 pages
			page 2, How to do a kickflip
			page 57, How to explain skateboarding to your grandma
		 */
		mag1.addArticle(2, "How to do a kickflip");
		mag1.addArticle(57, "How to explain skateboarding to your grandma");
		System.out.println(mag1);
		
		//add magazine 1
		lib.addItem(mag1);
		
		//should be 87
		System.out.println(lib.getNumPages());
		
		//should be 2
		System.out.println(lib.getNumArticles());
	
		//should show book 1 with the following information:
		//'1984' by George Orwell, 283 pages
		System.out.println(book1);
		
		//add book 1
		lib.addItem(book1);
		
		//should be 370
		System.out.println(lib.getNumPages());
		
		//should be 2
		System.out.println(lib.getNumArticles());
	
		//add the other book and magazine
		mag2.addArticle(2, "Color the Pony!");
		mag2.addArticle(4, "Connect the Dots!");
		mag2.addArticle(7, "Broccoli is Yummy!");
		lib.addItem(mag2);;
		lib.addItem(book2);
		
		//should be 1100
		System.out.println(lib.getNumPages());
		
		//should be 5
		System.out.println(lib.getNumArticles());
		
		//Should display the following:
		
		/*
		Items currently at Mid-County Branch
		Magazine: Thrasher, March 2021, 87 pages
		page 2, How to do a kickflip
		page 57, How to explain skateboarding to your grandma
		
		======================
		Book: '1984' by George Orwell, 283 pages
		======================
		Magazine: Highlights for Kids, June 2021, 21 pages
		page 2, Color the Pony!
		page 4, Connect the Dots!
		page 7, Broccoli is Yummy!
		
		======================
		Book: 'House of Leaves' by Mark Danielewski, 709 pages
		======================
		*/
		lib.printAllItems();
		
		//If you wish to include additional tests for your code,
		//please put them below.
		
		
		
		
		
	}
}
