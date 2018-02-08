
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
    private String name;

    //constructor
    public PlayList(String n)
    {
        name = n;
        ArrayList<Song> tunes = new ArrayList<Song>();
    }
    public void shuffle(PlayList p) {
      Song temp;
      int random;
      for(int i = 0; i < p.size(); i++) {
        random = (int)Math.random()*p.size();
        temp = p.set(random,p.get(i));
        p.set(i,temp);
      }
    }
    public void print(PlayList p) {
      //TODO
    }
    public void removeLength(PlayList p,double l) {
      for(int i = 0; i < p.size(); i++) {
        if(p.get(i).getLength()<l) {p.remove(i);i--;}
      }
    }
    public void addSong(PlayList p, Song s) {
      p.add(s);
    }
    public int numberOfSongs(PlayList p) {
      return p.size();
    }
    public double totalLength(PlayList p) {
      double l;
      for(int i = 0; i < p.size(); i++) {
        l += p.get(i).getLength();
      }
      return l;
    }
    public void removeArtist(PlayList p, String a) {
      for(int i = 0; i < p.size(); i++) {
        if(p.get(i).getArist == a) {
          p.remove(i);
          i--;
        }
      }
    }
}
