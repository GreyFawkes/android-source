package com.bloc.securitypackages.fruits;

import com.bloc.securitypackages.colors.*;
/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

public abstract class Fruit extends Object {
	// The name of the fruit
	private String mName;
	// Number of calories
	private int mCalories;
	// Color of the fruit
	private Color mColor;
	// Weight of the fruit, in pounds
	private double mWeight;

	protected Fruit() {
		this("Apple");
		// Default fruit
	}

	protected Fruit(String name) {
		this(name, 0);
	}

	protected Fruit(String name, int calories) {
		this(name, calories, null);
	}

	protected Fruit(String name, int calories, Color color) {
		this(name, calories, color, 0d);
	}

	protected Fruit(String name, int calories, Color color, double weight) {
		this.mName = name;
		this.mCalories = calories;
		this.mColor = color;
		this.mWeight = weight;
	}

	private String getName() {
		return mName;
	}

	private void setName(String name) {
		mName = name;
	}

	int getCalories() {
		return mCalories;
	}

	void setCalories(int calories) {
		mCalories = calories;
	}

	public Color getColor() {
		return mColor;
	}

	private void setColor(Color color) {
		mColor = color;
	}

	protected double getWeight() {
		return mWeight;
	}

	protected void setWeight(double weight) {
		mWeight = weight;
	}
}