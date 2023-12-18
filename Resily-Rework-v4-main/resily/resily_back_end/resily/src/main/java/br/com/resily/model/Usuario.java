package br.com.resily.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbUsuario")
public class Usuario{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)//Auto incrementa no próprio back end
    private int idUsuario;
    private String nomeUsuario;
    private String emailUsuario;
    private String senhaUsuario;
    private int idadeUsuario;
    private String telefoneUsuario;
    private String cpfUsuario;
    private String rgUsuario;
}
