package com.bda.rentaFilms.Model.Dto;


import com.bda.rentaFilms.Model.Entity.StaffEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreDto {
    private long id;

    private long managerStaff;

    private long address;

    private LocalDateTime lastUpdate;

    private List<StaffDto> staffList;
}
