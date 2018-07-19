public class Song {
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void play() {
        System.out.println("Currently playing...... "
                + toString()
                + ("...... song ended"));
    }

    public String toString() {
        return name + " by " + author;
    }
}
