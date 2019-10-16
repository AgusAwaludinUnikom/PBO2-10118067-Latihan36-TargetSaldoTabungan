/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan36.targetsaldotabungan;

/**
 *
 * Agus Awaludin
 * 10118067
 * PBO2
 * Latihan ini berisi tentang bagaimana menampilkan saldo dengan target
 * tertentu
 */
public class PBO210118067Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan();
        
        tabungan.setSaldo(3500000);
        tabungan.setSaldoTarget(6000000);
        tabungan.setBunga(0.08);
        
        tabungan.hitungTarget();
    }
    
}
