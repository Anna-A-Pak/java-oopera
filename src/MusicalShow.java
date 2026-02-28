import java.util.ArrayList;

public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    @Override
    public String toString() {
        return "MusicalShow{" +
                "librettoText='" + librettoText + '\'' +
                '}';
    }
}
