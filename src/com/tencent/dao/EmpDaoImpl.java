package com.tencent.dao;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tencent.pojo.Emp;

public class EmpDaoImpl implements IEmpDao {


	@Override
	public Emp selectEmpByEmpno(int empno) {
		try {
			//1.获取SqlSessionFactory接口
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMapConfig.xml"));
			
			//2.获取SqlSession接口
			SqlSession session = factory.openSession();
			
			//3.执行查询     参数一：SQL语句的id属性值    参数二：查询语句需要的参数parameterType
			Emp emp = (Emp)session.selectOne("selectEmpByEmpno", empno);
		
			//4.关闭连接
			session.close();
			
			return emp;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
