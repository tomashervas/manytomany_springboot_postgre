package com.curso.manytomany.repository;

import com.curso.manytomany.entity.Canal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanalRepository extends JpaRepository<Canal, Integer> {
}
