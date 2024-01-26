package com.rest.jwt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Author_Table")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long authorId;
    private String authorFirstName;
    private String authorLastName;
    private int authorAge;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "author")
    private List<BookEntity> booksList;
}
