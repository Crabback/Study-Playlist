import java.util.Iterator;

public class Tester {


  public static void main(String[] args) {
//    SongCollection s = new SongCollection();
//    analysisMethodA(s);
//    analysisMethodB(s);
//    analysisMethodC(s);
//    DoublyLinkedNode a = new DoublyLinkedNode(new Song("C is for Cookie.", "Cookie Monster"));
//    DoublyLinkedNode b = new DoublyLinkedNode(new Song("Rubber Duckie.", "Ernie"));
//    DoublyLinkedNode c = new DoublyLinkedNode(new Song("Elmo's Song.", "Elmo"));
//    a.setNext(b);
//    b.setPrevious(a);
//    System.out.println(a.getNext().getData());
//    System.out.println(b.getPrevious().getData());
    SongCollection songs = new SongCollection();
//    SongCollection copy = new SongCollection();
    songs.add(new Song("C is for Cookie.", "Cookie Monster"));
//    System.out.println(songs.remove());
    songs.add(new Song("Rubber Duckie.", "Ernie"));
//    songs.add(new Song("Elmo's Song.", "Elmo"));
//    for (Song song : songs)
//      copy.add(song);
//    for (Song song : songs)
//      System.out.println(song);
    Iterator<Song> playlist = songs.iterator();
    for (int i = 0; i < 2; i++)
      if (playlist.hasNext())
        System.out.println(playlist.next());

  }

}
