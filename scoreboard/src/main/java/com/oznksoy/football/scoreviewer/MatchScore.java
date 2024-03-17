package com.oznksoy.football.scoreviewer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Objects;

/**
 * Granular score pair storing representative entity.
 *
 * @author Ozan Aksoy
 */
@Getter
@Setter
@NoArgsConstructor
class MatchScore implements Serializable {

    private Integer homeScore;

    private Integer awayScore;

    /**
     * Deep copy enabling cloning constructor.
     *
     * @param score Match score.
     */
    public MatchScore(MatchScore score) {
        this.homeScore = score.getHomeScore();
        this.awayScore = score.getAwayScore();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MatchScore score)) return false;
        return Objects.equals(homeScore, score.homeScore) && Objects.equals(awayScore, score.awayScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeScore, awayScore);
    }

    @Override
    public String toString() {
        return "Score{" +
                "homeScore=" + homeScore +
                ", awayScore=" + awayScore +
                '}';
    }

}
