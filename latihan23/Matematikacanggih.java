/*Nama : Intan Nas Nas Rabbiana
NIM    : 11200930000010
Kelas  : 2A- Sistem Informasi
Matkul : Pemrograman lanjut
*/
package latihan23;

public class Matematikacanggih extends Matematika {
    
 //int 2 parameter dan 3 parameter
    void modulus (int a, int b){
	System.out.println("hasil dari " + a + " % " + b + " = " + (a%b));
    }
    void modulus (int a, int b, int c){
	System.out.println("hasil dari " + a + " % " + b + " % " + c+ " = " + (a%b%c));
    }
 //double 2 parameter dan 3 parameter
    void modulus (double a, double b){
	System.out.println("hasil dari " + a + " % " + b + " = " + (a%b));
    }
    void modulus (double a, double b, double c){
	System.out.println("hasil dari " + a + " % " + b + " % " + c+ " = " + (a%b%c));
    }
}
 