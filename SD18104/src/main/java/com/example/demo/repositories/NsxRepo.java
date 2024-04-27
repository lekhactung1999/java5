package com.example.demo.repositories;

import com.example.demo.entities.Nsx;
import com.example.demo.entities.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NsxRepo extends JpaRepository<Nsx, UUID> {
    public Nsx findByMa(String ma);

}
