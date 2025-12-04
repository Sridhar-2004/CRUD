package com.example.demo.service;

import com.example.demo.entity.PlayerEntity;
import com.example.demo.model.PlayerDTO;
import com.example.demo.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {

  private final PlayerRepository playerRepository;

  @Override
  public void createPlayer(PlayerDTO player) {

    PlayerEntity obj = new PlayerEntity();

    obj.setPlayerName(player.getPlayerName());
    obj.setPlayerAge(player.getPlayerAge());
    obj.setPlayerNumber(player.getPlayerNumber());
    obj.setPlayerGender(player.getPlayerGender());

    playerRepository.save(obj);
  }

  @Override
  public PlayerDTO getPlayer(long playerNumber) {
    PlayerEntity entity = playerRepository.getByPlayerNumber(playerNumber);

    PlayerDTO obj2 = new PlayerDTO();

    obj2.setPlayerName(entity.getPlayerName());
    obj2.setPlayerAge(entity.getPlayerAge());
    obj2.setPlayerNumber(entity.getPlayerNumber());
    obj2.setPlayerGender(entity.getPlayerGender());
    return obj2;
  }

  @Override
  public void updatePlayer(long playerNumber, PlayerDTO player) {
    PlayerEntity obj3 = playerRepository.getByPlayerNumber(playerNumber);

    obj3.setPlayerName(player.getPlayerName());
    obj3.setPlayerAge(player.getPlayerAge());
    obj3.setPlayerNumber(player.getPlayerNumber());
    obj3.setPlayerGender(player.getPlayerGender());

    playerRepository.save(obj3);
  }

  @Override
  public void deletePlayer(long playerNumber) {
    PlayerEntity obj4 = playerRepository.getByPlayerNumber(playerNumber);

    playerRepository.delete(obj4);
  }
}
