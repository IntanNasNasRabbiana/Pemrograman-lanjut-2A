/*Nama : Intan Nas Nas Rabbiana
NIM    : 11200930000010
Kelas  : 2A- Sistem Informasi
Matkul : Pemrograman lanjut
*/
package latihan23;
public class Matematikacanggihberaksi {
    public static void main (String [] args){
        Matematikacanggih mtk = new Matematikacanggih();
        
    System.out.println("Pemanggilan method pertambahan");
        mtk.pertambahan(12.5, 28.7, 14.2);
        mtk.pertambahan(12, 28, 14);
        mtk.pertambahan(23, 34);
        mtk.pertambahan(3.4, 4.9);
     
    System.out.println("\nPemanggilan method pengurangan");
        mtk.pengurangan(12.5, 28.7, 14.2);
        mtk.pengurangan(12, 28, 14);
        mtk.pengurangan(23, 24);
        mtk.pengurangan(3.4, 4.9);
     
    System.out.println("\nPemanggilan method perkalian");
        mtk.perkalian(12.5, 28.7, 14.2);
        mtk.perkalian(12, 28, 14);
        mtk.perkalian(23, 24);
        mtk.perkalian(3.4, 4.9);
       
    System.out.println("\nPemanggilan method pembagian");
        mtk.pembagian(12.5, 28.7 , 14.2);
        mtk.pembagian(12, 28, 14);
        mtk.pembagian(23, 24);
        mtk.pembagian(3.4, 4.9);
        
    System.out.println("\nPemanggilan method modulus");
        mtk.modulus(12.5, 28.7, 14.2);
        mtk.modulus(12, 28, 14);
        mtk.modulus(23, 24);
        mtk.modulus(3.4, 4.9);
       
    }
}
