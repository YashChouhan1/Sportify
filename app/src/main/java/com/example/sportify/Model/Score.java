package com.example.sportify.Model;

public class Score {

    private int sc_id;
    private int sc_team_id;
    private int sc_player_id;
    private int sc_event_id;
    private String score;

    public Score(int sc_id, int sc_team_id, int sc_player_id, int sc_event_id, String score) {
        this.sc_id = sc_id;
        this.sc_team_id = sc_team_id;
        this.sc_player_id = sc_player_id;
        this.sc_event_id = sc_event_id;
        this.score = score;
    }

    public int getSc_id() {
        return sc_id;
    }

    public void setSc_id(int sc_id) {
        this.sc_id = sc_id;
    }

    public int getSc_team_id() {
        return sc_team_id;
    }

    public void setSc_team_id(int sc_team_id) {
        this.sc_team_id = sc_team_id;
    }

    public int getSc_player_id() {
        return sc_player_id;
    }

    public void setSc_player_id(int sc_player_id) {
        this.sc_player_id = sc_player_id;
    }

    public int getSc_event_id() {
        return sc_event_id;
    }

    public void setSc_event_id(int sc_event_id) {
        this.sc_event_id = sc_event_id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
