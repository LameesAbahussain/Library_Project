package com.Project_Librrary.Project_Librrary.Service;

import com.Project_Librrary.Project_Librrary.Model.AuthorsModel;
import com.Project_Librrary.Project_Librrary.Model.BookModel;
import com.Project_Librrary.Project_Librrary.Repository.AuthorsRepository;
import com.Project_Librrary.Project_Librrary.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;


@Service
public class LibraryService {
    @Autowired
    private BookRepository bookRepository;
    public BookModel createBook(BookModel bookModel) {
        if (bookModel.getAuthors() != null) {
            for (AuthorsModel author : bookModel.getAuthors()) {
                if (author.getBooks() == null) {
                    author.setBooks(new HashSet<>());
                }
                author.getBooks().add(bookModel);
            }
        }
        return bookRepository.save(bookModel);
    }




    @Autowired
    private AuthorsRepository authorsRepository;

    public AuthorsModel createAuthor(AuthorsModel authorsModel) {
        return authorsRepository.save(authorsModel);
    }



}

