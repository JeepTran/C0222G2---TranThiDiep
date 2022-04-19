package ss10_dsa_danh_sach.thuc_hanh.thuc_hanh_2_trien_khai_lop_linkedlist_don_gian;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class MySecondListTest {
    public static void main(String[] args) {
//        LinkedList<Integer> linkedList=new LinkedList<>();
//        linkedList.add(10);
//        linkedList.add(0,2);
//        System.out.println(linkedList);

        MySecondList ll = new MySecondList(10);
        ll.addFirst(15);
        ll.addFirst(12);
        ll.add(9, 7);
        ll.add(0,2);
        ll.add(1, 3);
        ll.add(4, 8);
        ll.addFirst(13);
        ll.printList();
    }
}
