/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan20targetsaldotabungan;

/**
 *
 * @author 
 * Nama  : Muhammad Rakha Firdaus
 * NIM   : 10118059
 * Kelas : IF-2
 */
public class PBO210118059Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        double saldoAwal = 3500000;
        
        do {
            saldoAwal = saldoAwal + (int)(saldoAwal*0.08);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldoAwal);
            i++;
        } while(saldoAwal<=6000000);
        System.out.println("(Developed by mrakhaf)");
    }
    
    
}
