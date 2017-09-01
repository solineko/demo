package com.example.condition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SetDessert {
private Dessert dessert;
@Autowired
public void setDessert(Dessert dessert) {
	this.dessert=dessert;
}
public void eat() {
	dessert.eat();
}
}
