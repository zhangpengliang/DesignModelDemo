package zpl.model.visit.face;

import zpl.model.visit.model.CommonEmployee;
import zpl.model.visit.model.ManagerEmployee;

/**
 * �ӿ���,�����߽ӿ�
 * 
 * @author zpl
 *
 */
public interface IVisistor {

	/**
	 * ������ͨԱ��
	 * 
	 * @param commonEmployee
	 */
	public void visit(CommonEmployee commonEmployee);

	/**
	 * ���ʹ�����Ա
	 * 
	 * @param managerEmployee
	 */
	public void visit(ManagerEmployee managerEmployee);
}
