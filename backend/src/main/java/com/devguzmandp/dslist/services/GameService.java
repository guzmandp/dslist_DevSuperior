package com.devguzmandp.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devguzmandp.dslist.dto.GameDTO;
import com.devguzmandp.dslist.dto.GameMinDTO;
import com.devguzmandp.dslist.entities.Game;
import com.devguzmandp.dslist.projections.GameMinProjection;
import com.devguzmandp.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findbyId(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
		
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return  result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection>  result = gameRepository.searchByList(listId);
		return  result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
}
