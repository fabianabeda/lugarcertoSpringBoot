package br.com.lugarcerto.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lugarcerto.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
//	pode ser criado metodos de busca personalizados

	
	public List<Usuario> findByIdAndNome(long id, String nome);
}
