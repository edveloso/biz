package br.edu.infnet.bizWeb.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.bizWeb.persistencia.ChamadoDao;

@Controller
@RequestMapping("/chamados")
public class ChamadoCtrl {

	@Autowired
	private ChamadoDao chamadoDao;

	@RequestMapping(method=RequestMethod.GET)
	public String chamados(Model model){
		chamadoDao.getAll();
		return "welcome";
	}
	
	
	public ChamadoDao getChamadoDao() {
		return chamadoDao;
	}

	public void setChamadoDao(ChamadoDao chamadoDao) {
		this.chamadoDao = chamadoDao;
	}
	
	
	
}
