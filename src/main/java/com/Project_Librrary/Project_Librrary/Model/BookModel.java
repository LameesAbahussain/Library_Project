package com.Project_Librrary.Project_Librrary.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.util.Date;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = "authors")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Title is required")
    @Size(max = 100, message = "Title cannot be longer than 100 characters")
    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @PastOrPresent(message = "Published date cannot be in the future")
    @Column(name = "publishedDate")
    private Date publishedDate;

    @Column(name = "borrowed")
    private boolean borrowed;




    @ManyToMany(mappedBy = "books", cascade = CascadeType.ALL)
    private Set<AuthorsModel> authors;

}

