package homework1.model;

public class ArtAlbum extends Book{ //inheritance
    private String paperQuality; //encapsulation

    public ArtAlbum() {}

    public ArtAlbum(String name, int noOfPages, String paperQuality) {
        super(name, noOfPages);
        this.paperQuality = paperQuality;
    }

    //encapsulation
    public String getPaperQuality() {
        return paperQuality;
    }
    //encapsulation
    public void setPaperQuality(String newPaperQuality) {
        paperQuality = newPaperQuality;
    }

    public String toString() {
        return "name = " + getName() + ", noOfPages = " + getNoOfPages() + ", paperQuality = " + getPaperQuality();
    }
}
