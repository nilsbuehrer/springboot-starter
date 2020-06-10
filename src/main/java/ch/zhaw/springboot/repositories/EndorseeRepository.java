package ch.zhaw.springboot.repositories;

import ch.zhaw.springboot.entities.Endorsee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EndorseeRepository extends JpaRepository<Endorsee, Long> {

}
