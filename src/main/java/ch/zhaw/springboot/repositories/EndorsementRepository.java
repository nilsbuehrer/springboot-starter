package ch.zhaw.springboot.repositories;

import ch.zhaw.springboot.entities.Endorsement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EndorsementRepository extends JpaRepository<Endorsement, Long> {

}
