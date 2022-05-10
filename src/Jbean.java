
public class Jbean {
//-----------used in multiple classes--------
	private String option;
	private String choice;
	private String anwser;
//-----------used in Name class-----------
	private String name;
//-----------used in Surname class--------
	private String surname;
//-----------used in Basketball class-----
	private String player;
	private String team;
	private String team2;
//-----------used in Weather class--------
	private String preference;
	private String reason;
	private String season;
	private String month;
//-----------used in Math class------------
	private int firstInt;
	private int secondInt;
	private int solution;


	public void bean(String option, String name, String surname, String player, String team, String team2, String anwser,String preference, String reason, String season, String month, String choice,int firstInt, int secondInt, int solution){
		this.option = option;
		this.name = name;
		this.surname = surname;
		this.name = player;
		this.surname = team;
		this.surname = team2;
		this.anwser = anwser;
		this.preference = preference;
		this.reason = reason;
		this.season = season;
		this.month = month;
		this.choice = choice;
		this.firstInt = firstInt;
		this.secondInt = secondInt;
		this.solution = solution;
		
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public int getFirstInt() {
		return firstInt;
	}

	public void setFirstInt(int firstInt) {
		this.firstInt = firstInt;
	}

	public int getSecondInt() {
		return secondInt;
	}

	public void setSecondInt(int secondInt) {
		this.secondInt = secondInt;
	}

	public String getAnwser() {
		return anwser;
	}

	public void setAnwser(String anwser) {
		this.anwser = anwser;
	}

	public int getSolution() {
		return solution;
	}

	public void setSolution(int solution) {
		this.solution = solution;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getName() {
		return name;	
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getTeam2() {
		return team2;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}