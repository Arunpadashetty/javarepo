package com.movieapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieServiceImpl implements IMovieService {

	@Override
	public List<String> getByLanguage(String language) {
	
		if(language.equals("english")) {
			return new ArrayList<>(Arrays.asList("AntMan","SpiderMan","IronMan","BatMan"));
		}
		else if(language.equals("kannada")) {
			return new ArrayList<>(Arrays.asList("KGF1","KGF2","KGF3","Ugram","OM"));
		}
		else if(language.equals("hindi")) {
			return  new ArrayList<>(Arrays.asList("Agnipath","Mirjapur","Doom","Don"));
		}
		else if(language.equals("telagu")) {
			return  new ArrayList<>(Arrays.asList("Rebel","Vikram","Arya","Billa"));
		}
		
		else
			return  new ArrayList<>(Arrays.asList("Wickings"));
		}
		
	}


