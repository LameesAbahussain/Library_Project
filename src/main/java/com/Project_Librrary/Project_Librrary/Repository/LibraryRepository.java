package com.Project_Librrary.Project_Librrary.Repository;


import com.Project_Librrary.Project_Librrary.Model.LibraryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryModel, Long> {
}


