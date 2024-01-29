package com.rest.jwt.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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

    @NotNull(message = "FirstName should not be null")
    private String authorFirstName;
    private String authorLastName;

    @NotEmpty(message = "Age can't be empty")
    private int authorAge;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "author")
    private List<BookEntity> booksList;
}
