package com.afs.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

    @Test
    void should_return_initial_rover_details_when_report_rover_detail_given_initial_rover() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String expected = "0 0 N";

        //when
        String actual = marsRover.reportRoverDetail();

        //Then
        assertEquals(expected, actual);
    }
}
