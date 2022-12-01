package com.example.orderapi.repository;

import com.example.orderapi.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
