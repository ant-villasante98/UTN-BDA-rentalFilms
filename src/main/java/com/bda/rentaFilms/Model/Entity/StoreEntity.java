package com.bda.rentaFilms.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "store")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StoreEntity {

    @Id
    @Column(name = "store_id")
    private long id;

    @OneToOne
    @JoinColumn(name = "address_id")
    private AddressEntity addressEntity;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    //@OneToOne
    //@JoinColumn(name = "manager_staff_id")
    //private StaffEntity managerStaff;
    @Column(name = "manager_staff_id")
    private long managerStaff;

    @OneToMany(mappedBy = "store")
    private List<StaffEntity> staffEntityList;

    @OneToMany(mappedBy = "store")
    private List<CustomerEntity> customerEntityList;

}
