package com.example.demo.controller;

import com.example.demo.dto.SanPhamdto;
import com.example.demo.entities.SanPham;
import com.example.demo.repositories.SpRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("san-pham")
public class SanPhamController {
    private List<SanPham> ds;
    @Autowired
    private SpRepo spRepo;

    @GetMapping("index")
    public String Home(Model model){
        ds=spRepo.findAll();
        model.addAttribute("item",this.ds);
        return "san_pham/index";

    }
    @GetMapping("view-add")
    public String viewAdd(@ModelAttribute("sp") SanPhamdto sp){

        return"san_pham/add";
    }
    @PostMapping("add")
    public String add(@Valid @ModelAttribute("sp") SanPhamdto spdto,
                      BindingResult result
                      ){
        if(result.hasErrors()){
            return "san_pham/add";
        }
        SanPham sp=new SanPham();
        sp.setMa(spdto.getMa());
        sp.setTen(spdto.getTen());
        this.spRepo.save(sp);
        return "redirect:/san-pham/index";

    }
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma){
    SanPham sp=this.spRepo.findByMa(ma);
    this.spRepo.delete(sp);
        return "redirect:/san-pham/index";
    }

    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma,
                       Model model

    ){
        SanPham sp=this.spRepo.findByMa(ma);
        model.addAttribute("sp",sp);




        return "san_pham/update";


    }
    @PostMapping("update/{ma}")
    public String update(
            @PathVariable("ma") String ma,@ModelAttribute("sp")
            SanPhamdto sp
    ) {
        SanPham sp1=this.spRepo.findByMa(ma);
        SanPham s=new SanPham();
        s.setId(sp1.getId());
        s.setMa(sp.getMa());
        s.setTen(sp.getTen());
        this.spRepo.save(s);

        return "redirect:/san-pham/index";
    }

}
