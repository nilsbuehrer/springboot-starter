package ch.zhaw.springboot.restcontroller;

import ch.zhaw.springboot.entities.Endorser;
import ch.zhaw.springboot.repositories.EndorserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class EndorserRestController {
	@Autowired
	private EndorserRepository repository;

	@RequestMapping(value = "endorsements/endorsers", method = RequestMethod.GET)
	public ResponseEntity<List<Endorser>> getEndorsers() {
		List<Endorser> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "endorsements/endorsers/{endorserId}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Endorser>> getEndorserById(@PathVariable Long endorserId) {
		Optional<Endorser> result = this.repository.findById(endorserId);

		if(result != null && result.isPresent()) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "endorsements/endorsers/date={date}", method = RequestMethod.GET)
	public ResponseEntity<List<String>> getEndorserNameByEndorsementDate(@PathVariable Date date) {
		List<String> result = this.repository.getEndorserNameByEndorsementDate(date);

		if(!result.isEmpty()) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


}
