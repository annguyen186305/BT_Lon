import java.util.Scanner;

public class Sach {
   private String maSach;
   private String tenSach;
   private String tacGia;
   private String theLoai;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();
        System.out.print("Nhap the loai: ");
        theLoai = sc.nextLine();
    }
    public void xuat() {
        System.out.print("\nMa sach: " + maSach);
        System.out.print("\nTen sach: " + tenSach);
        System.out.print("\nTac gia: " + tacGia);
        System.out.print("\nThe loai: " + theLoai);
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getMaSach() {
        return maSach;
    }
}
