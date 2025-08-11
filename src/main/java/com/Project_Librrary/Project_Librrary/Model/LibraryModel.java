package com.Project_Librrary.Project_Librrary.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "library")
public class LibraryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "name is required")
    @Size(max = 20, message = "name cannot be longer than 20 characters")
    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @PastOrPresent(message = "establishDate date cannot be in the future")
    @Column(name = "establishDate")
    private LocalDate establishDate;


}
