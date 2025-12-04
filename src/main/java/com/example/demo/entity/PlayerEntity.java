package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "PLAYERS")
public class PlayerEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "PLAYER_ID")
  private Long id;
  @Column(name = "PLAYER_NAME")
  private String playerName;
  @Column(name = "PLAYER_AGE")
  private int playerAge;
  @Column(name = "PLAYER_NUMBER", unique = true)
  private long playerNumber;
  @Column(name = "PLAYER_GENDER")
  private String PlayerGender;

}
