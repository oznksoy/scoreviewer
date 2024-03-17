package com.oznksoy.football.scoreviewer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * <p>Package encapsulated data entity to store scoreboard match details in correlation to {@link MatchTeamPair}.</p>
 * <br>
 * <p>Match details mainly carries {@link MatchDetails#startTime} that signals initial match start time. Score details are also stored in this entity.</p>
 *
 * @author Ozan Aksoy
 */
@Getter
@Setter
@NoArgsConstructor
class MatchDetails implements Serializable {

    private LocalDateTime startTime;

    private MatchScore score;

    /**
     * Deep copy enabling cloning constructor.
     *
     * @param details Match details to be cloned.
     */
    public MatchDetails(MatchDetails details) {
        this.startTime = details.getStartTime();
        this.score = new MatchScore(details.getScore());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MatchDetails details)) return false;
        return Objects.equals(startTime, details.startTime) && Objects.equals(score, details.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, score);
    }

    @Override
    public String toString() {
        return "Details{" + "matchTime=" + startTime + ", score=" + score + '}';
    }

}
