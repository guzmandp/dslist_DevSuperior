package com.devguzmandp.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devguzmandp.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}