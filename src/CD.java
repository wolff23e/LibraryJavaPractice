/** @author Emma Wolff, Assignment 3 
 * Data Structures
 * @version Feb 26 */
///Recording company (use Publisher field)
public class CD extends Resource{
  public CD(String title, String publisher, String artist, int pubYear,  int Length) {
    super(title, publisher);
    artist =  this.artist;
    pubYear =  this.pubYear;
    Length = this.Length;
  }
 //Artist
  protected String artist;
  //Publication year
  protected int pubYear;
  //Length
  protected int Length;
  //Is it electronic or not: This is not a new field, 
//but all CDs are assumed to be NOT electronic
  protected boolean trueIfElectronic = false;
// Artist getters 

/** setters and getters for artist, setter @param theArtist for the artist */

  public String getArtist() {
    return artist;
  } 
///Artist  setter
public void setArtist(String theArtist){
  artist = theArtist;
}

/** setters and getters for Publication year, setter @param Yearss for the year */
  //Publication year getters 
 public int getYears() {
  return pubYear;
}
 //Publication year setter
public void setYear(int Yearss){
  pubYear = Yearss;
}
 ////Length getters 


 /** setters and getters for Length, setter @param Lengths for the length )*/
 public int getLength() {
  return Length;
}
///Length setter
public void setLength(int Lengths){
  Length = Lengths;
}

  @Override
   /** @Override to string for CD*/
  public String toString(){
      return "Title: " + title + "\n" +"Type: " + super.getType() + "\n" +"Recording Company: " + super.getPublisher() + "\n" +"Artist: " + getArtist() + "\n" +"Length: (min)" + getLength() + "\n" +"Year Published: " + getYears() +"\n" +
       super.elecToString() +"\n" + super.whoCheckedOut();
  }
}

