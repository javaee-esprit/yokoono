package esprit.ono.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import esprit.ono.domain.Todo;


@Service
@Transactional
public class TodoService {
	
	@PersistenceContext
	private EntityManager em;
	
	public TodoService() {
	}
	
	public Todo save(Todo todo){
		return em.merge(todo);
	}
	
	public List<Todo> list(){
		return em.createQuery("from Todo", Todo.class).getResultList();
	}
	
	public void delete(Integer id){
		em.remove(em.find(Todo.class, id));
	}

	public Todo find(Integer id) {
		return em.find(Todo.class, id);
		
	}

}
