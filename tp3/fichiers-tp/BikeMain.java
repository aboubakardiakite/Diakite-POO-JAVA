public class BikeMain{
	
	public static void main(String[] args){
		Bike velo1=new Bike("b001",BikeModel.CLASSICAL);
		Bike velo2=new Bike("b002",BikeModel.ELECTRIC);
		System.out.println(velo1.equals(velo2));
		System.out.println(velo1.toString());

	}
}
