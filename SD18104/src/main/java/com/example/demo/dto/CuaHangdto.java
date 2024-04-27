package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CuaHangdto {
//    @NotBlank(message = "không được để chống id")
//    private String id;
    @NotBlank(message = "không được để chống mã")
    private String ma;
    @NotBlank(message = "không được để chống tên")
    private String ten;
    @NotBlank(message = "không được để chống địa chỉ")
    private String diaChi;
    @NotBlank(message = "không được để chống thành phố")
    private String thanhPho;
    @NotBlank(message = "không được để chống quốc gia")
    private String quocGia;

}
