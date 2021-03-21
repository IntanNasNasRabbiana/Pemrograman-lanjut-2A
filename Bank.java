/* Nama : Intan Nas Nas Rabbiana
 * NIM  : 1120093000010
 * Matkul : Pemrograman lanjut
*/
package konstruktor;
public class Bank 
{
    int getsaldo, SimpanUang, AmbilUang;
    public Bank(int getsaldo){
    this.getsaldo=getsaldo;
    System.out.println("Selamat Datang di Bank ABC");
    System.out.println("Saldo saat ini : Rp"+getsaldo);
    }
    
    void SimpanUang( int SimpanUang){
        this.getsaldo=600000;
        System.out.println("Simpan Uang    : Rp" +SimpanUang);
        System.out.println("Saldo saat ini : Rp"+getsaldo);
    }
    
    void AmbilUang(int AmbilUang){
        this.getsaldo=450000;
        System.out.println("Ambil Uang     : Rp" +AmbilUang);
        System.out.println("Saldo saat ini : Rp" +getsaldo);
    }
}
    
    
