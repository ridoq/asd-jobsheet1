import java.util.Scanner;
public class tugasDua {
    static Scanner sc = new Scanner(System.in);
    static String jadwal[][], col[] = {"Nama MatKul", "Ruang", "Hari Kuliah", "Jam Kuliah"}, key;

    public static void garis(){
        System.out.println("=".repeat(75));
    }

    public static void garis2(){
        System.out.println("-".repeat(75));
    }
    
    public static void buatJadwal(){
        garis();
        int jmlJadwal;
        do{
            System.out.print("masukkan jumlah jadwal : ");
            jmlJadwal = sc.nextInt();
            if (jmlJadwal<1) {
                System.out.println("jumlah tidak valid, silahkan masukkan ulang");
                continue;
            }else{
                jadwal = new String[jmlJadwal][4];
            }
        }while(jmlJadwal < 1);
        sc.nextLine();
        garis();
        System.out.println("\nTAMBAH JADWAL\n");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("Input jadwal ke-" + (i+1));
            for (int j = 0; j < jadwal[0].length; j++) {
                System.out.printf(" - Input %s : ", col[j]);
                jadwal[i][j] = sc.nextLine();
            }
        }
        garis();
    }
    
    public static void tampilJadwal(){
        garis();
        System.out.println("\nTAMPILKAN JADWAL\n");
        for (int i = 0; i < col.length; i++) {
            System.out.printf("%-15s | ", col[i]);
        }
        System.out.println();
        garis();
        try {
            for (int i = 0; i < jadwal.length; i++) {
                for (int j = 0; j < jadwal[0].length; j++) {
                    System.out.printf("%-15s | ", jadwal[i][j]);
                }
                System.out.println();
                garis2();
            }
        } catch (Exception e) {
            System.out.println("Data masih kosong");
            garis2();
        }
    }
    
    public static void cariJadwal(){
        System.out.print("Cari data berdasarkan matkul atau hari: ");
        key = sc.nextLine();
        
        for (int i = 0; i < col.length; i++) {
            System.out.printf("%-15s | ", col[i]);
        }
        System.out.println();
        garis();
        for (int i = 0; i < jadwal.length; i++) {
            if (i!=0) {
                garis2();
            }
            for (int j = 0; j < jadwal[0].length; j++) {
                if (key.equalsIgnoreCase(jadwal[i][2]) || key.equalsIgnoreCase(jadwal[i][0])) {
                    System.out.printf("%-15s | ", jadwal[i][j]);
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        buatJadwal();
        tampilJadwal();
        cariJadwal();
    }   
}
