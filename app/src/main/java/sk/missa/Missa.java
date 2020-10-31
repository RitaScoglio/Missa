package sk.missa;

public class Missa {

    private String sekcia, nadpis, suradnice, citat, text, citat_prosby, text_prosby, text_center, text_small;
    private boolean zvonec, vypisHtml, italic, bar;
    private int otvor, medzera, indexAlebo, index;

    //rôzne možnosti výpisu textu v misáli
    //citania, modlitby, spevy
    Missa(String sekcia, String nadpis, String suradnice, String citat, String text, boolean vypisHtml, int otvor){
        this.sekcia = sekcia;
        this.nadpis = nadpis;
        this.suradnice = suradnice;
        this.citat = citat;
        this.text = text;
        this.vypisHtml = vypisHtml;
        this.otvor = otvor;
    }

    //prosby
    Missa(String sekcia, String text, String citat_prosby, String text_prosby, boolean vypisHtml){
        this.sekcia = sekcia;
        this.text = text;
        this.citat_prosby = citat_prosby;
        this.text_prosby = text_prosby;
        this.vypisHtml = vypisHtml;
    }

    //prefacia
    Missa(String sekcia, String text_center, String text, boolean vypisHtml){
        this.sekcia = sekcia;
        this.text_center = text_center;
        this.text = text;
        this.vypisHtml = vypisHtml;
    }

    //tiche modlitby v EM
    Missa(String text_small, String text, boolean vypisHtml){
        this.text_small = text_small;
        this.text = text;
        this.vypisHtml = vypisHtml;
    }

    //vyskakovacie okna
    Missa(String text, boolean vypisHtml, int otvor){
        this.text = text;
        this.vypisHtml = vypisHtml;
        this.otvor = otvor;
    }

    //vyskakovacie okna - Trojdnie
    Missa(String text, String nadpis, String suradnice, boolean vypisHtml, int index, int otvor){
        this.text = text;
        this.nadpis = nadpis;
        this.suradnice = suradnice;
        this.vypisHtml = vypisHtml;
        this.index = index;
        this.otvor = otvor;
    }

    //aleboCitania
    Missa(String text, boolean vypisHtml, int otvor, int indexAlebo){
        this.text = text;
        this.vypisHtml = vypisHtml;
        this.otvor = otvor;
        this.indexAlebo = indexAlebo;
    }

    //zvonceky
    Missa(boolean zvonec){
        this.zvonec = zvonec;
    }

    //medzera alebo bar
    Missa(int num){
        if (num == 5)
            this.bar = true;
        else
            this.medzera = num;
    }

    //tiche modlitby knaza
    Missa(String sekcia, String text_small, String text){
        this.sekcia = sekcia;
        this.text_small = text_small;
        this.text = text;
        this.italic = true;
    }


    String getSekcia() {
        return this.sekcia;
    }

    public String getNadpis() {
        return this.nadpis;
    }

    String getSuradnice() {
        return this.suradnice;
    }

    String getCitat() {
        return this.citat;
    }

    String getText_small() {
        return this.text_small;
    }

    String getText_center() {
        return this.text_center;
    }

    public String getText() {
        return this.text;
    }

    String getCitat_prosby() {
        return this.citat_prosby;
    }

    String getText_prosby() {
        return this.text_prosby;
    }

    boolean getVypisHtml(){
        return this.vypisHtml;
    }

    public int getOtvor() {
        return this.otvor;
    }

    int getMedzera() {
        return this.medzera;
    }

    int getIndexAlebo() {
        return this.indexAlebo;
    }

    int getIndex() {
        return this.index;
    }

    boolean getZvonec() {
        return this.zvonec;
    }

    boolean getItalic() {
        return this.italic;
    }

    boolean getBar(){
        return this.bar;
    }

}
