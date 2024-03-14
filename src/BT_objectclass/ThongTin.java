package BT_objectclass;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Bell", 3, "Boy", "Hanoi");
        nv1.getInfo();

        NhanVien nv2 = new NhanVien("Minh", 33, "Boy", "Nam Dinh");
        System.out.println("===============");
        nv2.getInfo();
    }
}

