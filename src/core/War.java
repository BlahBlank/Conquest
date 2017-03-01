package core;

import data.Country;

public class War {
	private Country atkCountry;
	private Country defCountry;
	
	public War(Country atkCountry, Country defCountry) {
		super();
		this.atkCountry = atkCountry;
		this.defCountry = defCountry;
	}
	//to be continued: supposed to deal with fight between two empires
	public void battle() {
		if (defCountry==0) {
			//Country belongs to atacking Empire
		}
		else if (atkCountry>defCountry){
			defCountry=0;
		}
		else if (atkCuntry<defCountry){
			atkCountry=0;
		}
		else{
			//Randomize winner?
			if (rando==1){
				defCountry=0;
			}
			else{
				atkCountry=0;
			}
		}
	}
}
