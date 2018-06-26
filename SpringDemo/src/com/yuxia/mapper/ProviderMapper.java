package com.yuxia.mapper;

import java.util.List;

import com.yuxia.entity.Provider;


public interface ProviderMapper {
	
	public Provider selectById(int id);
	public List<Provider> selectAll();
	
	public List<Provider> selectByProId(int id);
}
