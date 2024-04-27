package com.example.demo.controller;

import com.example.demo.dto.Nsxdto;
import com.example.demo.entities.Nsx;
import com.example.demo.repositories.NsxRepo;
import com.example.demo.repositories.SpRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("nsx")
public class NsxController {
    private List<Nsx> ds;
    @Autowired
    private NsxRepo nsxRepo;

    @GetMapping("index")
    public String Home(Model model) {
        this.ds = this.nsxRepo.findAll();
        model.addAttribute("item", this.ds);
        return "nsx/index";

    }

    @GetMapping("view-add")
    public String viewAdd(@ModelAttribute("nsx") Nsxdto nsxdto) {

        return "nsx/add";
    }

    @PostMapping("add")
    public String add(@Valid @ModelAttribute("nsx") Nsxdto nsxdto,
                      BindingResult result
    ) {
        if (result.hasErrors()) {
            return "nsx/add";
        }
        Nsx nsx = new Nsx();
        nsx.setMa(nsxdto.getMa());
        nsx.setTen(nsxdto.getTen());
        this.nsxRepo.save(nsx);


        return "redirect:/nsx/index";

    }


    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma){
    Nsx nsx=this.nsxRepo.findByMa(ma);
    nsxRepo.delete(nsx);


        return "redirect:/nsx/index";
    }

    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma,
                       Model model

    ){
        Nsx nsx=this.nsxRepo.findByMa(ma);
        model.addAttribute("nsx",nsx);


        return "nsx/update";


    }
    @PostMapping("update/{ma}")
    public String update(
            @PathVariable("ma") String ma,@ModelAttribute("nsx")
            Nsxdto nsxdto
    ) {
        Nsx nsx1=this.nsxRepo.findByMa(ma);
        Nsx nsx = new Nsx();
        nsx.setId(nsx1.getId());
        nsx.setMa(nsxdto.getMa());
        nsx.setTen(nsxdto.getTen());
        this.nsxRepo.save(nsx);

        return "redirect:/nsx/index";
    }

}
