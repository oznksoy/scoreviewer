package com.oznksoy.football.scoreviewer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Scoreboard aggregate match data representative entity.
 *
 * @author Ozan Aksoy
 */
@Getter
@Setter
@NoArgsConstructor
public final class Match implements Serializable {

    private String homeTeam;

    private String awayTeam;

    private LocalDateTime matchTime;

    private Integer homeScore;

    private Integer awayScore;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Match match)) return false;
        return Objects.equals(homeTeam, match.homeTeam)
                && Objects.equals(awayTeam, match.awayTeam)
                && Objects.equals(matchTime, match.matchTime)
                && Objects.equals(homeScore, match.homeScore)
                && Objects.equals(awayScore, match.awayScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeTeam, awayTeam, matchTime, homeScore, awayScore);
    }

    @Override
    public String toString() {
        return "Match{" +
                "homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", matchTime=" + matchTime +
                ", homeScore=" + homeScore +
                ", awayScore=" + awayScore +
                '}';
    }

}
