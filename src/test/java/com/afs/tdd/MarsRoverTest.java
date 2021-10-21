package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

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

    @Test
    void should_add_one_space_to_y_location_when_process_command_given_initial_rover_m_command() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "M";
        String expected = "0 1 N";

        //when
        String actual = marsRover.processCommand(command);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void should_turn_to_west_when_process_command_given_initial_rover_l_command() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "L";
        String expected = "0 0 W";

        //when
        String actual = marsRover.processCommand(command);

        //Then
        assertEquals(expected, actual);
    }
}