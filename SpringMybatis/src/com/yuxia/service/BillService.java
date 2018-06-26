package com.yuxia.service;

import java.util.List;

import com.yuxia.entity.Bill;

public interface BillService {

	public  List<Bill>  getBillList(String productName,Integer providerId,Integer isPayment);
}
