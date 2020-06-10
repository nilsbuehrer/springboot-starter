package ch.zhaw.springboot.restcontroller;

import ch.zhaw.springboot.entities.Endorser;
import ch.zhaw.springboot.repositories.EndorserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EndorserRestController {
	@Autowired
	private EndorserRepository repository;

	@RequestMapping(value = "infections/persons", method = RequestMethod.GET)
	public ResponseEntity<List<Endorser>> getEndorsers() {
		List<Endorser> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Endorser>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Endorser>>(HttpStatus.NOT_FOUND);
		}
	}
}
