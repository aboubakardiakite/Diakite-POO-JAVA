package pfc.strategy;
import pfc.Choice;
import java.util.Random;
public class RandomStrategy implements Strategie{

	private static Random alea = new Random();

	public Choice strategy(){
			int i= alea.nextInt(Choice.values().length);
			return Choice.values()[i];
		}
}
