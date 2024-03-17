package com.oznksoy.football.scoreviewer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

/**
 * Package encapsulated data entity to store  two teams in the match to the scoreboard.
 * This pair is to be used as key in correlation to {@link MatchDetails} mapping.
 *
 * @author Ozan Aksoy
 */
@Getter
@Setter
@NoArgsConstructor
class MatchTeamPair implements Serializable {

    private String homeTeam;

    private String awayTeam;

    /**
     * Deep copy enabling cloning constructor.
     *
     * @param teamPair Two teams of the match
     */
    public MatchTeamPair(MatchTeamPair teamPair) {
        this.homeTeam = teamPair.getHomeTeam();
        this.awayTeam = teamPair.getAwayTeam();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MatchTeamPair teamPair)) return false;
        return Objects.equals(homeTeam, teamPair.homeTeam) && Objects.equals(awayTeam, teamPair.awayTeam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeTeam, awayTeam);
    }

    @Override
    public String toString() {
        return "TeamPair{" +
                "homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                '}';
    }

}
