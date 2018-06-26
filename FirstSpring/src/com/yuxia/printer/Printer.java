package com.yuxia.printer;
/**
 * 打印机
 * @author YuXia
 * @date 2018年6月22日
 */
public class Printer {

	//墨盒
	private Ink ink=null;
	//纸张
	private Paper paper=null;
	public Ink getInk() {
		return ink;
	}
	public void setInk(Ink ink) {
		this.ink = ink;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public void print(String str){
		System.out.println("使用"+ink.getColor(255,255, 0)+"颜色打印");
		for(int i=0;i<str.length();i++){
			paper.putInChar(str.charAt(i));
		}
		System.out.println(paper.getContent());
	}
}
