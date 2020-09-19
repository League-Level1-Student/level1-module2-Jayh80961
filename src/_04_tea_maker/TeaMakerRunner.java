package _04_tea_maker;

public class TeaMakerRunner {
	public static void main(String[] args) {
		TeaBag teabag = new TeaBag("Green");
		Kettle kettle = new Kettle();
		kettle.getWater();
		kettle.boil();
		Cup cup = new Cup();
		cup.makeTea(teabag,kettle.getWater());
		
		
		
		
	}
}
