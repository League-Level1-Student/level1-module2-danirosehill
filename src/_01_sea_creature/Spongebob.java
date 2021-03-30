package _01_sea_creature;

public class Spongebob {
public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature ("spongebob");
	spongebob.eat();
	spongebob.laugh();
	SeaCreature patrick = new SeaCreature ("patrick");
	patrick.eat();
	patrick.laugh();
	SeaCreature squidward = new SeaCreature ("squidward");
	squidward.eat();
	squidward.laugh();
}
}