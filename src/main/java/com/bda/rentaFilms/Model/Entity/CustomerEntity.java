package com.bda.rentaFilms.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "customer")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @Column(name = "customer_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "store_id",referencedColumnName = "store_id")
    private StoreEntity store;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;


    @OneToOne
    private AddressEntity addressEntity;

    private long active;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
