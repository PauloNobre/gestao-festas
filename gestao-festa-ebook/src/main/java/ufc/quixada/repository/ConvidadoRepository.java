package ufc.quixada.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ufc.quixada.model.Convidado;

@Repository
public class ConvidadoRepository {

	private static final List<Convidado> LISTA_CONVIDADOS = new ArrayList<>();
	static {
		LISTA_CONVIDADOS.add(new Convidado("Pedro", 2));
		LISTA_CONVIDADOS.add(new Convidado("Maria", 3));
		LISTA_CONVIDADOS.add(new Convidado("Ricardo", 1));
	}

	public List<Convidado> todos() {
		return LISTA_CONVIDADOS;
	}

	public void adicionar(Convidado convidado) {
		LISTA_CONVIDADOS.add(convidado);
	}
}
