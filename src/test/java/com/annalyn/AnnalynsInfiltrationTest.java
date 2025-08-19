package com.annalyn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnnalynsInfiltrationTest {
    // Tests para canFastAttack 
    @Test
    void testCanFastAttack_whenKnightIsAsleep_returnsTrue() {
        boolean knightIsAwake = false;
        boolean expected = true;
        boolean actual = AnnalynsInfiltration.canFastAttack(knightIsAwake);
        assertEquals(expected, actual);
    }

    @Test
    void testCanFastAttack_whenKnightIsAwake_returnsFalse() {
        boolean knightIsAwake = true;
        boolean expected = false;
        boolean actual = AnnalynsInfiltration.canFastAttack(knightIsAwake);
        assertEquals(expected, actual);
    }
    
    //---------------------------------------------------------
    
    // Tests para canSpy
    @Test
    void testCanSpy_whenOnlyKnightIsAwake_returnsTrue() {
        assertEquals(true, AnnalynsInfiltration.canSpy(true, false, false));
    }

    @Test
    void testCanSpy_whenEveryoneIsAsleep_returnsFalse() {
        assertEquals(false, AnnalynsInfiltration.canSpy(false, false, false));
    }

    @Test
    void testCanSpy_whenEveryoneIsAwake_returnsTrue() {
        assertEquals(true, AnnalynsInfiltration.canSpy(true, true, true));
    }

    //---------------------------------------------------------

    // Tests para canSignalPrisoner
    @Test
    void testCanSignalPrisoner_whenArcherIsAsleepAndPrisonerIsAwake_returnsTrue() {
        assertEquals(true, AnnalynsInfiltration.canSignalPrisoner(false, true));
    }

    @Test
    void testCanSignalPrisoner_whenArcherIsAwake_returnsFalse() {
        assertEquals(false, AnnalynsInfiltration.canSignalPrisoner(true, true));
    }

    @Test
    void testCanSignalPrisoner_whenPrisonerIsAsleep_returnsFalse() {
        assertEquals(false, AnnalynsInfiltration.canSignalPrisoner(false, false));
    }
    
    //---------------------------------------------------------

    // Tests para canFreePrisoner
    @Test
    void testCanFreePrisoner_withDog_whenArcherIsAsleep_returnsTrue() {
        assertEquals(true, AnnalynsInfiltration.canFreePrisoner(true, false, true, true));
    }

    @Test
    void testCanFreePrisoner_withDog_whenArcherIsAwake_returnsFalse() {
        assertEquals(false, AnnalynsInfiltration.canFreePrisoner(true, true, true, true));
    }

    @Test
    void testCanFreePrisoner_withoutDog_whenEveryoneIsAsleepExceptPrisoner_returnsTrue() {
        assertEquals(true, AnnalynsInfiltration.canFreePrisoner(false, false, true, false));
    }

    @Test
    void testCanFreePrisoner_withoutDog_whenEveryoneIsAwake_returnsFalse() {
        assertEquals(false, AnnalynsInfiltration.canFreePrisoner(true, true, true, false));
    }
}
