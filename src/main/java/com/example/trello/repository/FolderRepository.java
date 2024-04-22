package com.example.trello.repository;

import com.example.trello.model.Folders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folders, Long> {
}
