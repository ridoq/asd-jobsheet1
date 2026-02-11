import java.util.Scanner;
public class fungsi {
    static Scanner sc = new Scanner(System.in);
    static String namaBunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static int stokBunga[][] = new int[4][namaBunga.length], hargaBunga[] = {75000, 50000, 60000, 10000};

    public static void garis(){
        System.out.println("=".repeat(25));
    }
    public static void garis2(){
        System.out.println("-".repeat(25));
    }

    public static void tambahStok(){
        for(int i = 0; i < stokBunga.length;i++){
            garis();
            System.out.printf("Toko Royal garden %d : \n", (i+1));
            garis2();
            for(int j = 0; j < stokBunga[0].length;j++){
                System.out.printf("Masukkan Stok Bunga %s : ", namaBunga[j]);   
                stokBunga[i][j] = sc.nextInt();
            }
        }
    }
    
    public static double pendapatan(int i){
        double totalPendapatan = 0;
        for(int j = 0; j < stokBunga[0].length;j++){
            totalPendapatan += stokBunga[i][j] * hargaBunga[j];
        }
        return totalPendapatan;
    }

    public static String status(double totalPendapatan){
        if (totalPendapatan > 1500000) {
            return "(Sangat Baik)";
        }else{
            return "(Perlu Evaluasi)";
        }
    }
    
    public static void main(String[] args) {
        tambahStok();
        garis();
        System.out.println("TOTAL PENDAPATAN SETIAP TOKO(JIKA BUNGA HABIS TERJUAL)");
        garis2();
        for (int i = 0; i < stokBunga.length; i++) {
            System.out.printf("Toko Royal garden %d : ", (i+1));
            System.out.print(pendapatan(i));
            System.out.println(" " + status(pendapatan(i)));

        }
        garis();
    }
}
