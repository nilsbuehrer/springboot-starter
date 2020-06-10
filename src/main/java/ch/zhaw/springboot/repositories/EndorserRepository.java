package ch.zhaw.springboot.repositories;

import ch.zhaw.springboot.entities.Endorser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface EndorserRepository extends JpaRepository<Endorser, Long> {
    @Query("SELECT endorser.name FROM Endorser endorser, Endorsement endorsement WHERE endorser.id = endorsement.endorser.id AND endorsement.date = ?1")
    public List<String> getEndorserNameByEndorsementDate(Date date);
}
