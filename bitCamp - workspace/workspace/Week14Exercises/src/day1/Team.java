package day1;

public class Team implements Comparable<Team>{
	
	Integer id;
	String name;
	Integer wins;
	Integer losses;
	Integer points;
	Integer scoredPlus;
	Integer scoredMinus;
	String fromGroup;
	
	public Team(Integer id, String name, Integer wins, Integer losses,
			Integer points, Integer scoredPlus, Integer scoredMinus,
			String fromGroup) {
		this.id = id;
		this.name = name;
		this.wins = wins;
		this.losses = losses;
		this.points = points;
		this.scoredPlus = scoredPlus;
		this.scoredMinus = scoredMinus;
		this.fromGroup = fromGroup;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWins() {
		return wins;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

	public Integer getLosses() {
		return losses;
	}

	public void setLosses(Integer losses) {
		this.losses = losses;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getScoredPlus() {
		return scoredPlus;
	}

	public void setScoredPlus(Integer scoredPlus) {
		this.scoredPlus = scoredPlus;
	}

	public Integer getScoredMinus() {
		return scoredMinus;
	}

	public void setScoredMinus(Integer scoredMinus) {
		this.scoredMinus = scoredMinus;
	}

	public String getFromGroup() {
		return fromGroup;
	}

	public void setFromGroup(String fromGroup) {
		this.fromGroup = fromGroup;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Team [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", wins=");
		builder.append(wins);
		builder.append(", losses=");
		builder.append(losses);
		builder.append(", points=");
		builder.append(points);
		builder.append(", scoredPlus=");
		builder.append(scoredPlus);
		builder.append(", scoredMinus=");
		builder.append(scoredMinus);
		builder.append(", fromGroup=");
		builder.append(fromGroup);
		builder.append("]\n");
		return builder.toString();
	}

	@Override
	public int compareTo(Team o) {
		return scoredPlus.compareTo(o.getScoredPlus());
	}
	
	

}
