//Syntaksen for at nedarve fra Media
public class Artikel extends Media {

    //datafields til klassen
    private String forfatter;
    private String artikelTekst;
    private String billede;



    //laver objekt sådan at vi nu kan lave et Video-objekt
    public Artikel(String name, String forfatter) {
        super.setName(name);
        this.forfatter = "Niels";
        this.artikelTekst = "My hovercraft is full of eels";
        this.billede ="c:\\documents and settings\\all users\\hest.jpg";



    }
    public void logToConsol() {
        System.out.println(super.getName() + "Artikel");
    }

}


