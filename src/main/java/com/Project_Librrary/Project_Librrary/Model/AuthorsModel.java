package com.Project_Librrary.Project_Librrary.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.Set;


@Data
@EqualsAndHashCode(exclude = "books")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "authors")
public class AuthorsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "first_name is required")
    @Size(max = 20, message = "first_name cannot be longer than 20 characters")
    @Column(name = "first_name", nullable = false, length = 20)
    private String first_name;

    @NotBlank(message = "last_name is required")
    @Size(max = 20, message = "last_name cannot be longer than 20 characters")
    @Column(name = "last_name", nullable = false, length = 20)
    private String last_name;

    @NotBlank(message = "description is required")
    @Size(max = 100, message = "description cannot be longer than 100 characters")
    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @NotNull
    private int numberOfBooks;



    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Book_Author",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private Set<BookModel> books;

}