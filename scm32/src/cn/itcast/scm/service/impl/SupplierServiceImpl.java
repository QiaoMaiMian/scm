package cn.itcast.scm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.scm.dao.SupplierMapper;
import cn.itcast.scm.entity.Supplier;
import cn.itcast.scm.service.SupplierService;

@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	private SupplierMapper supplierMapper;

	@Override
	public int insert(Supplier supplier) throws Exception {
		// TODO Auto-generated method stub
		return supplierMapper.insert(supplier);
	}

	@Override
	public Supplier select(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Supplier> selectUseDyc(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}
