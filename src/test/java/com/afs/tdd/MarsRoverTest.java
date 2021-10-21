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

    @Test
    void should_turn_to_east_when_process_command_given_initial_rover_r_command() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "R";
        String expected = "0 0 E";

        //when
        String actual = marsRover.processCommand(command);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void should_minus_one_space_to_x_location_when_process_command_given_rover_face_west_m_command() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        String command = "M";
        String expected = "-1 0 W";

        //when
        String actual = marsRover.processCommand(command);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void should_minus_one_space_to_y_location_when_process_command_given_rover_face_south_m_command() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String command = "M";
        String expected = "0 -1 S";

        //when
        String actual = marsRover.processCommand(command);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void should_add_one_space_to_x_location_when_process_command_given_rover_face_east_m_command() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String command = "M";
        String expected = "1 0 E";

        //when
        String actual = marsRover.processCommand(command);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void should_turn_to_north_when_process_command_given_rover_face_east_l_command() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String command = "L";
        String expected = "0 0 N";

        //when
        String actual = marsRover.processCommand(command);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void should_turn_to_south_when_process_command_given_rover_face_east_r_command() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String command = "R";
        String expected = "0 0 S";

        //when
        String actual = marsRover.processCommand(command);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void should_turn_to_east_when_process_command_given_rover_face_south_l_command() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String command = "L";
        String expected = "0 0 E";

        //when
        String actual = marsRover.processCommand(command);

        //Then
        assertEquals(expected, actual);
    }
}
