package com.bda.rentaFilms.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "staff")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StaffEntity{

    @Id
    @Column(name = "staff_id")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne
    @JoinColumn(name = "address_id")
    private AddressEntity addressEntity;

    private String email;

    @JoinColumn(name = "store_id" , referencedColumnName = "store_id")
    @ManyToOne
    private StoreEntity store;

    private long active;

    private String username;
    private String password;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
