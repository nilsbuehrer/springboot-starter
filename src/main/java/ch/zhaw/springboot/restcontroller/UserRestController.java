package ch.zhaw.springboot.restcontroller;

import ch.zhaw.springboot.entities.User;
import ch.zhaw.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {
	@Autowired
	private UserRepository repository;

	@RequestMapping(value = "infections/persons", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getUsers() {
		List<User> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<User>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
		}
	}
}
