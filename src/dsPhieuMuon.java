import java.util.ArrayList;
import java.util.Scanner;

public class dsPhieuMuon {
    ArrayList <PhieuMuon> lstPM;
    public void nhapdsPhieuMuon(){
        int soPM;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao tong so phieu muon:");
        soPM = sc.nextInt();
        sc.nextLine();
        lstPM = new ArrayList<PhieuMuon>(soPM);
        for (int i=0; i<soPM; i++){
            PhieuMuon x = new PhieuMuon();
            x.nhap();
            lstPM.add(x);
        }
    }
    public void xuatdsPhieuMuon(){
        for (PhieuMuon PM: lstPM)
            PM.xuat();
    }
    public void timKiemPhieuMuonTheoMaSach(String maSach) {
        boolean timThay = false;
        for (PhieuMuon PM : lstPM) {
            if (PM.timSach(maSach)!=-1)
            {
                PM.xuat();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay phieu muon nao cho sach co ma: " + maSach);
        }
    }
}
