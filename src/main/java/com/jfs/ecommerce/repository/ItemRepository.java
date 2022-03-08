package com.jfs.ecommerce.repository;

import com.jfs.ecommerce.Model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}
