package io.gaurav.ipldashboard.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String teamName;
    private long totalMatches;
    private long totalWins;

    public Team(String teamName, long totalMatches) {
        this.teamName = teamName;
        this.totalMatches = totalMatches;
    }
    
    
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public long getTotalMatches() {
        return this.totalMatches;
    }

    public void setTotalMatches(long totalMatches) {
        this.totalMatches = totalMatches;
    }

    public long getTotalWins() {
        return this.totalWins;
    }

    public void setTotalWins(long totalWins) {
        this.totalWins = totalWins;
    }


    @Override
    public String toString() {
        return "{" +
            " teamName='" + getTeamName() + "'" +
            ", totalMatches='" + getTotalMatches() + "'" +
            ", totalWins='" + getTotalWins() + "'" +
            "}";
    }


}

   