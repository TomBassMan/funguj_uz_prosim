package cz.klimes;

import java.util.ArrayList;
import java.util.List;

public class CilovyDomecek {
    private BarvaFigurky barvaFigurek;
    List<Figurka> figurky;

    public CilovyDomecek(BarvaFigurky barvaFigurek, int pocetFigurek) {
        this.barvaFigurek = barvaFigurek;
        figurky = new ArrayList<>();
        for (int i = 0; i < pocetFigurek; i++){
            figurky.add(null);
        }
    }

    public boolean jeVolno(int indexPolicka){
        return figurky.get(indexPolicka)==null;
    }
}
