package com.Project_Librrary.Project_Librrary.Controller;

import com.Project_Librrary.Project_Librrary.Service.LibraryService;
import com.Project_Librrary.Project_Librrary.Service.LibraryService;
import com.Project_Librrary.Project_Librrary.Model.BookModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;



@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private LibraryService serviceBook;


    @PostMapping("")
    public BookModel createBook(@RequestBody BookModel bookModel) {
        return serviceBook.createBook(bookModel);
    }

}


