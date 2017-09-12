package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.ItemList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ItemListDao extends CrudRepository<ItemList, Integer> {
}
