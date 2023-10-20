package com.bda.rentaFilms.Repository;

import com.bda.rentaFilms.Model.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
