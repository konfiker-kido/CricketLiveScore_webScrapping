package com.cricketScore.Service;

import java.util.List;

import com.cricketScore.Entity.Match;

public interface CricketService {

	List<Match> getLiveMatchScores();

	List<Match> getAllMatches();
}
