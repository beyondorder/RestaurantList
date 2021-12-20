package com.example.restaurant.restaurant.wishlist.repository;

import com.example.restaurant.restaurant.db.MemoryDbRepositoryAbstract;
import com.example.restaurant.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
