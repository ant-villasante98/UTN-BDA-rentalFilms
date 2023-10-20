package com.bda.rentaFilms.Service.Mapper;

import com.bda.rentaFilms.Model.Dto.StaffDto;
import com.bda.rentaFilms.Model.Dto.StoreDto;
import com.bda.rentaFilms.Model.Entity.StoreEntity;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class StoreDtoMapper implements Function<StoreEntity, StoreDto> {
    @Override
    public StoreDto apply(StoreEntity storeEntity) {
        return new StoreDto(
                storeEntity.getId(),
                storeEntity.getManagerStaff(),
                storeEntity.getAddressEntity().getId(),
                storeEntity.getLastUpdate(),
                storeEntity.getStaffEntityList().stream()
                        .map(StaffDto::from)
                        .toList()

        );
    }
}
