package net.scit.travel.dao;

import net.scit.travel.vo.Customer;

public interface CustomerMapper {
	// 회원 등록
	public int registCustomer(Customer customer);
}
