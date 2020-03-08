/** @author Emma Wolff, Assignment 3 
 * Data Structures
 * @version Feb 26 */

// DVD.java specific fields are: 
///Be sure to write getters and setters for each!


public class DVD extends Resource {
    // Year published
    protected int Year;
    //Length
    protected int length;
    //Performers
    protected String Performers;
    //Genre (pick one)
    protected String Genre;
    //but all DVDs are assumed to be NOT electronic
    protected boolean trueIfElectronic = false;


  /** DVD constructor */ 
  public DVD(String title, String publisher, int length, int Year, String Performers, String Genre) {
    super(title, publisher);
    this.length = length;
     this.Year = Year;
    this.Genre = Genre;
  }

   /** Year published published getters*/ 
  public int getYears() {
    return Year;
  }

   /** Year published setter */ 
  public void setYear(int Yearss){
    Year = Yearss;
  }

  /** Length  getter */ 
  public int getLength() {
    return length;
  }
/** Length  setter @param Lengths for new value */ 
  public void setLength(int Lengths){
    length = Lengths;
  }  


  /** /Performer getters  */ 
  public String getPerformer() {
    return Performers;
  }
 /** /Performer setter @param Performers */ 
  public void setPerformers(String Performerss){
    Performers = Performerss;
  }

   /** Genre getters  */ 
  public String getGenre() {
    return Genre;
  }

      /** Genre (pick one)  setter @param Genres */ 
  public void setYear(String Genres){
    Genre = Genres;
  }


  @Override
    /** DVD tostring override */ 
  public String toString(){
      return "Title: " + super.getTitle() + "\n" +"Type: " + super.getType() + "\n" +"Publisher: " + super.getPublisher() + "\n" +"Length: (min)" + getLength() + "\n" +"Year Published: " + getYears() +"\n" + "Performers: " + getPerformer() +"\n" + "Genre: " + getGenre() + "\n" + super.elecToString()+"\n" + super.whoCheckedOut();
  }
}
