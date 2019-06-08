package zpl.model.visit.face;

import zpl.model.visit.model.CommonEmployee;
import zpl.model.visit.model.ManagerEmployee;

/**
 * 接口类,访问者接口
 * 
 * @author zpl
 *
 */
public interface IVisistor {

	/**
	 * 访问普通员工
	 * 
	 * @param commonEmployee
	 */
	public void visit(CommonEmployee commonEmployee);

	/**
	 * 访问管理人员
	 * 
	 * @param managerEmployee
	 */
	public void visit(ManagerEmployee managerEmployee);
}
