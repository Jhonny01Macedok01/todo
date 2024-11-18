package com.jhonny.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhonny.todo.domain.Todo;
import com.jhonny.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring boot 3 e Angular 11", LocalDateTime.parse("17/11/2024 15:16", formatter), false);
		Todo t2 = new Todo(null, "Correr", "Correr Dia sim dia não na Praça Airton Senna", LocalDateTime.parse("17/11/2024 15:16", formatter), true);
		Todo t3 = new Todo(null, "Ler Diariante", "Estudar o Livro de provébios Diariamente", LocalDateTime.parse("17/11/2024 15:16", formatter), false);
		Todo t4 = new Todo(null, "Trabalhar", "Trabalhar 8 horas por dia", LocalDateTime.parse("17/11/2024 15:16", formatter), true);
		Todo t5 = new Todo(null, "Assistir Séries", "Assistir THE HOUSE DRAGON", LocalDateTime.parse("17/11/2024 15:16", formatter), false);
		Todo t6 = new Todo(null, "Descançar", "Descansar pelos menos 8 horas por dia", LocalDateTime.parse("17/11/2024 15:16", formatter), true);
		
				

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6));
	}

}
