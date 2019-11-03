package com.match.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "match_details")
public class Match  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "match_id")
    private int matchId;

    @Column(name = "date")
    private String date;
    
    @Column(name = "series_name")
    private String series_name;
    
    @Column(name = "run_scored")
    private String runScored;

    @Column(name = "player_id")
    private int playerId;

    public Match() {

    }

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSeries_name() {
		return series_name;
	}

	public void setSeries_name(String series_name) {
		this.series_name = series_name;
	}

	public String getRunScored() {
		return runScored;
	}

	public void setRunScored(String runScored) {
		this.runScored = runScored;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	

}