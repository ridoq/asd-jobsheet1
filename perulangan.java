public class perulangan {
    public static void main(String[] args) {
        //NIM = _._._._._._._._0058
        for(int i = 1; i <= 58; i++){
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("# ");
            }else if (i % 2 == 0) {
                System.out.print(i + " ");
            }else{
                System.out.print("* ");
            }
        }
    }
}
