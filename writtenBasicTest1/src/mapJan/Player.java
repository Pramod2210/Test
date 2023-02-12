package mapJan;

public class Player {
 int id;
 String name,country,team;
public Player(int id, String name, String country, String team) {
	
	this.id = id;
	this.name = name;
	this.country = country;
	this.team = team;
}
@Override
public String toString() {
	return "Player id=" + id + ", name=" + name + ", country=" + country + ", team=" + team + "]";
}
 
}
