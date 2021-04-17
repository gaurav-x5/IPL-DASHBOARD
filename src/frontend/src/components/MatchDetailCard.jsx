import { React } from 'react';

export const  MatchDetailCard = ({teamName, match}) => {
    if(!match) return null;
    const otherTeam = match.team1 === teamName ? match.team2 : match.team1   
    return (
    <div className="TeamPage">
        <h3>Latest Matches</h3>
        <h4> vs {otherTeam}</h4>
        <h2>{match.date}</h2>
        <h3>at {match.venue}</h3>

    </div>
    );
}