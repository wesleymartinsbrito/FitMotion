package com.fitmotion.api.repositories;

import com.fitmotion.api.entities.Mensalidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MensalidadeRepository extends JpaRepository<Mensalidade, UUID> {
}
