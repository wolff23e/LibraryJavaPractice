//Badly commented test code; DO NOT MODIFY
//Author: atayloe
public class LibraryTest{
		public static void main(String[] args){

		Resource[] library = new Resource[12];

		library[0] = new Book("Ancillary Justice", "Ann Leckie", "Orbit",
			409, 2013, "Science Fiction", false);
		library[1] = new Book("Data science for dummies", "Lillian Pierson", 
			"John Wiley and Sons, Inc.", 0, 2017, "Electronic Books", true);
		library[2] = new Book("Madame Récamier : The Biography of a Flirt", 
			"Henry Dwight Sedgwick", "Borodino Books", 265, 2017, "Electronic Books", true);
		library[3] = new Book("Ninefox Gambit", "Yoon Ha Lee", "Solaris",
			317, 2016, "Science fiction", false);
		library[4] = new Book("The tale of Cho Ung : a classic of vengeance, loyalty, and romance", 
			"Sookja Cho", "Columbia University Press", 200, 2018, "Romance Fiction", false);
		library[5] = new Journal("Annual review of criminology", "Annual Reviews", 2018, 0, " Annual");
		library[6] = new Journal("Inks : the journal of the Comics Studies Society", 
			"The Ohio State University Press", 2017, 0, "Three times a year");
		library[7] = new Journal("Tax benefits for adoption", "Dept. of the Treasury, Internal Revenue Service", 
			2002, 2004, " Annual ");
		library[8] = new CD("Anthem", "Matt Haimovitz", "Oxingale Records : Artemis Classics", 
			2003, 69);
		library[9] = new CD("Never mind the bollocks, here’s the Sex Pistols", 
			"Sex Pistols", "Warner Bros", 1977, 37);
		library[10] = new DVD("Horrible Bosses 2", "Warner Home Video", 2015, 108, 
			"Jason Bateman, Charlie Day, Jason Sudeikis, Jennifer Aniston, Jamie Foxx, Chris Pine, Kevin Spacey, Christoph Waltz", 
			"Comedy Films");
		library[11] = new DVD("Sweeney Todd: the demon barber of Fleet Street", 
			"Turner Home Entertainment", 2004, 139, 
			"Angela Lansbury, George Hearn, and the original Broadway cast", "Musicals"); 
		
		library[0].checkOut("Amy Tayloe");
		library[2].checkOut("Valerie Barr");
		library[6].checkOut("Valerie Barr");
		library[11].checkOut("Amy Tayloe");
		library[0].checkIn();    //ask them about this

		// System.out.println();
		// for(int i = 0; i < library.length; i++){
		// 	System.out.println(library[i].toString());
		// 	System.out.println();
		// }

		Resource[] checkedOut = Library.getAllCheckedOut(library);

		System.out.println();
		System.out.println("All checked out:");
		for(int i = 0; i < checkedOut.length; i++){
			System.out.println(checkedOut[i].getTitle()+" ("+checkedOut[i].getType()+")");
		}

		Resource[] checkedOutAmy = Library.getAllUserHasCheckedOut(library, "Amy Tayloe");

		System.out.println();
		System.out.println("All checked out to Amy Tayloe:");
		for(int i = 0; i < checkedOutAmy.length; i++){
			System.out.println(checkedOutAmy[i].getTitle()+" ("+checkedOutAmy[i].getType()+")");
		}

		Resource[] allDVD = Library.getAllOfType(library, "DVD");

		System.out.println();
		System.out.println("All DVDs:");
		for(int i = 0; i < allDVD.length; i++){
			System.out.println(allDVD[i].getTitle()+" ("+allDVD[i].getType()+")");
		}
		
	}
}