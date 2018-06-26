package com.yuxia.printer;

import java.awt.Color;

public class GreyInkImpl implements Ink{

	public String getColor(int r, int g, int b) {
		int c = (r+g+b)/3;
		Color color =new Color(c, c, c);	
		return "#"+Integer.toHexString(color.getRGB()).substring(2);
	}
}
