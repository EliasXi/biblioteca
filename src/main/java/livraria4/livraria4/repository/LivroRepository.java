package livraria4.livraria4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import livraria4.livraria4.entity.Livro;

@Repository
public interface LivroRepository extends JpaRepository <Livro, Long>{

}
