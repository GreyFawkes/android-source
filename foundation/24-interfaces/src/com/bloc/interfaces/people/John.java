package com.bloc.interfaces.people;

import com.bloc.interfaces.people.hobbies.Driver;
/************************************************
 *	ASSIGNMENT:
 *	Have John implement the Driver interface
/************************************************/

public class John extends Person implements Driver{
	public John() {
		super("John", "Smith", "Male", 1.7d, 69d, "Brown");
	}

    @Override
    public void getInCar() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void startEngine() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void driveFast() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}