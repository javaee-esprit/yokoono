package esprit.ono.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import esprit.ono.domain.Todo;
import esprit.ono.services.TodoService;

@Controller
@Scope("request")
@RequestMapping("todo")
public class TodoController {

	@Autowired
	private TodoService todoService;

	private List<Todo> todos;

	public TodoController() {
	}

	@RequestMapping
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		todos = todoService.list();
		mv.setViewName("/todo/index");
		mv.addObject("todos", todos);
		return mv;
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public ModelAndView delete(@RequestParam("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/todo/index");
		todoService.delete(id);
		todos = todoService.list();
		mv.setViewName("/todo/index");
		mv.addObject("todos", todos);
		return mv;
	}

}
