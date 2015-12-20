package esprit.ono.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import esprit.ono.domain.Todo;
import esprit.ono.services.TodoService;

@Controller
@RequestMapping("todo")
public class TodoController {

	@Autowired
	private TodoService todoService;

	public TodoController() {
	}

	@RequestMapping
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		List<Todo> todos = todoService.list();
		mv.setViewName("/todo/list");
		mv.addObject("todos", todos);
		return mv;
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public ModelAndView delete(@RequestParam("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		todoService.delete(id);
		List<Todo> todos = todoService.list();
		mv.setViewName("/todo/list");
		mv.addObject("todos", todos);
		return mv;
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView update(@RequestParam("id") Integer id, @RequestParam("text") String text) {
		ModelAndView mv = new ModelAndView();
		Todo todo = new Todo(id, text);
		mv.setViewName("/todo/update");
		mv.addObject("todo", todo);
		return mv;
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ModelAndView save(@RequestParam("id") Integer id, @RequestParam("text") String text) {
		ModelAndView mv = new ModelAndView();
		Todo todo = new Todo(id, text);
		todoService.save(todo);
		List<Todo> todos = todoService.list();
		mv.setViewName("/todo/list");
		mv.addObject("todos", todos);
		return mv;
	}
	
	@RequestMapping(value = "create")
	public ModelAndView create() {
		ModelAndView mv = new ModelAndView();
		Todo todo = new Todo();
		mv.setViewName("/todo/create");
		mv.addObject("todo", todo);
		return mv;
	}

}
