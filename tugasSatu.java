import java.util.Scanner;
public class tugasSatu {
    static Scanner sc = new Scanner(System.in);
    static 
    char kode[] = {'A','B','D','E','F','G','H','L','N','T'},
    kota[][] = {
        { 'B','A','N','T','E','N' },
        {'J','A','K','A','R','T','A'},
        {'B','A','N','D','U','N','G'},
        {'C','I','R','E','B','O','N'},
        {'B','O','G','O','R'},
        {'P','E','K','A','L','O','N','G','A','N'},
        {'S','E','M','A','R','A','N','G'},
        {'S','U','R','A','B','A','Y','A'},
        {'M','A','L','A','N','G'},
        {'T','E','G','A','L'}
    };

    public static void garis(){
        System.out.println("=".repeat(25));
    }
    public static void garis2(){
        System.out.println("-".repeat(25));
    }

    public static void cariKota(String key){
        for (int i = 0; i < kode.length; i++) {
            if (key.equalsIgnoreCase(String.valueOf(kode[i]))) {
                System.out.println(kota[i]);
            }
        }
    }

    public static void main(String[] args) {
        garis();
        String key;
        boolean inputReq = false;
        do{
            System.out.print("Masukkan kode plat nomor untuk menampilkan kota berdasarkan kode plat : ");
            key = sc.nextLine();
            if (!key.equalsIgnoreCase("A") && !key.equalsIgnoreCase("B") &&!key.equalsIgnoreCase("D") && !key.equalsIgnoreCase("E") && !key.equalsIgnoreCase("F") && !key.equalsIgnoreCase("G") && !key.equalsIgnoreCase("H") && !key.equalsIgnoreCase("L") && !key.equalsIgnoreCase("N") && !key.equalsIgnoreCase("T")) {
               System.out.println("Kode tidak valid, silahkan masukkan kode kembali");
               garis2();
               inputReq = true;  
            }else{
                garis2();
                cariKota(key);
                inputReq = false;  
                garis2();
            }

        }while(inputReq);
    }    
}
