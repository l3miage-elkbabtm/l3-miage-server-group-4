package fr.uga.l3miage.example.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fireBaseId ;
    private String nom;

    @OneToMany(mappedBy = "concepteur")
    private List<Miahoot> createdMiahoots ;

    @OneToMany(mappedBy = "presentateur")
    private List<Miahoot> presentedMiahoots ;

}