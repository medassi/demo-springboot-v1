package fr.medassi.democours.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.medassi.democours.models.Equipement;


public interface EquipementRepository extends JpaRepository<Equipement, Long> {

}
