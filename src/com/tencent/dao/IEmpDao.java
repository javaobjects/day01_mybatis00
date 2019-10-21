package com.tencent.dao;

import com.tencent.pojo.Emp;

public interface IEmpDao {

	/**
	 * 
	 * <p>Title: selectEmpByEmpno</p>  
	 * <p>
	 *	Description: 
	 *  	查询
	 * </p> 
	 * @param empno
	 * @return
	 */
	public Emp selectEmpByEmpno(int empno);
	
	/**
	 * 
	 * <p>Title: insertEmp</p>  
	 * <p>
	 *	Description: 
	 * 	新增 
	 * </p> 
	 * @param emp
	 * @return
	 */
	public boolean insertEmp(Emp emp);
	
	/**
	 * 
	 * <p>Title: updateEmp</p>  
	 * <p>
	 *	Description: 
	 *  	修改
	 * </p> 
	 * @param emp
	 * @return
	 */
	public boolean updateEmp(Emp emp);
	
	/**
	 * 
	 * <p>Title: deleteEmp</p>  
	 * <p>
	 *	Description: 
	 *  	删除
	 * </p> 
	 * @param empno
	 * @return
	 */
	public boolean deleteEmp(int empno);
}
