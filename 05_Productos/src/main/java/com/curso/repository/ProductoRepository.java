package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
