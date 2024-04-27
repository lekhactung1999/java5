package com.example.demo.controller;

import com.example.demo.dto.NhanViendto;
import com.example.demo.entities.NhanVien;
import com.example.demo.repositories.NvRepo;
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
@RequestMapping("nhan-vien")
public class NhanVienController {
    private List<NhanVien> ds;

    @Autowired
    private NvRepo nvRpo;


//    public NhanVienController(){
//        this.ds=new ArrayList<>();
////        ds.add(new NhanVien("ph1","le","van","B",1,"20-4-1992","hn","0123456"));
////        ds.add(new NhanVien("ph2","le","van","c",1,"20-4-1995","hn","0123456"));
//
//    }
    @GetMapping("index")
    public String index(Model model){
        this.ds=this.nvRpo.findAll();
        model.addAttribute("data",this.ds);

        return "nhan_vien/index";

    }


    @GetMapping("create")
    public String create(
            @ModelAttribute("nv") NhanViendto nhanVien)

    {
        return "nhan_vien/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("nv") NhanViendto req,
                        BindingResult result
    ) {
        if (result.hasErrors()){
            return "nhan_vien/create";
        }
        NhanVien nv = new NhanVien();
//        nv.setId(null);
        nv.setMa(req.getMa());
        nv.setHo(req.getHo());
        nv.setTenDem(req.getTenDem());
        nv.setTen(req.getTen());
        nv.setGioiTinh(req.getGioiTinh());
        nv.setNgaySinh(req.getNgaySinh());
        nv.setDiaChi(req.getDiaChi());
        nv.setSdt(req.getSdt());
        nv.setMatKhau(req.getMatKhau());
//        this.nvRepo.save(nv);
        this.nvRpo.save(nv);
        return "redirect:/nhan-vien/index";

    }
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maNV){
//
        NhanVien nv = this.nvRpo.findByMa(maNV);
        this.nvRpo.delete(nv);
        return "redirect:/nhan-vien/index";
    }

    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String ma,
            Model model
                       ){
        NhanVien nv = this.nvRpo.findByMa(ma);
        model.addAttribute("nv", nv);
        return "nhan_vien/edit";
    }

    @PostMapping("update/{ma}")
    public String update(
            @PathVariable("ma") String ma,@ModelAttribute("nv")
            NhanViendto req



    ) {
        NhanVien oldValue = this.nvRpo.findByMa(ma);
        NhanVien nv = new NhanVien();
        nv.setId(oldValue.getId());
        nv.setMa(req.getMa());
        nv.setHo(req.getHo());
        nv.setTenDem(req.getTenDem());
        nv.setTen(req.getTen());
        nv.setGioiTinh(req.getGioiTinh());
        nv.setNgaySinh(req.getNgaySinh());
        nv.setDiaChi(req.getDiaChi());
        nv.setSdt(req.getSdt());
        nv.setMatKhau(req.getMatKhau());
        this.nvRpo.save(nv);


        return "redirect:/nhan-vien/index";
    }

}

