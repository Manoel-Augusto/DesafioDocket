package br.com.DesafioDocket.controllers;

import br.com.DesafioDocket.entities.Cartorio;
import br.com.DesafioDocket.entities.Certidao;
import br.com.DesafioDocket.entities.Endereco;
import br.com.DesafioDocket.repositories.EnderecoRepository;
import br.com.DesafioDocket.services.CartorioService;
import br.com.DesafioDocket.services.CertidaoService;
import br.com.DesafioDocket.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class CartorioController {
    @Autowired
    private CartorioService cartorioservice;
    @Autowired
    private CertidaoService certidaoService;
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/")
    public ModelAndView getAllCartorio() {
        List<Cartorio> cartorioList = this.cartorioservice.findAll();
        ModelAndView mv = new ModelAndView("index");
        List<Endereco> enderecoList = this.enderecoService.findAll();
        mv.addObject("cartorioList", cartorioList);
        mv.addObject("enderecoList", enderecoList);

        return mv;

    }


    @GetMapping("/add")
    public ModelAndView getFormAdd() {
        ModelAndView mv = new ModelAndView("formAdd");
        List<Certidao> certidaoList = this.certidaoService.findAll();
        List<Certidao> certidaoDefault = this.certidaoService.findAll();

        mv.addObject("certidaoList", certidaoList);
        mv.addObject("certidaoDefault", certidaoDefault);
        return mv;

    }

    @PostMapping("/form/save")
    public String saveCartorio(Cartorio cartorio, Endereco endereco) {
        this.enderecoService.save(endereco);
        this.cartorioservice.save(cartorio);

        return "redirect:/";
    }


    @GetMapping("/edit/{id}")
    public ModelAndView getEdit(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("formEdit");
        Cartorio cartorio = this.cartorioservice.findById(id);
        List<Certidao> certidaoList = new ArrayList<>();
        List<Certidao> certidaoDefault = this.certidaoService.findAll();
        cartorio.getCertidao().forEach(i -> certidaoList.add(i));

        mv.addObject("certidao", certidaoList);
        mv.addObject("cartorio", cartorio);
        mv.addObject("certidaoDefault", certidaoDefault);

        return mv;
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        this.cartorioservice.delete(id);
        return "redirect:/";
    }

}
