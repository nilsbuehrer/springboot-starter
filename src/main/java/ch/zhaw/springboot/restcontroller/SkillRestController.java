package ch.zhaw.springboot.restcontroller;

import ch.zhaw.springboot.entities.Skill;
import ch.zhaw.springboot.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SkillRestController {
	@Autowired
	private SkillRepository repository;

	@RequestMapping(value = "endorsements/skills", method = RequestMethod.GET)
	public ResponseEntity<List<Skill>> getSkills() {
		List<Skill> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "endorsements/skills/{skillId}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Skill>> getSkillById(@PathVariable Long skillId) {
		Optional<Skill> result = this.repository.findById(skillId);

		if(result != null && result.isPresent()) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
