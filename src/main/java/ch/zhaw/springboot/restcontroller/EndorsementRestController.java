package ch.zhaw.springboot.restcontroller;

import ch.zhaw.springboot.entities.Endorsement;
import ch.zhaw.springboot.repositories.EndorsementRepository;
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

public class EndorsementRestController {
	@Autowired
	private EndorsementRepository repository;

	@RequestMapping(value = "/endorsements", method = RequestMethod.GET)
	public ResponseEntity<List<Endorsement>> getEndorsements() {
		List<Endorsement> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/endorsements/{endorsementId}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Endorsement>> getEndorsementById(@PathVariable Long endorsementId) {
		Optional<Endorsement> result = this.repository.findById(endorsementId);

		if(result != null && result.isPresent()) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
