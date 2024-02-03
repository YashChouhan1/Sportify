package com.example.sportify.Model;

public class Player {

    private int pl_id;
    private int pl_team_Id;
    private String pl_name;
    private String pl_role;

    public Player(int pl_id, int pl_team_Id, String pl_name, String pl_role) {
        this.pl_id = pl_id;
        this.pl_team_Id = pl_team_Id;
        this.pl_name = pl_name;
        this.pl_role = pl_role;
    }

    public int getPl_id() {
        return pl_id;
    }

    public void setPl_id(int pl_id) {
        this.pl_id = pl_id;
    }

    public int getPl_team_Id() {
        return pl_team_Id;
    }

    public void setPl_team_Id(int pl_team_Id) {
        this.pl_team_Id = pl_team_Id;
    }

    public String getPl_name() {
        return pl_name;
    }

    public void setPl_name(String pl_name) {
        this.pl_name = pl_name;
    }

    public String getPl_role() {
        return pl_role;
    }

    public void setPl_role(String pl_role) {
        this.pl_role = pl_role;
    }
}
