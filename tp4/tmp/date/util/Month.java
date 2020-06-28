package date.util;

import date.Date;


public enum Month{
	january(31), february(28), march(31), april(30),may(31),
	june(30), july(31), september(30), october(31), november(30),
	december(31);

	private final int nbDays;

	private Month(int nbDays){
		this.nbDays=nbDays;
	}
	
	/**returns the number of days of this month for given year
	 *@param year the considered year
	 *@return the number of days of this month for given year
	 */
	public int nbDays(int year){
		//if this isn't february or year is not bissextile
		if(this !=Month.february || !Date.isBissextile(year)){
			return this.nbDays;
		}else{
			return this.nbDays+1;
		}

	}
	/**
	 * @return returns the month following this one
	 */

	public Month next(){
		return Month.values()[(this.ordinal()+1)%Month.values().length];
	}
}	
