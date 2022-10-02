package com.wizard.lair.repository;

import com.wizard.lair.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
@Repository

public interface BookRepository extends JpaRepository<Book, Long> {


}
