package com.jeep.repository.impl;

import com.jeep.model.Product;
import com.jeep.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements IProductRepository {
    @Override
    public void create(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery("select s from Product s", Product.class);
        return typedQuery.getResultList();
    }


    @Override
    public Product findById(int id) {
        return BaseRepository.entityManager.find(Product.class, id);
    }

    @Override
    public List<Product> findByName(String nameSearch) {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery("select s from Product s where s.name like :nameSearch ",Product.class);
        typedQuery.setParameter("nameSearch", "%"+nameSearch+"%");

        return typedQuery.getResultList();
    }

    @Override
    public void update(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();

    }

    @Override
    public void delete(int id) {

        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(findById(id));
        entityTransaction.commit();
    }


}
