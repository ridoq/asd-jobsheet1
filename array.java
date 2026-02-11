import java.util.Scanner;
public class array {
    static Scanner sc = new Scanner(System.in);
    static String matkul[] = {"Agama", "BIndo", "BIngDas", "Daspro", "Prak Daspro", "KTI", "CTPS", "PAMB", "MatDas"};
    static int nilai[] = new int[matkul.length], sks[] = {2,2,2,2,3,2,2,2,2};

    public static void garis(){
        System.out.println("=".repeat(65));
    }   
    public static void garis2(){
        System.out.println("-".repeat(65));
    }   

    public static int nilaiAkhir(String matkul){
        int hasilNilai;
        do{
            System.out.printf("Masukkan nilai mata kuliah %-13s : ", matkul);
            hasilNilai = sc.nextInt();
            if (hasilNilai < 0 || hasilNilai > 100) {
                System.out.println("Nilai yang dimasukkan tidak valid, silahkan masukkan nilai kembali");
            }
        }while(hasilNilai < 0 || hasilNilai > 100);
        return hasilNilai;
    }

    public static String nilaiHuruf(int nilai){
        if (nilai >= 80 && nilai <= 100) {
                return "A";
            }else if(nilai >= 73){
                return "B+";
            }else if(nilai >= 65){
                return "B";
            }else if(nilai >= 60){
                return "C+";
            }else if(nilai >= 50){
                return "C";
            }else if(nilai >= 39){
                return "D";
            }else if(nilai >= 0 ){
                return "E";
            }else{
                return "Nilai tidak valid";
            }
    }
    public static double bobotNilai(int nilai){
        if (nilai >= 80 && nilai <= 100) {
                return 4.0;
            }else if(nilai >= 73){
                return 3.5;
            }else if(nilai >= 65){
                return 3.0;
            }else if(nilai >= 60){
                return 2.5;
            }else if(nilai >= 50){
                return 2.0;
            }else if(nilai >= 39){
                return 1.0;
            }else{
                return 0.0;
            }
    }

    public static double hitungIP(){
        double totalSKS = 0.0, totalNxSKS = 0.0;
        for(int i = 0; i < matkul.length; i++){
            totalSKS += sks[i];
            totalNxSKS += (bobotNilai(nilai[i]) * sks[i]);
        }
        return totalNxSKS / totalSKS;
    }

    public static void main(String[] args) {
        garis();
        System.out.println("Program Menghitung IP Semester");
        garis();
        
        for(int i = 0; i < nilai.length;i++){
            nilai[i] = nilaiAkhir(matkul[i]);
        }
        
        garis();
        System.out.println("Hasil Konversi Nilai");
        garis();
        
        System.out.printf("%-20s %-15s %-15s %-15s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        garis2();
        for(int i = 0; i < nilai.length;i++){
            System.out.printf("%-20s %-15.2f %-15s %-15s\n", matkul[i], (double)nilai[i], nilaiHuruf(nilai[i]), bobotNilai(nilai[i]));
        }
        garis();
        System.out.printf("IP : %.2f\n", hitungIP());
        garis();
    }
}
