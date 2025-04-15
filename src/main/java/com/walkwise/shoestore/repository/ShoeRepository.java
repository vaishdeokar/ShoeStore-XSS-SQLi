package com.walkwise.shoestore.repository;

import com.walkwise.shoestore.model.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoeRepository extends JpaRepository<Shoe, Long> {
}
