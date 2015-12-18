package esprit.ono.util;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import esprit.ono.domain.Todo;
import esprit.ono.services.TodoService;

@Component
public class Populator {
	
	@Autowired
	private TodoService todoService;

	public Populator() {
	}
	
	@PostConstruct
	public void populate(){
		Todo t1 = new Todo("kill bill");
		Todo t2 = new Todo("launch mozarella firefox");
		
		todoService.save(t1);
		todoService.save(t2);
	}
}
