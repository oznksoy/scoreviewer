package com.oznksoy.football.scoreboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Scoreboard Factory Tests.
 * To understand the purpose and scenarios of the test cases, read the method names carefully.
 * The names are written in BDD key structure.
 */
class ScoreboardFactoryTest {

    @Test
    void whenScoreboardIsCalled_AnswersWithAnInstance() {
        assertNotNull(ScoreboardFactory.getScoreboard());
    }

}