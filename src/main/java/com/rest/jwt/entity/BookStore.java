package com.rest.jwt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BOOKSTORE_TABLE")
public class BookStore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookStoreId;
}
