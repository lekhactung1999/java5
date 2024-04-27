package com.example.demo.repositories;

import com.example.demo.entities.MauSac;
import com.example.demo.entities.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MauRepo extends JpaRepository<MauSac, UUID> {
    public MauSac findByMa(String ma);

}
