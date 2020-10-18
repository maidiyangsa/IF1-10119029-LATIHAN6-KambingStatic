/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingstatic;

/**
 *
 * @author Beta Three
 * NAMA     : ADRIAN MAIDIYANGSA
 * KELAS    : IF-1
 * NIM      : 10119029
 */

public class Mamalia{
    public static int jumlahKambing;
}

public class KambingStatic {

    /**
     * @param args the command line arguments
     */
    
    //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                            + Mamalia.jumlahKambing);
    }
    
}
