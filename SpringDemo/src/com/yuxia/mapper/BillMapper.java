package com.yuxia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yuxia.entity.Bill;

public interface BillMapper {

	public List<Bill> selectByProductName(String name);
	public List<Bill> selectByProviderId(int providerId);
	public List<Bill> selectByIsPayment(int flag);
	
	public List<Bill> selectBill(@Param("name")String name,@Param("id")int providerId,@Param("flag")int flag);
	
	public List<Bill> selectBillList(@Param("productName")String name,@Param("providerId")int id,@Param("isPayment")int isPayment);
}
