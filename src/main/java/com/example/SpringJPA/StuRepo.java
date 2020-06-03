package com.example.SpringJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuRepo extends JpaRepository<StuJPA, Integer> {

}
