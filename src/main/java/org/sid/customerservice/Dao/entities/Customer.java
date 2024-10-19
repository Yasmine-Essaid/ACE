package org.sid.customerservice.Dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String email;

    public Customer() {
    }

    public Customer(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
