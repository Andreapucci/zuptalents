package br.com.estacionamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estacionamento.model.Veiculos;

@Repository
public interface VeiculosRepository extends JpaRepository<Veiculos, Long> {

	public Veiculos findById(long id);

	public List<Veiculos> findByAno(String ano);

	public List<Veiculos> findByClienteId(long clienteId);

}
