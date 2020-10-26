import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        float p,r,S;
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap vao so tien ban vay($): ");
        p = scan.nextFloat();
        System.out.print("nhap vao lai xuat hang nam(%): ");
        r = scan.nextFloat();
        scan.close();
        S=p*(r/1200);
        System.out.print("So tien lai la:$ "+ S);
    }
}
