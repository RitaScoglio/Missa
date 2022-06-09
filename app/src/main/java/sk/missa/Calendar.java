package sk.missa;

public class Calendar {

    private String konDen;
    private String menoSvatca;
    private String slavenie;
    private String farba;
    private int day;
    private int tyzden;
    private String ID;
    private String obdobie;

    //den v kalendari
    Calendar(String konDen) {
        this.konDen = konDen;
    }
    //jednotlive dni v kalendari
    Calendar(String menoSvatca, String slavenie, String farba, int day, int tyzden, String ID, String obdobie) {
        this.menoSvatca = menoSvatca;
        this.slavenie = slavenie;
        this.farba = farba;
        this.day = day;
        this.tyzden = tyzden;
        this.ID = ID;
        this.obdobie = obdobie;
    }

    String getKonDen() {
        return this.konDen;
    }

    public String getMenoSvatca() {
        return this.menoSvatca;
    }

    public void setMenoSvatca(String menoSvatca) {
        this.menoSvatca = menoSvatca;
    }

    public String getSlavenie() {
        return this.slavenie;
    }

    String getFarba() {
        return this.farba;
    }

    int getDay() {
        return this.day;
    }

    public int getTyzden() { return this.tyzden; }

    public String getID() {
        return this.ID;
    }

    public String getObdobie(){
        return this.obdobie;
    }



}
