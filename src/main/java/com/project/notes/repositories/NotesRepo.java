package com.project.notes.repositories;

import java.util.List;

import com.project.notes.entities.Notes;
import com.project.notes.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepo extends JpaRepository<Notes, Integer>{
    List<Notes> findByUser(User user);
}
