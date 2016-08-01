package ufc.quixada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ufc.quixada.repository.ConvidadoRepository;

@Controller
public class ConvidadosController {
	
	@Autowired
	ConvidadoRepository convidadoRepository;

	@RequestMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject("convidados", convidadoRepository.todos());
		return mv;
	}
}
