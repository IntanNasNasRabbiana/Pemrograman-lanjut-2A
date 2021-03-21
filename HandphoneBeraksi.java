/* Nama : Intan Nas Nas Rabbiana
 * NIM  : 1120093000010
 * Matkul : Pemrograman lanjut
*/
package Hp;
public class HandphoneBeraksi {
    public static void main(String [] args){
       Handphone hpku = new Handphone ();
        hpku.hidupkan ();
        hpku.lakukanPanggilan();
        hpku.kirimSMS();
        hpku.matikan();
    }
}