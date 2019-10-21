package com.tencent.dao;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tencent.pojo.Emp;

public class EmpDaoImpl implements IEmpDao {


	/**
	 * 	查询
	 */
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

	/**
	 * 新增
	 */
	@Override
	public boolean insertEmp(Emp emp) {
		try {
			//1. 获取SqlSessionFactory接口
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("sqlMapConfig.xml"));
			//2. 获取SqlSession接口
			SqlSession session = factory.openSession();
			
			//3. 执行新增 参数一:SQL语句的id属性值 参数二 查询语句需要的参数parameterType
			int result = session.insert("insertEmp",emp);
			
			//3.1 提交事务---------------------------
			session.commit();
			
			//4. 关闭连接
			session.close();
			
			//5.处理结果
			if(result > 0) {
				return true;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	/**
	 * 更新
	 */
	@Override
	public boolean updateEmp(Emp emp) {
		try {
			//1. 获取SqlSessionFactory接口
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("sqlMapConfig.xml"));
			//2. 获取SqlSession接口
			SqlSession session = factory.openSession();
			
			//3. 执行新增 参数一:SQL语句的id属性值 参数二 查询语句需要的参数parameterType
			int result = session.insert("updateEmp",emp);
			
			//3.1 提交事务---------------------------
			session.commit();
			
			//4. 关闭连接
			session.close();
			
			//5.处理结果
			if(result > 0) {
				return true;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	
	/**
	 * 	删除
	 */
	@Override
	public boolean deleteEmp(int empno) {
		try {
			//1. 获取SqlSessionFactory接口
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("sqlMapConfig.xml"));
			//2. 获取SqlSession接口
			SqlSession session = factory.openSession();
			
			//3. 执行新增 参数一:SQL语句的id属性值 参数二 查询语句需要的参数parameterType
			int result = session.insert("deleteEmp",empno);
			
			//3.1 提交事务---------------------------
			session.commit();
			
			//4. 关闭连接
			session.close();
			
			//5.处理结果
			if(result > 0) {
				return true;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}
