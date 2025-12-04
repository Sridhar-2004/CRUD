package com.example.demo.controller;

import com.example.demo.entity.PlayerEntity;
import com.example.demo.model.PlayerDTO;
import com.example.demo.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myservice")
@RequiredArgsConstructor
public class PlayersController {

  private final PlayerService playerService;

  @PostMapping("/create_player")
  public String createPlayer(@RequestBody PlayerDTO player){
  playerService.createPlayer(player);
  return "Player registered successfully";
  }

  @GetMapping("/get_player")
  public PlayerDTO getPlayer(@RequestParam long playerNumber){
    PlayerDTO result = playerService.getPlayer(playerNumber);
    return result ;
  }
  @PutMapping("/update_player")
  public String updatePlayer(@RequestParam long playerNumber, @RequestBody PlayerDTO player){
    playerService.updatePlayer(playerNumber, player);
    return "Player registration updated successfully";
  }
@DeleteMapping("/delete_player")
  public String deletePlayer(@RequestParam  long playerNumber){
    playerService.deletePlayer(playerNumber);
    return "Player registration has been deleted successfully";
  }
}
