package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }



        @Test
    public void equals_same_object_returns_true() {
        assertEquals(true, team.equals(team));
    }

    @Test
    public void equals_different_class_returns_false() {
        assertEquals(false, team.equals("not a team"));
    }

    @Test
    public void equals_same_name_same_members_returns_true() {
        Team team2 = new Team("test-team");
        assertEquals(true, team.equals(team2));
    }

    @Test
    public void equals_same_name_different_members_returns_false() {
        Team team2 = new Team("test-team");
        team2.addMember("Alice");
        assertEquals(false, team.equals(team2));
    }

    @Test
    public void equals_different_name_returns_false() {
        Team team2 = new Team("other-team");
        assertEquals(false, team.equals(team2));
    }

}
