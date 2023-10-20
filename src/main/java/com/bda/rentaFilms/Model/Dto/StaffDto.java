package com.bda.rentaFilms.Model.Dto;

import com.bda.rentaFilms.Applicacion.Request.CreateStaff;
import com.bda.rentaFilms.Model.Entity.StaffEntity;
import com.bda.rentaFilms.Model.Entity.StoreEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StaffDto {
    private long id;

    private String firstName;

    private String lastName;

    private long storeId;

    private long address;

    private String email;

    private long active;

    private String username;
    private String password;

    private LocalDateTime lastUpdate;

    public static StaffDto from(StaffEntity staffEntity){
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
    public static StaffDto from( CreateStaff createStaff ){
        return new StaffDto().builder()
                .firstName(createStaff.getFirstName())
                .lastName(createStaff.getLastName())
                .address(createStaff.getAddress())
                .storeId(createStaff.getStoreId())
                .email(createStaff.getEmail())
                .active(createStaff.getActive())
                .username(createStaff.getUsername())
                .password(createStaff.getPassword())
                .lastUpdate(LocalDateTime.now()).build()
                ;
    }

}
