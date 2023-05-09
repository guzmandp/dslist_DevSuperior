package com.devguzmandp.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devguzmandp.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
