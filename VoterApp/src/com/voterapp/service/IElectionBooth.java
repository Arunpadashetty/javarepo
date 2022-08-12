package com.voterapp.service;

public interface IElectionBooth {
	boolean checkEligibility(int age,String locality,int vid);

}
