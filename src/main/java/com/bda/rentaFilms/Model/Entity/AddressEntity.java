package com.bda.rentaFilms.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressEntity {
    @Id
    @Column(name = "address_id")
    private long id;

    private String address;
    private String address2;

    private String district;

    // Cambiar
    @Column(name = "city_id")
    private long city;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    @OneToOne(mappedBy = "addressEntity")
    private StaffEntity staffEntity;

    @OneToOne(mappedBy = "addressEntity")
    private StoreEntity storeEntity;


}
