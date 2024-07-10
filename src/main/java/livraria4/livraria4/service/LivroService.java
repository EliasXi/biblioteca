package livraria4.livraria4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import livraria4.livraria4.entity.Livro;
import livraria4.livraria4.repository.LivroRepository;

@Service
@Transactional
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	public List <Livro> getAllLivros () {
		return livroRepository.findAll();
}

	public void saveLivro (Livro livro) {
		livroRepository.save(livro);
	}

}