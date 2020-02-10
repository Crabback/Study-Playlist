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
 * An instance of this class represents a single node within a doubly linked list.
 * 
 * @author Zhengjia Mao
 *
 * @param <T>
 */
public class DoublyLinkedNode<T> {

  /**
   * private fields shared in this class
   */
  private T data; // data field of this DoublyLinkedNode
  private DoublyLinkedNode<T> next; // link to the next DoublyLinkedNode
  private DoublyLinkedNode<T> previous; // link to the previous DoublyLinkedNode

  /**
   * Initializes a new node with the specified information.
   * 
   * @param previous - node, which comes before this node in a doubly linked list
   * @param data     - to be stored within this node
   * @param next     - node, which comes after this node in a doubly linked list
   * @throws java.lang.IllegalArgumentException - when data is a null reference
   */
  public DoublyLinkedNode(DoublyLinkedNode<T> previous, T data, DoublyLinkedNode<T> next) {
    if (data == null) {
      throw new IllegalArgumentException("null data");
    } else {
      this.data = data;
      this.next = next;
      this.previous = previous;
    }
  }

  /**
   * Initialize a new node with the specified data, and null next and previous reference.
   * 
   * @param data - to be stored within this node
   * @throws java.lang.IllegalArgumentException - when data is a null reference
   */
  public DoublyLinkedNode(T data) {
    if (data == null) {
      throw new IllegalArgumentException("null data");
    } else {
      this.data = data;
      this.next = null;
      this.previous = null;
    }
  }

  /**
   * Accessor method for this node's data.
   * 
   * @return the data stored within this node.
   */
  public T getData() {
    return data;
  }

  /**
   * Accessor method for this node's next node reference.
   * 
   * @return reference to the node that comes after this one in the list, or null when this is the
   *         last node in that list
   */
  public DoublyLinkedNode<T> getNext() {
    return next;
  }

  /**
   * Mutator method for this node's next node reference.
   * 
   * @param next - node, which comes after this node in a doubly linked list
   */
  public void setNext(DoublyLinkedNode<T> next) {
    this.next = next;
  }

  /**
   * Accessor method for this node's previous node reference.
   * 
   * @return reference to the node that comes before this one in the list or null when this is the
   *         first node in that list
   */
  public DoublyLinkedNode<T> getPrevious() {
    return previous;
  }

  /**
   * Mutator method for this node's previous node reference.
   * 
   * @param previous - node, which comes before this node in a doubly linked list
   */
  public void setPrevious(DoublyLinkedNode<T> previous) {
    this.previous = previous;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
