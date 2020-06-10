package ch.zhaw.springboot.restcontroller;

import ch.zhaw.springboot.entities.Endorsee;
import ch.zhaw.springboot.repositories.EndorseeRepository;
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
public class EndorseeRestController {

	@Autowired
	private EndorseeRepository repository;

	@RequestMapping(value = "endorsements/endorsees", method = RequestMethod.GET)
	public ResponseEntity<List<Endorsee>> getEndorsees() {
		List<Endorsee> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "endorsements/endorsees/{endorseeId}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Endorsee>> getEndorseeById(@PathVariable Long endorseeId) {
		Optional<Endorsee> result = this.repository.findById(endorseeId);

		if(result != null && result.isPresent()) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
