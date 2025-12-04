package com.example.demo.service;

import com.example.demo.model.PlayerDTO;

public interface PlayerService {

  void createPlayer(PlayerDTO player);

  PlayerDTO getPlayer(long playerNumber);

  void updatePlayer(long playerNumber, PlayerDTO player);

  void deletePlayer(long playerNumber);
}
