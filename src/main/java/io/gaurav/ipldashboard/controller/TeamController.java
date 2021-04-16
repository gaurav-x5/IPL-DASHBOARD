package io.gaurav.ipldashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.gaurav.ipldashboard.model.Team;
import io.gaurav.ipldashboard.repository.MatchRepository;
import io.gaurav.ipldashboard.repository.TeamRepository;

@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private MatchRepository matchRepository;
    
    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName) {
        
        Team team = teamRepository.findByTeamName(teamName);
        team.setMatches(matchRepository.findLatestMatchesbyTeam(teamName, 4));
        
        return team;
    }
}
