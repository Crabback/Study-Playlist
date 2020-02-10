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
 * Forward iterator class
 * 
 * @author Zhengjia Mao
 *
 */
public class Playlist implements Iterator<Song> {

  /**
   * private fields shared in this class
   */
  private DoublyLinkedNode<Song> song; // store the passed-in DoublyLinkedNode

  /**
   * Constructor method that initializes the playlist
   * pass in the next node of the iterator
   * 
   * @param head - pass in DoublyLinkedNode
   */
  public Playlist(DoublyLinkedNode<Song> head) {
      this.song = head;
  }

  /**
   * check whether has the next node(the passed-in node)
   * if the node is null, it means the end
   * 
   */
  @Override
  public boolean hasNext() {
    return song != null;
  }

  /**
   * return the passed-in node if there is one
   * move to the next node
   * 
   * @throws NoSuchElementException if there is no more node
   */
  @Override
  public Song next() {
    // detect the exception of having no more song
    if (!hasNext()) {
      throw new NoSuchElementException("no more song");
    } else {
      Song returnSong = song.getData();
      song = song.getNext();
      return returnSong;
    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }
}

