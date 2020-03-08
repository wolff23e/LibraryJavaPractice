/** @author Emma Wolff, Assignment 3 
 * Data Structures
 * @version Feb 26 */

//Be sure to write getters and setters for each! #done
public class Journal extends Resource {
// Range of years published
 protected int rangeYears;
 //How often they are published (publishing frequency -- 
//could be monthly, quarterly, etc.)
  protected String frequency;
  ////but all Journals are assumed to be electronic
  protected boolean trueIfElectronic = true;

  protected int year;
/** constructor for journal 
 */ 
  public Journal(String title, String publisher,int year, int rangeYears, String frequency){
    super(title, publisher);
    this.rangeYears = rangeYears;
    this.frequency = frequency;
  }


  /** year published  getter  */ 
  public int getYear() {
    return year;
  }
/** year published  setter @param Yearss for the year */ 
  public void setYear(int Yearss){
    year = Yearss;
  }


   /** Range of years published getter*/ 
  public int getRangeYears() {
    return rangeYears;
  }

   /** Range of years setter @param rangeYearss for the range of years*/
  public void setRangeYears(int rangeYearss){
    rangeYears = rangeYearss;
  }

  /** How often they are published (publishing frequency getter */ 
  public String getfrequency() {
    return frequency;
  }
/** How often they are published (publishing frequency setter @param frequencyPub for the publishing frequency */ 
  public void setfrequency(String frequencyPub){
    frequency = frequencyPub;
  }

@Override
  /** Journal toString override */ 
public String toString(){
    return "Title: " + super.getTitle() + "\n" +"Type: " + super.getType() + "\n" +"Publisher: " + super.getPublisher() + "\n" +"Year range:" + getRangeYears() + "\n" +"Frequency: " + getfrequency() +"\n" + 
      super.elecToString() +"\n" +  super.bookStatusString();
}
}
