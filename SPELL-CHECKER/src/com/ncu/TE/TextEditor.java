package com.ncu.TE;


public class TextEditor {
private SpellChecker sc;
public TextEditor(SpellChecker sc) {
	this.sc=sc;
	
}
public void SpellChecker() {
	sc.display();
}
}
