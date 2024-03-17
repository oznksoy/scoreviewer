package com.oznksoy.football.scoreviewer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Scoreboard Factory Tests.
 * To understand the purpose and scenarios of the test cases, read the method names carefully.
 * The names are written in BDD key structure.
 *
 * @author Ozan Aksoy
 */
class ScoreboardFactoryTest {

    @Test
    void givenScoreboardIsToBeCalled_whenScoreboardIsCalled_ThenAnswersWithAnInstance() {
        assertNotNull(ScoreboardFactory.getScoreboard());
    }

}