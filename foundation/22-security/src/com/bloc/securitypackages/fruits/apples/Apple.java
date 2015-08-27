package com.bloc.securitypackages.fruits.apples;


import com.bloc.securitypackages.fruits.Fruit;
import com.bloc.securitypackages.colors.Color;
/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

abstract class Apple extends Fruit {

	abstract void bite();
        
        public Apple(String name, int calories, Color color, double weight){
            super(name,calories,color,weight);
        }

}