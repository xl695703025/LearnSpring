package com.yuxia.printer;

import java.awt.Color;


public class ColorInkImpl implements Ink {

	public String getColor(int r, int g, int b) {
		Color color =new Color(r, b, g);	
		return "#"+Integer.toHexString(color.getRGB()).substring(2);
	}

}
