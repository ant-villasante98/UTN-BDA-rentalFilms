package com.bda.rentaFilms.Repository;

import com.bda.rentaFilms.Model.Entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffEntity,Long> {
}
