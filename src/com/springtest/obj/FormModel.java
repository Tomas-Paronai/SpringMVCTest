package com.springtest.obj;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FormModel {
	
	private HashMap<String,String> formVals;
	private String labels[];
	
	public FormModel(String... labels){
		this.labels = labels;
	}
	
	public void insertAndBuild(String... vals){
		formVals = new LinkedHashMap<String,String>();
		for(int index = 0; index < labels.length; index++){
			formVals.put(labels[index], vals[index]);
		}
	}
	
	public HashMap<String,String> getFormVals(){
		return formVals;
	}
	
	public String[] getLabels(){
		return labels;
	}
}
