package com.fitmotion.api.repositories;

import com.fitmotion.api.entities.Treino;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TreinoRepository extends JpaRepository<Treino, UUID> {
}
