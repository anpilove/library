package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT p FROM  Book p WHERE CONCAT(p.name, ' ', p.publish_house, ' ', p.data_input, ' ', p.FIO, ' ', p.data_output) LIKE %?1%")
    List<Book> search(String keyword);


}
