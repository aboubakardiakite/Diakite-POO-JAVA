public class BikeStation {

	// DEFINIR LES ATTRIBIUTS
	private String name;
	private  int capacity;
	private Bike[] Station;
	private Bike dispo;
    /**creat a bikeStation with given name and capacity
     * @param name this bikeStation's name
	 * @param capacity this bikeStation's capacity
     */
	public BikeStation(String name, int capacity) {

		this.name=name;
		this.capacity=capacity;
		this.Station=new Bike[capacity];

	}
	
    /**return this bikeStation's name
     * @return the name of this bikeStation
     */
	public String getName(){
		return this.name;
	}

    /** return this bikeStation's  capacity
	 * @return the capacity of this bikeStation
	 */
	public int getCapacity() {
		return this.capacity;
	}

    /**
	 * the number of bikes available
     * @return the number of bikes present
     */
	public int getNumberOfBikes(){
		int placeLibre=0;
		for(int i=0;i<this.capacity;i++){
				if(this.Station[i]==null){
					placeLibre=placeLibre+1;
				}
		}
		return placeLibre;
	}

    
    /**
	 * return location of the first free bike
     * @return l'index of the first free bike else -1
     */
	public int firstFreeSlot(){
		for(int i=0;i<this.capacity;i++){
				if(this.Station[i]==null)
				{
					return i;
				}

		}
		return -1;
	}
	
    /**Cette m ́ethode permet de d ́eposer un v ́elo dans une station
     * @param bike to be dropped off
	 * @return a Boolean that is true if it was possible to deposit the bike and false if not.
     */
	public boolean dropBike(Bike bike){
		if(this.firstFreeSlot()!=-1){
			this.Station[this.firstFreeSlot()]=bike;
			return true;
		}else{
		return false;

		}
	}
	
	
	
    /** take a bike in a station
     * @param i the number of the bike to take
	 * @return return null if the bike is not available otherwise return the bike
     */
	public Bike takeBike(int i){
		
	    if((i<0) || (i>this.capacity) || this.Station[i]==null){
			return null;
		}

		this.dispo=this.Station[i];
		this.Station[i]=null;
	        return this.dispo;	
	}
}
