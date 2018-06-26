package com.yuxia.printer;

/**
 * 纸张接口
 * 
 * @author YuXia
 * @date 2018年6月22日
 */
public interface Paper {

	// 用于插入换行符
	public static final String newLine = "\r\n";
	/**
	 * 输出一个字符到纸张
	 * @param c
	 */
	public void putInChar(char c);
	/**
	 * 获取纸张内容
	 */
	public String getContent();
}
