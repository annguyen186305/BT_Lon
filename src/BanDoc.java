import java.util.Scanner;

public class BanDoc extends Nguoi {
    private String maBanDoc;
    private String doiTuong;
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma ban doc:");
        maBanDoc = sc.nextLine();
        System.out.print("Nhap vao doi tuong:");
        doiTuong = sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.print("\nMa ban doc:" + maBanDoc);
        System.out.print("\nDoi tuong:" + doiTuong);
    }
}
