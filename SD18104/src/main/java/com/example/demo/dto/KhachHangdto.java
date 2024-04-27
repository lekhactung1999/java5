package com.example.demo.dto;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KhachHangdto {
    @NotBlank(message = "không được để chống mã")
    private String ma;
    @NotBlank(message = "không được để chống ten")
    private String ten;
//    @DateTimeFormat(pattern = "YYYY-MM-DD")
//    @Temporal(TemporalType.DATE)
    private String ngaySinh;

    @NotBlank(message = "không được để chống sdt")
    private String sdt;
    @NotBlank(message = "không được để chống dchi")

    private String diaChi;
    @Min(message = "nhập ít nhất 6 kí tự",value = 6)
    @NotBlank(message = "không được để chống pass")

    private String password;


}
