package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{
private String title="Sgt. Pepper's Lonely Hearts Club Bands";
private String artist="The Beatles";
public void play() {
	System.out.println("Playing:"+title+"By"+artist);
}
}
