package com.cricketScore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricketScore.Entity.Match;
import com.cricketScore.Service.CricketService;

@RestController
@RequestMapping("/cricket") 	
public class CricketController {

	@Autowired
    CricketService cricketService;


    // api for getting live matches

    @GetMapping("/live")
    public ResponseEntity<?> getLiveMatchScores() throws InterruptedException {
        System.out.println("getting live match");
        return new ResponseEntity<>(this.cricketService.getLiveMatchScores(), HttpStatus.OK);
    }  

    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches() {
        return new ResponseEntity<>(this.cricketService.getAllMatches(), HttpStatus.OK);
    }
}
