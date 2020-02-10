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

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class is a iterable doubly linked list of Song objects
 * 
 * @author Zhengjia Mao
 *
 */
public class SongCollection implements Iterable<Song> {

  /**
   * private fields shared in this class
   */
  private DoublyLinkedNode<Song> head; // head of the collection
  private DoublyLinkedNode<Song> tail; // tail of the collection
  private boolean playDirectionForward; // the direction of playing

  /**
   * Initializes a new doubly linked list SongCollection
   */
  public SongCollection() {
    head = null;
    tail = null;
  }

  /**
   * This method adds a song to the end/tail of this doubly linked list
   * 
   * @param song - Song object pass in
   * @throws NullPointerException when song is null
   */
  public void add(Song song) {// adds song to the end/tail of this doubly linked list
    // when song is null, throws a NullPointerException
    if (song == null) {
      throw new NullPointerException("null song");
    }
    // convert the Song object to the DoublyLinkedNode object
    DoublyLinkedNode<Song> s = new DoublyLinkedNode<Song>(song);
    // if list is empty, add the node as both head and tail
    if (head == null) {
      head = s;
      tail = head;
    } else {
      // append the node after tail, and set it as new tail
      tail.setNext(s);
      s.setPrevious(tail);
      tail = s;
    }
  }

  /**
   * This method removes and returns song from the front/head of this list
   * 
   * @return the removed Song object
   * @throws NoSuchElementException if the list is empty
   */
  public Song remove() {// removes and returns song from the front/head of this list
    // when list is empty, throws a NoSuchElementException
    if (head == null) {
      throw new NoSuchElementException("empty list");
    }
    // save the content of the original head
    DoublyLinkedNode<Song> returnSong = head;
    // if only one element in the list, clear it
    if (head.getNext() == null) {
      head = null;
      tail = null;
      return returnSong.getData();
    } else {
      // remove the original head and set the second element as new head
      DoublyLinkedNode<Song> surNode = head.getNext();
      surNode.setPrevious(null);
      head = surNode;
      return returnSong.getData();
    }
  }

  /**
   * Mutator method that sets up the direction of playing
   * 
   * @param isForward - direction of playing
   */
  public void setPlayDirection(boolean isForward) {
    playDirectionForward = isForward;
  }

  /**
   * Iterator method
   */
  @Override
  public Iterator<Song> iterator() {
    if (playDirectionForward) {
      return new Playlist(head);
    } else {
      return new ReversePlaylist(tail);
    }
  }

  ///////////////////////////////////////////////////////////////////////////////////
  // For each of the following big-O time complexity analyses, consider the problem
  // size to be the number of Songs that are stored within the argument songs, when
  // the method is first called.
  //
  // For analysisMethodA, the big-O time complexity is ___O(1)_____.
  //
  // For analysisMethodB, the big-O time complexity is ___O(N)_____.
  //
  // For analysisMethodC, the big-O time complexity is ___O(1)_____.
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Add three new Songs as DoublyLinkedNodes to the SongCollection
   * 
   * @param songs - a SongCollection object
   */
  public static void analysisMethodA(SongCollection songs) { // f(x) = 3, O(1)
    songs.add(new Song("C is for Cookie.", "Cookie Monster")); // O(1)
    songs.add(new Song("Rubber Duckie.", "Ernie")); // O(1)
    songs.add(new Song("Elmo's Song.", "Elmo")); // O(1)
  }

  /**
   * Make a copy of the SongCollection, and copy each element in the linkedlist to the copied
   * linkedlist, then print out each element in the copied linkedlist
   * 
   * @param songs - the SongCollection object
   */
  public static void analysisMethodB(SongCollection songs) { // f(x) = 1 + 2N + 2N , O(N)
    SongCollection copy = new SongCollection(); // O(1)
    for (Song song : songs) // N*O(1)
      copy.add(song); // O(1)
    for (Song song : copy) // N*O(1)
      System.out.println(song); // O(1)
  }

  /**
   * Iterate through the SongCollection, and print out each element in the SongCollection
   * 
   * @param songs - the SongCollection object
   */
  public static void analysisMethodC(SongCollection songs) { // f(x) = 3 + 1000*2*2, O(1)
    Iterator<Song> playlist = songs.iterator(); // O(1)
    for (int i = 0; i < 1000; i++) // 1 + 2*1000 + 1
      if (playlist.hasNext()) // O(1)
        System.out.println(playlist.next()); // O(1)
  }

}
