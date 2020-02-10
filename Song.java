//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: P07 Study Playlist
// Files: Song.java, DoublyLinkedNode.java, SongCollection.java, Playlist.java, ReversePlaylist.java
// Course: CS 300
//
// Author: Zhengjia Mao
// Email: zmao27@wisc.edu
// Lecturer's Name: Gary DAHL
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name: NONE
// Partner Email: NONE
// Partner Lecturer's Name: NONE
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// _YES__ Write-up states that pair programming is allowed for this assignment.
// _YES__ We have both read and understand the course Pair Programming Policy.
// _YES__ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates,
// strangers, and others do. If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons: ULC tutors
// Online Sources: NONE
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

/**
 * An instances of this class represents a single song.
 * 
 * @author Zhengjia Mao
 *
 */
public class Song {

  /**
   * private fields shared in this class
   */
  private String title; // title information of this Song object
  private String artist; // artist information of this Song object

  /**
   * Initializes a new song with the specified information.
   * 
   * @param title  - or name of this new song
   * @param artist - or musician who performs this song
   */
  public Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }

  /**
   * Returns a string representation of this song. This string should be formatted as follows:
   * "TITLE by ARTIST", where this song's title and artist are used in place of the TITLE and ARTIST
   * place holders.
   * 
   * @return string representation of this song
   */
  @Override
  public String toString() {
    return title + " by " + artist;
  }

  /**
   * Returns true when this song's title and artist strings contain the same contents as the other
   * song's title and artist strings, and false otherwise. Note that this method takes an Object
   * rather than a Song argument, so that it Overrides Object.equals(Object). If an object that is
   * not an instance of Song is ever passed to this method, it should return false.
   * 
   * @param other - Song object to compare this object to
   * @return true when the two songs have matching title and artist
   */
  @Override
  public boolean equals(Object other) {
    if (other instanceof Song != true) {
      return false;
    }
    return toString().equals(other.toString());
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
