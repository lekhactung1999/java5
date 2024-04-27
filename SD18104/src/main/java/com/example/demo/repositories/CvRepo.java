package com.example.demo.repositories;

import com.example.demo.entities.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CvRepo extends JpaRepository<ChucVu, UUID> {
    public ChucVu findByMa(String ma);

}
