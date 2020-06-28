public class BikeStationMain{
	
	public static void main(String[] args){
        BikeStation station1=new BikeStation("timoleon",10);
        Bike velo1=new Bike("b001",BikeModel.ELECTRIC);
        Bike velo2=new Bike("b002",BikeModel.ELECTRIC);
        station1.dropBike(velo1);
        station1.dropBike(velo2);
        
		try{
            Bike bike= station1.takeBike(Integer.valueOf(args[0]));
            if(bike!=null){
                System.out.println(bike.toString());
            }else{
                System.out.println("pas de vélo a cet emplacement ): ");
            }
        }
        catch(Exception e){
            System.out.println("absence de parametre sur ligne de commande !!");
        }
	}
}