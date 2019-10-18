package com.tencent.test;

import com.tencent.dao.EmpDaoImpl;
import com.tencent.dao.IEmpDao;
import com.tencent.pojo.Emp;

public class Test {

	public static void main(String[] args) {
		IEmpDao empDao = new EmpDaoImpl();
		
		//查询
		Emp emp = empDao.selectEmpByEmpno(7788);
		System.out.println(emp);
	}

}
