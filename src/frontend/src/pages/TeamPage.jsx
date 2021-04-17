import { React , useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { MatchDetailCard } from '../components/MatchDetailCard';
import { MatchSmallCard } from '../components/MatchSmallCard';

export const  TeamPage = () => {

    const [team, setTeam] = useState({matches: []});
    const { teamName } = useParams();

    // In our React app sometimes we want to access the parameters of the current
    //  route in this case useParams hook comes into action.
    
    useEffect(
        () => {
            const fetchMatches = async () => {
                const response = await fetch(`http://localhost:8080/team/${teamName}`)
                const data = await response.json();
                console.log(data)
                setTeam(data)

            };

            fetchMatches();
        },[]

    );

    if(!team || !team.teamName) {
        return <h1>Team not Found 404 :)</h1> 
    }
    
    return (
    <div className="TeamPage">
        <h1>{team.teamName}</h1>
        <MatchDetailCard teamName={team.teamName} match={team.matches[0]}/>
        {team.matches.slice(1).map(match => <MatchSmallCard teamName={team.teamName} match={match} />)}
    </div>
    );
}