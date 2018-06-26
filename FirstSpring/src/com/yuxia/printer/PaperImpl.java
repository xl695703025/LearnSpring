package com.yuxia.printer;

public class PaperImpl implements Paper {

	// 每行的字符数
	private int charPerLine = 16;
	// 每页行数
	private int linePerPage = 5;
	// 纸张内容
	private String content = "";
	// 当前横向位置，从0开始到charPerLine-1
	private int posX = 0;
	// 当前纵向位置，从0开始到LinePerPage-1
	private int posY = 0;
	// 当前页数
	private int posP = 1;

	public void putInChar(char c) {
		content += c;
		++posX;
		// 判断是否要换行
		if (posX == charPerLine) {
			content += Paper.newLine;
			posX = 0;
			++posY;
		}
		// 判断是否要翻页
		if (posY == linePerPage) {
			content += "==第" + posP + "页==";
			content += Paper.newLine + Paper.newLine;
			posY = 0;
			++posP;
		}

	}

	public String getContent() {
		String ret = this.content;
		if (!(posX == 0 && posY == 0)) {
			int count = linePerPage - posY;
			for (int i = 0; i < count; i++) {
				ret += Paper.newLine;
			}
			ret += "==第" + posP + "页==";
		}
		return ret;
	}

	public void setCharPerLine(int charPerLine) {
		this.charPerLine = charPerLine;
	}

	public void setLinePerPage(int linePerPage) {
		this.linePerPage = linePerPage;
	}

}
