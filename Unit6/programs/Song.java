
/**
 * Song class with the following methods and attributes:
 * Two private String instance variables representing the song and the artist
 * name
 * A private double instance variable representing the length of the song
 * A constructor that accepts a song, artist, and length as parameters
 * “Getter” methods for all three instance variables
 * A toString() method that prints the current state of the object (i.e. what is
 * stored in the instance variables)
 *
 * @author Kale Miller
 * @version 2 Feb 2018
 */
public class Song
{
    // instance variables
    private String name;
    private String artist;
    private double length;

    // constructor
    public Song(String n, String a, double l)
    {
        name = n;
        artist = a;
        length = l;
    }

    //getters
    public double getLength(Song s) {
      return s.length;
    }
    public String getName(Song s) {
      return s.name;
    }
    public String getArtist(Song s) {
      return s.artist;
    }
    public String toString(Song s) {
      return s.name + " by " + s.artist + " is " + s.length + " long.";
    }
}
