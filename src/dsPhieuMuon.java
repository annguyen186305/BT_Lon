import java.util.ArrayList;
import java.util.Scanner;

public class dsPhieuMuon {
    ArrayList<PhieuMuon> lstPM;

    public void nhapdsPhieuMuon() {
        int soPM;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao tong so phieu muon:");
        soPM = sc.nextInt();
        sc.nextLine();
        lstPM = new ArrayList<PhieuMuon>(soPM);
        for (int i = 0; i < soPM; i++) {
            PhieuMuon x = new PhieuMuon();
            x.nhap();
            lstPM.add(x);
        }
    }

    public void xuatdsPhieuMuon() {
        for (PhieuMuon PM : lstPM)
            PM.xuat();
    }

    public void timKiemPhieuMuonTheoMaSach(String maSach) {
        boolean timThay = false;
        for (PhieuMuon PM : lstPM) {
            int viTriSach = PM.timSach(maSach);
            if (viTriSach != -1) {
                Sach sachDaMuon = PM.lstSach.get(viTriSach);
                sachDaMuon.xuat();
                BanDoc banDoc = timBanDocTheoMaSach(maSach);
                if (banDoc != null) {
                    banDoc.xuat();
                } else {
                    System.out.println("Khong tim thay thong tin ban doc.");
                }
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay phieu muon nao cho sach co ma: " + maSach);
        }
    }

    public BanDoc timBanDocTheoMaSach(String maSach) {
        for (PhieuMuon phieuMuon : lstPM) {
            int viTriSach = phieuMuon.timSach(maSach);
            if (viTriSach != -1) {
                return phieuMuon.getBd();
            }
        }
        return null;
    }
}

