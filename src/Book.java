/** @author Emma Wolff, Assignment 3 
 * Data Structures
 * @version Feb 26 */
public class Book extends Resource {

//Author
  protected String author;
  //Number of pages
  protected int pageNumber;
  //Publication year
  protected int pubYear;
  //Genre
  protected String genre;
  protected boolean trueIfElectronic = false;
  
  /** Book constrcutor */ 
  public Book(String title, String author, String publisher, int pageNumbers, int pubYear, String genre, boolean trueIfElectronic) {
    super(title, publisher);
   author =  this.author;
    this.pageNumber = pageNumbers;
    this.pubYear = pubYear;
    this.genre = genre;   
    this.trueIfElectronic  = trueIfElectronic;
  }

    /** author getters, @return is the author invoked on */ 
  public String getAuthor() {
    return author;
  }

    /** author setter
     * @param setAuthor to define new author passed in */ 
  public void setAuthor(String setAuthor){
    author = setAuthor;
  }


      /** page num  getters */ 
  public int getpageNumbers() {
    return pageNumber;
  }

      /** page num setter @param numPages for number of pages */ 
  public void setpageNumbers(int numPages){
    pageNumber = numPages;
  }
/** /pub year  getter */ 
  public int getPubYear() {
    return pubYear;
  }
/** /pub year setter, setter @param publicationYear for the year */ 
  protected void setPubYear(int publicationYear){
    pubYear = publicationYear;
  }

  /** /genre getter */ 
  protected String getGenre() {
    return genre;
  }

  /** setter @param genreType for the type of genre */ 
  protected void setGenre(String genreType){
    genre = genreType;
  }  

  /** Book tostring */ 
@Override 
  public String toString() { 
  return "Title: " + super.getTitle() + "\n" + "Type: " + super.getType() +"\n" + "Author: " + getAuthor() + "\n" + "Publisher: " + getPublisher()+ "\n" + "Page Count: " + getpageNumbers() + "\n" + "Year Published:" + getPubYear() + "\n" + "Genres: " + getGenre() + "\n" + super.elecToString() + "\n" + super.bookStatusString() ;
}
}
