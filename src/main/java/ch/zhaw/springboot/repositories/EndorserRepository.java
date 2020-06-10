package ch.zhaw.springboot.repositories;

import ch.zhaw.springboot.entities.Endorser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EndorserRepository extends JpaRepository<Endorser, Long> {

}
