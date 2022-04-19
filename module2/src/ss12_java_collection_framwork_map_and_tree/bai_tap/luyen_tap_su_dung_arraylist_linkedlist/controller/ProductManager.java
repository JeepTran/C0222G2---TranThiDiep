package ss12_java_collection_framwork_map_and_tree.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.service;

import ss12_java_collection_framwork_map_and_tree.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.Product;

import java.util.ArrayList;

public class ProductManager {
  static   ArrayList<Product> productList = new ArrayList<>();

    Product product1 = new Product(1,"nameA",100);
    Product product2 = new Product(2,"nameM",400);
     Product product3 = new Product(5,"nameK",500);
     Product product4 = new Product(3,"nameC",100);

static {
    productList.add(new Product(1,"nameA",100));
    productList.add(new Product(2,"nameK",300));
    productList.add(new Product(5,"nameD",800));
    productList.add(new Product(4,"nameM",200));
}


}
