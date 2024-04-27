package com.example.demo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "KhachHang")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "Ten")

    private String ten;

//    @Temporal(TemporalType.DATE)
////    @DateTimeFormat(pattern = "YYYY-MM-DD")
    @Column(name = "NgaySinh")
    private String ngaySinh;

    @Column(name = "Sdt")
    private String sdt;
    @Column(name = "DiaChi")
    private String diaChi;
    @Column(name = "MatKhau")
    private String password;


}
