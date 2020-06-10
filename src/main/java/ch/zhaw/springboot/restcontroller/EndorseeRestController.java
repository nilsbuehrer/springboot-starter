package ch.zhaw.springboot.restcontroller;

import ch.zhaw.springboot.entities.Endorsee;
import ch.zhaw.springboot.repositories.EndorseeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EndorseeRestController {

	@Autowired
	private EndorseeRepository repository;

	@RequestMapping(value = "infections/persons", method = RequestMethod.GET)
	public ResponseEntity<List<Endorsee>> getEndorsees() {
		List<Endorsee> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Endorsee>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Endorsee>>(HttpStatus.NOT_FOUND);
		}
	}
}
