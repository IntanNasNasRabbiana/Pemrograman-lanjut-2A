/*Nama : Intan Nas Nas Rabbiana
NIM    : 11200930000010
Kelas  : 2A- Sistem Informasi
Matkul : Pemrograman lanjut
*/
package latihan22;


public class MatematikaCanggihBangetBeraksi {
    private int pertambahanTiga,pertambahan,perkalian,modulus;
     public static void main (String [] args){
        MatematikaCanggihBanget mtk = new MatematikaCanggihBanget();
        
        mtk.setpertambahanTiga(10,10,10);        
                System.out.println("Hasil dari 10 + 10 + 10 adalah : " +mtk.getpertambahanTiga());
        mtk.setpertambahan(10,10);
                System.out.println("Hasil dari 10 + 10 adalah : " +mtk.getpertambahan());
        mtk.setperkalian(10,10);
                System.out.println("Hasil dari 10 * 10 adalah : " +mtk.getperkalian());
        mtk.setmodulus(10,3);
                System.out.println("Hasil modulus adalah : " +mtk.getmodulus());
                
}
}