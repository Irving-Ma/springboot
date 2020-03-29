package com.irving.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irving.entity.InterfaceLimit;
import com.irving.mapper.InterfaceLimitMapper;
import com.irving.service.InterfaceLimitService;

import javax.annotation.Resource;

@Service
public class InterfaceLimitServiceImpl implements InterfaceLimitService {

	@Resource
	@Autowired
	private InterfaceLimitMapper mapper;

	@Override
	public InterfaceLimit getEntityByPri(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

}
