package com.headfirst.designInventory.restInventory.repository;

import com.headfirst.designInventory.restInventory.model.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author gaura
 * @date 25-07-2023
 */

@Repository
public interface GuitarRepository extends JpaRepository<Guitar,Long> {

}
