package com.example.jpademo.clases;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.TableGenerator;


@Entity
@Data
public class Usuario {
    @Id
    String id;

    String nombre;
    int edad;
    String ciudad;

}
