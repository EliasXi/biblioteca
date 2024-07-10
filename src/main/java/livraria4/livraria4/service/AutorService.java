package livraria4.livraria4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import livraria4.livraria4.entity.Autor;
import livraria4.livraria4.repository.AutorRepository;

@Service
@Transactional
public class AutorService {
	
	@Autowired
	private AutorRepository autorRepository;
	
	public List <Autor> getAll () {
		return autorRepository.findAll();
	}
	
	public void saveAutor (Autor autor) {
		autorRepository.save(autor);
	}

}