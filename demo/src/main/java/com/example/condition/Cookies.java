package com.example.condition;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cookies implements Dessert{
public void eat() {
	System.out.println("eating:Cookies");
}
}
