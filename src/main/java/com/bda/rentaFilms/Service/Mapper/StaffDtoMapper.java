package com.bda.rentaFilms.Service.Mapper;

import com.bda.rentaFilms.Model.Dto.StaffDto;
import com.bda.rentaFilms.Model.Entity.StaffEntity;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class StaffDtoMapper implements Function<StaffEntity,StaffDto> {
    @Override
    public StaffDto apply(StaffEntity staffEntity) {
        return new StaffDto(
                staffEntity.getId(),
                staffEntity.getFirstName(),
                staffEntity.getLastName(),
                staffEntity.getAddressEntity().getId(),
                staffEntity.getStore().getId(),
                staffEntity.getEmail(),
                staffEntity.getActive(),
                staffEntity.getUsername(),
                staffEntity.getPassword(),
                staffEntity.getLastUpdate()

        );
    }
}
