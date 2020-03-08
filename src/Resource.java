/** @author Emma Wolff, Assignment 3 
 * Data Structures
 * @version Feb 26 */

public abstract class Resource {
  //add absteact back later
  protected String title;
  protected String publisher;
  protected boolean trueIfElectronic;
  //All Resources start as not checked out.
  protected boolean trueIfCheckedOut = false;
  protected String whoCheckedOut;

//if we said to use getter you should get it = 
//a constructor that requires the following information be 
//passed in when a new Resource is created: title, 
//publisher, type, if it’s electronic or not.    DONE

/** Resource constructor */ 
public Resource(String title, String publisher) {
  this.title = title;
  this.publisher = publisher;
}

/** getters for Title, */ 
public String getTitle() {
  return title;
} 

/** setters for Title, @param theTitle */ 
public void setTitle(String theTitle) {
  title = theTitle;
}

protected String type;
/** getters for Type, */ 
public String getType() {
  return this.getClass().getSimpleName();
}

/** setters for Type, @param theType */ 
public void setType(String theType) {
  type = theType;
}


/** getters for publisher */ 
public String getPublisher() {
  return publisher;
}

/** setters for publisher  @param thePublisher  */ 
public void setPublisher(String thePublisher) {
  publisher = thePublisher;
}


/** getter Is it checked-out or not   */ 
public boolean getBookStatus() {
  return trueIfCheckedOut;
}


/** setters for bookstatus   @param ifavail */ 
public void setBookStatus(boolean ifavail) {
  trueIfCheckedOut = ifavail;
}


/** getter Who it is checked-out to  */ 
public String whoCheckedOut() {
  return whoCheckedOut;
}

/** setters for Who it is checked-out to  */   
public void setWhoCheckedOut(String userName) {
  whoCheckedOut = userName;
}

/** /to change boolean for toString methods  */ 
public String elecToString(){
  if(trueIfElectronic == true){
    return "Electronic";
  } else {
    return "Physical";
  }
}



/** avaibible or checked out to xxx who for toString methods */ 
public String bookStatusString(){
  if(trueIfCheckedOut == true){
    return "Checked out to" + this.whoCheckedOut;
  } else{
    return "Availible";
  }
}


/** /a toString method that returns a 
//string containing the variable information in an 
//easy-to-read way. */ 
public String toString(){
  return "Title: " + getTitle() + "\n" + "Type: " + getType() + "\n" + " Publisher: " + getPublisher() + "\n" + elecToString() +"\n" +  bookStatusString();
}
/** //a method to check out a resource. Checking out 
//a resource should require a string of who it’s going to,  @param checkerOuter is who is checking it out*/ 
public void checkOut(String checkerOuter){   ///should this be void?
  // set the is-checked-out variable to true,
  trueIfCheckedOut = true;
  // checked out to to the appropriate name. 
  whoCheckedOut = checkerOuter;
}


/** a method to check in a resource.   */ 
public void checkIn(){
  //set the is-checked-out variable to 
//false
  trueIfCheckedOut = false;
  //who it’s checked out by to null; 
  whoCheckedOut = null;
}
}