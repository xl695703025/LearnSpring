package com.yuxia.printer;
/**
 * 墨盒接口
 * @author YuXia
 * @date 2018年6月22日
 */
public interface Ink {

	/**
	 * 获取打印的颜色
	 * @return
	 */
	public String getColor(int r,int g,int b);
}
