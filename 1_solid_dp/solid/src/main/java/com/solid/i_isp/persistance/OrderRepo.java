package com.solid.i_isp.persistance;

import com.solid.i_isp.entity.Order;

import java.util.List;

public class OrderRepo implements Repository<Order>{

	@Override
	public void save(Order entity) {
		System.out.println("save order");
	}

	@Override
	public void delete(Order entity) {
		System.out.println("delete order");
	}

	@Override
	public Order findById(Long id) {
		System.out.println("findById order");
		return null;
	}

	@Override
	public List<Order> findByName(String name) {
		throw new UnsupportedOperationException();
	}

}
