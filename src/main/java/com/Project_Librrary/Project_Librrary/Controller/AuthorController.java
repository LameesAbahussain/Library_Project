package com.Project_Librrary.Project_Librrary.Controller;
import com.Project_Librrary.Project_Librrary.Service.LibraryService;
import com.Project_Librrary.Project_Librrary.Model.AuthorsModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;



@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private LibraryService serviceAuthor;


    @PostMapping("")
    public AuthorsModel createBook(@RequestBody AuthorsModel authorsModel) {
        return serviceAuthor.createAuthor(authorsModel);
    }

}
