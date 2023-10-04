package com.example.demo.services;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    private final BookRepository bookRepository;
    private final UserRepository userRepository;

    @Autowired
    public AdminService(BookRepository bookRepository, UserRepository userRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    public void saveAll(List<Book> books) {
        bookRepository.saveAll(books);

    }

    public void save(Book book) {
        bookRepository.save(book);
    }

    public Optional<Book> getBookByID(Long id) {
        return bookRepository.findById(id);
    }



}
