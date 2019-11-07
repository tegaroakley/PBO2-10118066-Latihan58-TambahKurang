/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan58.tambahkurang;

/**
 *
 * @author PC
 */
public class SelisihBilangan extends Bilangan{
    
    public void tampilSelisih(){
        int selisih;
        selisih = getX()-getY();
        System.out.println("Hasil Selisih = " + selisih);
    }
}
