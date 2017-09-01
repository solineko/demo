package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CDPlayer implements MediaPlayer{
private CompactDisc compactDisc;
@Autowired
public void setCompactDisc(CompactDisc compactDisc) {
	this.compactDisc=compactDisc;
}
//@Autowired
//public CDPlayer(CompactDisc compactDisc) {
//	this.compactDisc=compactDisc;
//}
public void play() {
	compactDisc.play();
}
}
