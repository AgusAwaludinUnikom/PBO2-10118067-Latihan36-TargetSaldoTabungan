/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan36.targetsaldotabungan;

/**
 *
 * @author Kiyo
 */
public class Tabungan {
    private int saldoTarget, saldo;
    private double bunga;

    public void setSaldoTarget(int saldoTarget) {
        this.saldoTarget = saldoTarget;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setBunga(double bunga) {
        this.bunga = bunga;
    }
    
    public void hitungTarget() {
        int i = 0;
        while(saldo <= saldoTarget) {
            i++;
            saldo = saldo + (int)(saldo * bunga);
            System.out.println("Saldo di bulan ke-" + i + " Rp. " +
                    String.format("%,d", saldo).replace(',', '.'));
        }
    }
}
