package ufc.quixada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ufc.quixada.model.Convidado;
import ufc.quixada.repository.ConvidadoRepository;

@Controller
public class ConvidadosController {
	
	@Autowired
	ConvidadoRepository convidadoRepository;

	@RequestMapping("/")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject("convidados", convidadoRepository.findAll());
		mv.addObject(new Convidado());
		return mv;
	}
	
	@RequestMapping(value="/cadastrar", method = RequestMethod.POST)
	public String cadastrar(Convidado convidado) {
		convidadoRepository.save(convidado);
		return "redirect:/";
	}
	
	@RequestMapping(value="/deletar/{id}")
	public String excluir(@PathVariable("id") Integer idConvidado) {
		convidadoRepository.delete(idConvidado);
		return "redirect:/";
	}
}
