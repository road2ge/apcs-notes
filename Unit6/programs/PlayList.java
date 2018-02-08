
/**
 * Write a description of class PlayList here.
 *
 * @author Kale Miller
 * @version 2 Feb 2018
 */
 import java.util.*;
public class PlayList
{
    //instance vars
    private ArrayList<Song> tunes;
    private String name;

    //constructor
    public PlayList(String n)
    {
        name = n;
        tunes = new ArrayList<Song>();
    }
    public void shuffle() {
      Song temp;
      int random;
      for(int i = 0; i < tunes.size(); i++) {
        random = (int)Math.random()*tunes.size();
        temp = tunes.set(random,tunes.get(i));
        tunes.set(i,temp);
      }
    }
    public void print() {
      for(int i = 0; i < tunes.size(); i++)
        {
            System.out.println("Song Title: "+tunes.get(i).getName()+" by "+tunes.get(i).getArtist()+
                             "\nSong Length: "+tunes.get(i).getLength()+"\n");
        }
    }
    public void removeLength(double l) {
      for(int i = 0; i < tunes.size(); i++) {
        if(tunes.get(i).getLength()<l) {tunes.remove(i);i--;}
      }
    }
    public void addSong(Song s) {
      tunes.add(s);
    }
    public int numberOfSongs() {
      return tunes.size();
    }
    public double totalLength() {
      double l = 0;
      for(int i = 0; i < tunes.size(); i++) {
        l += tunes.get(i).getLength();
      }
      return l;
    }
    /*public void removeArtist(String a) {
      for(int i = 0; i < tunes.size(); i++) {
        if(tunes.get(i).getArtist().equals(a)) {
          tunes.remove(i);
          i--;
        }
      }
    }*/
    public void removeArtist(String a)
    {
        for(int i = 0; i < tunes.size(); i++)
        {
            if(tunes.get(i).getArtist().equals(a))
            {
                tunes.remove(i);
                i--;
            }
        }
    }
}
