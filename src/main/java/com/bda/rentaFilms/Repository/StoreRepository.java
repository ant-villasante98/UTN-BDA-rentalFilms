package com.bda.rentaFilms.Repository;

import com.bda.rentaFilms.Model.Entity.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<StoreEntity,Long> {
}
