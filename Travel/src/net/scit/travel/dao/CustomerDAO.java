package net.scit.travel.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import net.scit.travel.vo.Customer;

public class CustomerDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	public int registCustomer(Customer customer) {
		SqlSession session = null;
		session = factory.openSession();
		
		CustomerMapper mapper = session.getMapper(CustomerMapper.class);
		
		int result = mapper.registCustomer(customer);
		session.commit();
		
		return result;
	}
}
