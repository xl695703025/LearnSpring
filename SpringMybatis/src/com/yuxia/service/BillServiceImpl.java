package com.yuxia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuxia.entity.Bill;
import com.yuxia.mapper.BillMapper;
@Service("billService")
public class BillServiceImpl implements BillService {

	@Autowired
	private BillMapper billMapper;
	public List<Bill> getBillList(String productName,Integer providerId,Integer isPayment) {
		return billMapper.getBillList(productName, providerId, isPayment);
	}
}
