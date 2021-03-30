/*Nama : Intan Nas Nas Rabbiana
NIM    : 11200930000010
Kelas  : 2A- Sistem Informasi
Matkul : Pemrograman lanjut
*/
package latihan21;
public class Matematikacanggihberaksi {
    public static void main (String [] args){
        Matematikacanggih mtkc = new Matematikacanggih();
        
                mtkc.setpertambahan(10,10);
                System.out.println("Hasil dari 10 + 10 adalah : "  + mtkc.gettambah());
                mtkc.setperkalian(10,10);
                System.out.println("Hasil dari 10 * 10 adalah: " +mtkc.getkali());
                mtkc.setmodulus(10,10);
                System.out.println("Hasil modulus : " +mtkc.getmodulus());
    }
}
