package com.voterapp.service;

import com.voterapp.Exception.LocalityNotFOundException;
import com.voterapp.Exception.NoVoterIDException;
import com.voterapp.Exception.UnderAgeException;

public class ElectionBoothImpl implements IElectionBooth{

	
	@Override
	public boolean checkEligibility(int age, String locality, int vid) {
		return false;
		
	}
	private boolean checkAge(int age) throws UnderAgeException{
		if(age<18) {
			throw new UnderAgeException("Age less then 18");
		}
		return true;	
	}
	private boolean checLocality(String locality) throws LocalityNotFOundException {
		String[] Localities= {"Vijayanagar","Rajajinagar","Basavagudi"};
		for(String localplace:Localities) {
			if(locality.equals(localplace)) {
				return true;	
			}
		}
		throw new LocalityNotFOundException("No locality found");
		
		
	}
	private boolean checkVoterId(long voterId) throws NoVoterIDException {
		if(voterId<1000 && voterId>9999) {
			throw new NoVoterIDException("Invalid voter id");
		}
		return  true;
		
	}

}
