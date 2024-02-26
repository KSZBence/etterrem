/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.util.ArrayList;

/**
 *
 * @author kunszekely.bence
 */
public class Asztal {
    private String szin;
    private ArrayList<Etel> rendelesek;

    public Asztal(String szin) {
        this(szin, new ArrayList<>());
    }
    
    
    public Asztal(String szin, ArrayList<Etel> rendelesek) {
        this.szin = szin;
        this.rendelesek = rendelesek;
    }
    
    public void etelHozzaad(Etel etel){
        rendelesek.add(etel);
    }
    
}
