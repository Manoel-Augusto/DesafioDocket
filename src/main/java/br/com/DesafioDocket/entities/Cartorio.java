package br.com.DesafioDocket.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_cartorio")
@Entity(name = "cartorio")
public class Cartorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany
    private Set<Certidao> certidaoSet;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;



}