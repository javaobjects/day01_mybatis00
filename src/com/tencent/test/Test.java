package com.tencent.test;

import com.tencent.dao.EmpDaoImpl;
import com.tencent.dao.IEmpDao;
import com.tencent.pojo.Emp;

public class Test {

	public static void main(String[] args) {
		IEmpDao empDao = new EmpDaoImpl();
		
		//查询
//		Emp emp = empDao.selectEmpByEmpno(7788);
//		System.out.println(emp);
		//新增
		Emp emp = new Emp("0","张三","程序员");
		System.out.println("新增" + empDao.insertEmp(emp));
		System.out.println("参数emp: " + emp);
		//更新
		
//		Emp emp = new Emp();
//		emp.setEname("张三2");
//		emp.setEmpno("1111");
//		System.out.println("更新" + empDao.updateEmp(emp));
		
		//删除
//		System.out.println("删除" + empDao.deleteEmp(1111));
	}

}
