package com.cricketScore.Repo; 

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricketScore.Entity.Match;

public interface MatchRepo extends JpaRepository<Match,Integer> {

    Optional<Match> findByTeamHeading(String teamHeading);

}