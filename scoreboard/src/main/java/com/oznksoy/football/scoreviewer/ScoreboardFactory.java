package com.oznksoy.football.scoreviewer;

/**
 * Accessor factory Entity for Scoreboard calls and injections.
 *
 * @author Ozan Aksoy
 */
public final class ScoreboardFactory {

    private ScoreboardFactory() {
    }

    /**
     * Calls on the Scoreboard and creates a new Scoreboard Instance.
     *
     * @return Scoreboard with a Shared Memory
     */
    public static Scoreboard getScoreboard() {
        return new ScoreboardImp(new ScoreboardCache(), new ScoreboardClock(), new ScoreboardAudit());
    }

}
