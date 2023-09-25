import java.util.Scanner;

public class ThuThu extends Nguoi {
    private String maThuThu;
    private String caLam;
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma thu thu:");
        maThuThu = sc.nextLine();
        System.out.print("Nhap vao ca lam:");
        caLam = sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.print("\nMa thu thu:" + maThuThu);
        System.out.print("\nCa lam:" + caLam);
    }
}
