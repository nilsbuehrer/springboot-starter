package ch.zhaw.springboot.repositories;

import ch.zhaw.springboot.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {

}
