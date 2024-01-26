package com.rest.jwt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Book_Table")
public class BookEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long bookId;
    private String bookName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author")
    private Author author;
    private String year;
    private double bookPrice;
}
