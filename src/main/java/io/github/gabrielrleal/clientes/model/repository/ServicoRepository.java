package io.github.gabrielrleal.clientes.model.repository;

import io.github.gabrielrleal.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico,Integer> {
}
