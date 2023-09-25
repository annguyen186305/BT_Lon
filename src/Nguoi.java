import java.util.Scanner;

public class Nguoi {
   private String hoTen;
   private String ngSinh;
   private String diaChi;
   private String SDT;
   private String Email;
   public void nhap(){
       Scanner sc = new Scanner(System.in);
       System.out.print("\nNhap vao ho ten:");
       hoTen = sc.nextLine();
       System.out.print("Nhap vao ngay sinh:");
       ngSinh = sc.nextLine();
       System.out.print("Nhap vao dia chi:");
       diaChi = sc.nextLine();
       System.out.print("Nhap vao SDT:");
       SDT = sc.nextLine();
       System.out.print("Nhap vao Email:");
       Email = sc.nextLine();
   }
   public void xuat(){
       System.out.print("\nHo ten:" + hoTen);
       System.out.print("\nNgay sinh:" + ngSinh);
       System.out.print("\nDia chi:" + diaChi);
       System.out.print("\nSDT:" + SDT);
       System.out.print("\nEmail:" + Email);
   }
}
