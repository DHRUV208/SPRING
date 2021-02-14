package com.ncu.CI;

public class TennisCoach implements ICoach {

	//define a private field for dependency
	private IFortune ifortune;
	public TennisCoach(IFortune ifortune) {
		this.ifortune=ifortune;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice batting 15hrs daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}

}