package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
