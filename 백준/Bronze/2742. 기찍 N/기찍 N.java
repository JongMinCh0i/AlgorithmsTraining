import java.util.Scanner;

class fac{
    public void Print_Num(int n) {
        for(int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fac fc = new fac();

        fc.Print_Num(sc.nextInt());
    }
}