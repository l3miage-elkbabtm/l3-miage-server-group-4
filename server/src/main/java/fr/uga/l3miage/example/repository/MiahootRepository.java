package fr.uga.l3miage.example.repository;

import fr.uga.l3miage.example.models.Miahoot;
import fr.uga.l3miage.example.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MiahootRepository extends JpaRepository<Miahoot,Long> {

    Optional<Miahoot> findMiahootById(final Long miahootId) ;
    List<Miahoot> findMiahootByConcepteur(Teacher concepteur);
    Long deleteMiahootById(final Long  miahootId);

}
