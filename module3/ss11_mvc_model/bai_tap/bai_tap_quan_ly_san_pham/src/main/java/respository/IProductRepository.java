package respository;

import model.Product;

import java.beans.Customizer;
import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void create(Product product);

    void update(int id, Product product);

    void delete(int id);

    Product findById(int id);

    List<Product> search(String name);
}
