/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.awt.List;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 *
 * @author kunszekely.bence
 */
public class Etterem {
    private ArrayList<Asztal> asztalok;
    private ArrayList<Etel> etlap;
 
    
   
    public Etterem() throws IOException {
        ArrayList< String > etelek;
        etelek = (ArrayList<String>) Files.readAllLines(Path.of("C:\\Users\\kunszekely.bence\\Documents\\NetBeansProjects\\Etterem\\etelek.txt"));
        ArrayList< String > rendelesek;
        rendelesek = (ArrayList<String>) Files.readAllLines(Path.of("C:\\Users\\kunszekely.bence\\Documents\\NetBeansProjects\\Etterem\\rendelesek.txt"));
        
        asztalok = new ArrayList<>();
        etlap = new ArrayList<>();
        
        for (int i = 0; i < etelek.size(); i++) {    
            String[] eteltomb = etelek.get(i).split("\\|");
            String etelnev = eteltomb[0];
            
            int etelar = Integer.parseInt(eteltomb[1]);
            etlap.add(new Etel(etelnev, etelar));
        }
        
        String[] asztalnevek = {"Piros", "Zöld", "Kék", "Fehér"};
        int i = 0;
        
        for (int j = 0; j < rendelesek.size(); j++) {
            String sor = rendelesek.get(i);
            if (sor == asztalnevek[i]) {
                Asztal a = new Asztal(sor);
                asztalok.add(a);
                i++;
            } else if (sor.length() > 1) {
                System.out.println(sor);
                
            }
        }
        
    }
    
    
}
