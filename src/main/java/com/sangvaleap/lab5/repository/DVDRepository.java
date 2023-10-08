package com.sangvaleap.lab5.repository;

import com.sangvaleap.lab5.model.DVD;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DVDRepository extends JpaRepository<DVD, Long> {
}
