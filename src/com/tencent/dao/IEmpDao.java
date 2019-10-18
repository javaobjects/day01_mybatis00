package com.tencent.dao;

import com.tencent.pojo.Emp;

public interface IEmpDao {

	public Emp selectEmpByEmpno(int empno);
}
