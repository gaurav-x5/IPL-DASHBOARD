package io.gaurav.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.gaurav.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{
// jpa secrets
// it will break the below as findby and teamName and perform the action and return the provided return type
    Team findByTeamName(String teamName);
    
}
