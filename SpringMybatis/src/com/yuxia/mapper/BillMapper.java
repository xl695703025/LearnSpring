package com.yuxia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yuxia.entity.Bill;

public interface BillMapper {

	public List<Bill> getBillList(@Param("productName")String productName,@Param("providerId")Integer providerId,@Param("isPayment")Integer isPayment);
}
