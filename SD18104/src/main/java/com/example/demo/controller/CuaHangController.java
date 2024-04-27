package com.example.demo.controller;

import com.example.demo.dto.CuaHangdto;
import com.example.demo.entities.CuaHang;
import com.example.demo.repositories.ChRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("cua-hang")
public class CuaHangController {
    private List<CuaHang> ds;
    @Autowired
    private ChRepo chRepo;

    @GetMapping("index")
    public String Home(Model model){
        this.ds=this.chRepo.findAll();
        model.addAttribute("item",this.ds);
        return "cua_hang/index";

    }
    @GetMapping("view-add")
    public String viewAdd(@ModelAttribute("ch") CuaHangdto ch){

        return"cua_hang/add";
    }
    @PostMapping("add")
    public String add(@Valid @ModelAttribute("ch") CuaHangdto cuaHangdto,
                      BindingResult result
                      ){
        if(result.hasErrors()){
            return "cua_hang/add";
        }
        CuaHang ch= new CuaHang();
        ch.setMa(cuaHangdto.getMa());
        ch.setTen(cuaHangdto.getTen());
        ch.setDiaChi(cuaHangdto.getDiaChi());
        ch.setThanhPho(cuaHangdto.getThanhPho());
        ch.setQuocGia(cuaHangdto.getQuocGia());
        this.chRepo.save(ch);


        return "redirect:/cua-hang/index";

    }
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma){
    CuaHang cuaHang =chRepo.findByMa(ma);
    this.chRepo.delete(cuaHang);
        return "redirect:/cua-hang/index";
    }

    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma,
                       Model model

    ){
        CuaHang cuaHang =chRepo.findByMa(ma);
        model.addAttribute("ch",cuaHang);



        return "cua_hang/update";


    }
    @PostMapping("update/{ma}")
    public String update(
            @PathVariable("ma") String ma,@ModelAttribute("ch")
            CuaHang cuaHang
    ) {
        CuaHang c=this.chRepo.findByMa(ma);

        CuaHang ch= new CuaHang();
        ch.setId(c.getId());
        ch.setMa(cuaHang.getMa());
        ch.setTen(cuaHang.getTen());
        ch.setDiaChi(cuaHang.getDiaChi());
        ch.setThanhPho(cuaHang.getThanhPho());
        ch.setQuocGia(cuaHang.getQuocGia());
        this.chRepo.save(ch);

        return "redirect:/cua-hang/index";
    }

}
