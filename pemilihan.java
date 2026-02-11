import java.util.Scanner;
public class pemilihan {
    static Scanner sc = new Scanner(System.in);
    static int nilaiTugas, nilaiKuis, nilaiUAS, nilaiUTS;
    static double rata;

    public static int requestNilai(String nama){
        int nilai;
        do{
            System.out.printf("Masukkan nilai %-5s : ", nama);
            nilai = sc.nextInt();
            if (nilai > 100 || nilai < 0) {
                System.out.println("Nilai tidak valid, silahkan masukkan nilai kembali");
            }
        }while(nilai > 100 || nilai < 0);
        return nilai;
    }

    public static void garis(){
        System.out.println("=".repeat(25));
    }

    public static double rata2(int tugas, int kuis, int uts, int uas){
        double rataRata = (double) (tugas * .2) + (kuis * .2) + (uts * .3) + (uas * .3);
        return rataRata;
    }

    public static String predikat(double rata){
        if (rata >= 80 && rata <= 100) {
            return "A";
        }else if(rata >= 73){
            return "B+";
        }else if(rata >= 65){
            return "B";
        }else if(rata >= 60){
            return "C+";
        }else if(rata >= 50){
            return "C";
        }else if(rata >= 39){
            return "D";
        }else if(rata >= 0 ){
            return "E";
        }else{
            return "Nilai tidak valid";
        }
    }

    public static void ket(String predikat){
        switch (predikat) {
            case "A":
                System.out.println("SELAMAT ANDA LULUS");
                break;
            case "B+":
                System.out.println("SELAMAT ANDA LULUS");
                break;
            case "B":
                System.out.println("SELAMAT ANDA LULUS");
                break;
            case "C+":
                System.out.println("SELAMAT ANDA LULUS");
                break;
            case "C":
                System.out.println("SELAMAT ANDA LULUS");
                break;
            case "D":
                System.out.println("MOHON MAAF ANDA TIDAK LULUS");
                break;
            case "E":
                System.out.println("MOHON MAAF ANDA TIDAK LULUS");
                break;
            default:
                System.out.println("Keterangan tidak Valid");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Program Menghitung Nilai Akhir");
        garis();

        nilaiTugas = requestNilai("Tugas");
        nilaiKuis = requestNilai("Kuis");
        nilaiUTS = requestNilai("UTS");
        nilaiUAS = requestNilai("UAS");
        
        garis();garis();
        
        rata = rata2(nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS);
        System.out.println("Nilai Akhir : " + rata);
        System.err.println("Nilai Huruf : " + predikat(rata));
        
        garis();garis();

        ket(predikat(rata));

        sc.close();
    }
}
