package com.bumblebee.designpattern.behavioral.command;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OttServiceTest {

    @Test
    void CommandPatternTest() {

        Command disneyCommand = new DisneyCommand();
        Command netflixCommand = new NexflixCommand();

        OttService ottService = new OttService();
        ottService.setCommand(disneyCommand);
        assertEquals(ottService.displayOtt(), "Disney");

        ottService.setCommand(netflixCommand);
        assertEquals(ottService.displayOtt(), "Netflix");

    }

}