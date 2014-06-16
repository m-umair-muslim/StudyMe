package com.rwth.i10.exercisegroups.Util;

public enum MessageCategories {

	MESSAGE, TYPE, ACTION;
	
	public String getString(){
		switch(this){
		case MESSAGE:
			return "com.rwth.i10.exercisegroups.message";
		
		case TYPE:
			return "com.rwth.i10.exercisegroups.type";
			
		case ACTION:
			return "com.rwth.i10.exercisegroups.action";
			
			default:
				return "";
		}
	}
}
