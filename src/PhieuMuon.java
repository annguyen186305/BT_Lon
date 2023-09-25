import java.util.ArrayList;
import java.util.Scanner;

public class PhieuMuon  {
    private int soPhieu;
    private String ngayMuon;
    private String ngayHenTra;
    ArrayList<Sach> lstSach;
    private ThuThu tt ;
    private  BanDoc bd;

    public void nhap(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Nhap vao so phieu : ");
        soPhieu= sc.nextInt();
        System.out.print("Nhap thong tin ban doc ");
        bd = new BanDoc();
        bd.nhap();
        System.out.print("Nhap thong tin thu thu");
        tt = new ThuThu();
        tt.nhap();
        int n;
        System.out.print("Nhap so sach muon:");
        n = sc.nextInt();
        lstSach = new ArrayList<Sach>(n);
        for(int i=0; i<n; i++) {
            Sach sach = new Sach();
            sach.nhap();
            lstSach.add(sach);
        }
        System.out.println("Nhap vao ngay muon: ");
        ngayMuon= sc.nextLine();
        System.out.println("Nhap vao ngay hen tra : ");
        ngayHenTra= sc.nextLine();
    }
    public void xuat(){
        System.out.print("\n so phieu" + soPhieu);
        bd.xuat();
        System.out.print("\n danh sach sach muon");
        for( Sach sach: lstSach)
            sach.xuat();
        tt.xuat();
        System.out.print("\n ngay muon" + ngayMuon);
        System.out.print("\n ngay tra" + ngayHenTra);
    }
}
