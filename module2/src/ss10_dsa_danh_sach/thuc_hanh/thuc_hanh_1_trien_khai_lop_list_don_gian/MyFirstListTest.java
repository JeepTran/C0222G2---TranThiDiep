package ss10_dsa_danh_sach.thuc_hanh.thuc_hanh_1_trien_khai_lop_list_don_gian;

public class MyFirstListTest {
    public static void main(String[] args) {
        MyFirstList<Integer> listInteger = new MyFirstList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));

        listInteger.get(0);
        System.out.println("element 0: "+listInteger.get(0));
    }
}
