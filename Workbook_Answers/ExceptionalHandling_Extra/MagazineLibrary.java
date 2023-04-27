package Workbook_Answers.ExceptionalHandling_Extra;

import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines; 

    public MagazineLibrary(){
        this.magazines = new ArrayList<Magazine>();
    }

    public Magazine getMagazine(int index){
        return new Magazine(magazines.get(index));
    }

    public void setMagazine(Magazine magazine, int index){
        magazines.set(index, new Magazine(magazine));
    }

    public void addMagazine(Magazine magazine){
        magazines.add(new Magazine(magazine));
    }

    
}
