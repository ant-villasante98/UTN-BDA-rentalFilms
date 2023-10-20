package com.bda.rentaFilms.Repository;

import com.bda.rentaFilms.Model.Entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity,Long> {
}
