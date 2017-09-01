package com.example.condition;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class IceCream implements Dessert{
public void eat() {
	System.out.println("eating:IceCream");
}
}
