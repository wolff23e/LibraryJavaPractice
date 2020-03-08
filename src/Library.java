/** @author Emma Wolff, Assignment 3 
 * Data Structures
 * @version Feb 26 */


public class Library {
  /** return all of the same type - getAllOfType
   * 
   * 
   * @param ofResources takes an array of  Resource objects and 
*
* @param astring for type
* @return new array of same type
*/ 
public static Resource[] getAllOfType(Resource[] ofResources, String astring) { 
    //if they passed in nothing
    if(ofResources[0] == null){
      nullLibrary(ofResources);
    }
  // loop through each object to see if type matches
  int typeCount = 0;
  for (int i = 0; i < ofResources.length; i++) {
    if (ofResources[i].getType() == astring) {
      typeCount = typeCount + 1;
    }
  }
  int j = 0;
  Resource[] newArray = new Resource[typeCount];
  for (int i = 0; i < ofResources.length; i++) {  
    if (ofResources[i].getType() == astring) {
        newArray[j] = ofResources[i];
        j = j+1;
    }
  }
  // returns a smaller array of Resource objects.
  return newArray;
}


  /** return all checked out - getAllCheckedOut(
   * 
   * 
   * @param ofResources takes an array of  Resource objects 
* @return returns a smaller array of Resource objects.
*/ 

public static Resource[] getAllCheckedOut(Resource[] ofResources) { 
  //if they passed in nothing
  if(ofResources[0] == null){
    nullLibrary(ofResources);
  }
  // loop through each object to see if type matches
  int checkedOutCount = 0;
  // Because you’re using arrays, you’ll need to first count
  /// how many items are checked out,
  for (int i = 0; i < ofResources.length; i++) {
    if (((Resource) ofResources[i]).getBookStatus() == true) {
      checkedOutCount = checkedOutCount + 1;
    }
  }
  // then create an array of
  // that size,
  Resource[] checkedArray = new Resource[checkedOutCount];
  int j = 0;
  for (int i = 0; i < ofResources.length; i++) {
      // then copy all checked-out items into the new
      // array.
      if (((Resource) ofResources[i]).getBookStatus() == true) {
        checkedArray[j] = ofResources[i];
        j = j+1;
      }
  }
  // returns a smaller array of Resource objects.
  return checkedArray;
}

// getAllUserHasCheckedOut, which takes an array of
// Resource objects and a String, and returns a smaller array
// of Resource objects.


  /** return all checked out - getAllUserHasCheckedOut
   * 
   * 
   * @param ofResources takes an array of Resource objects
   * @param astring a String - the user
* @return returns a smaller array of Resource objects representing what user has out
*/ 

public static Resource[] getAllUserHasCheckedOut(Resource[] ofResources, String astring) {  
    //if they passed in nothing
    if(ofResources[0] == null){
      nullLibrary(ofResources);
    }
  // count how many items someone has checked out before
  // loop through each object to see if type matches
  int personOutCount = 0;
  for (int i = 0; i < ofResources.length; i++) {
    if (((Resource) ofResources[i]).whoCheckedOut() == astring) {
      personOutCount = personOutCount + 1;
    }
  }
  // Additionally, you need to figure out what to do if that particular person has
  // nothing checked out.
  Resource[] nothingCheckedOut = new Resource[1];
  if(personOutCount == 0){  
    nothingCheckedOut[0] = new Book(astring, "has nothing checked out.", null, 0, 0,
        null, false);
    return nothingCheckedOut;
  }
    // then create an array of
  // that size,
  Resource[] checkedOutArray = new Resource[personOutCount];
  for (int i = 0; i < ofResources.length; i++) {
    for (int j = 0; j < checkedOutArray.length; j++)
      // then copy all checked-out items into the new
      // array.
      if (((Resource) ofResources[i]).whoCheckedOut() == astring) {
        checkedOutArray[j] = ofResources[i];
      }
  }
  // returns a smaller array of Resource objects.
  return checkedOutArray;
}


//You can’t call a method on an object that’s null, 
//or you’ll get a NullPointerException. A good check 
//to include in all Library methods is testing if a variable
// is null before calling methods on it. The check can be written like so:
//}
//null caller


  /** You can’t call a method on an object that’s null,  - nullLibrary
   * 
   * 
   * @param testThisResource takes an array of Resource objects
* @return returns a smaller array of Resource objects representing what user has out
*/ 

public static Resource[] nullLibrary(Resource[] testThisResource) {
  Resource[] nullPassedIn = new Resource[1];
  if(testThisResource[0] == null){
    nullPassedIn[0] = new Book("You passed in", "an empty Library", null, 0, 0,
      null, false);
  }
  return nullPassedIn;
}
}
