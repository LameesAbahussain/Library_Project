package com.Project_Librrary.Project_Librrary.Repository;

import com.Project_Librrary.Project_Librrary.Model.AuthorsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AuthorsRepository extends JpaRepository<AuthorsModel, Long> {

}