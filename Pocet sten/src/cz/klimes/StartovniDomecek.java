package cz.klimes;


public class StartovniDomecek{


    private BarvaFigurky barvaFigurky;
    private int maximalniPocetFigurek;
    private int aktualniPocetFigurek;

    public StartovniDomecek(BarvaFigurky bf, int pocetFigurek) {
      barvaFigurky = bf;
      maximalniPocetFigurek = pocetFigurek;
      aktualniPocetFigurek = pocetFigurek;
    }

    public Figurka getFigurka(){
        if (!jePrazdny()){
            aktualniPocetFigurek--;
            return new Figurka(barvaFigurky);
        }
        return null;
    }


    public BarvaFigurky getBarvaFigurky(){return null;}
    public void VratFigurku(){
        aktualniPocetFigurek++;
    }
    public boolean jePrazdny(){return true;}




}
