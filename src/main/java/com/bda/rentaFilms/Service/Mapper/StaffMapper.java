package com.bda.rentaFilms.Service.Mapper;

import com.bda.rentaFilms.Model.Dto.StaffDto;
import com.bda.rentaFilms.Model.Entity.AddressEntity;
import com.bda.rentaFilms.Model.Entity.StaffEntity;
import com.bda.rentaFilms.Model.Entity.StoreEntity;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class StaffMapper implements Function<StaffDto, StaffEntity> {
    @Override
    public StaffEntity apply(StaffDto staffDto) {
        return new StaffEntity(
                staffDto.getId(),
                staffDto.getFirstName(),
                staffDto.getLastName(),
                new AddressEntity().builder().id(staffDto.getAddress()).build(),
                staffDto.getEmail(),
                new StoreEntity().builder().id(staffDto.getStoreId()).build(),
                staffDto.getActive(),
                staffDto.getUsername(),
                staffDto.getPassword(),
                staffDto.getLastUpdate()
        );
    }
}
