import java.util.ArrayList;
import java.util.Scanner;

public class PhieuMuon  {
    private int soPhieu;
    ArrayList<Sach> lstSach;
    private ThuThu tt ;
    private  BanDoc bd;
    private String ngayMuon;
    private String ngayHenTra;

    public void nhap(){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Nhap vao so phieu:");
        soPhieu= sc.nextInt();
        System.out.print("Nhap thong tin ban doc");
        bd = new BanDoc();
        bd.nhap();
        int n;
        System.out.print("Nhap so sach muon:");
        n = sc.nextInt();
        sc.nextLine();
        lstSach = new ArrayList<Sach>(n);
        for(int i=0; i<n; i++) {
            Sach sach = new Sach();
            sach.nhap();
            lstSach.add(sach);
        }
        System.out.print("\nNhap thong tin thu thu");
        tt = new ThuThu();
        tt.nhap();
        System.out.print("Nhap vao ngay muon:");
        ngayMuon= sc.nextLine();
        System.out.print("Nhap vao ngay hen tra:");
        ngayHenTra= sc.nextLine();
    }
    public void xuat(){
        System.out.print("\nso phieu:" + soPhieu);
        bd.xuat();
        System.out.print("\nDANH SACH SACH MUON");
        for( Sach sach: lstSach)
            sach.xuat();
        tt.xuat();
        System.out.print("\nNgay muon:" + ngayMuon);
        System.out.print("\nNgay tra:" + ngayHenTra);
    }
}
