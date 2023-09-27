import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        dsPhieuMuon dsPM = new dsPhieuMuon();
        dsPM.nhapdsPhieuMuon();
        dsPM.xuatdsPhieuMuon();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ma sach can tim: ");
        String maSachCanTim = sc.nextLine();
        dsPM.timKiemPhieuMuonTheoMaSach(maSachCanTim);
    }
}