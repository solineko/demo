package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BlankDisc implements CompactDisc{
private String title;
private String artist;
private List<String> tracks;
@Autowired
public BlankDisc(String title,String artist,List<String> tracks) {
	this.title=title;
	this.artist=artist;
	this.tracks=tracks;
}
//public void setTitle(String title) {
//	this.title=title;
//}
//public void setArtist(String artist) {
//	this.artist=artist;
//}
//public void setTracks(List<String> tracks) {
//	this.tracks=tracks;
//}
public void play() {
	System.out.println("Playing:"+title+"By"+artist);
	for(String track:tracks) {
		System.out.println(track);
	}
}
}
