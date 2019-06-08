package zpl.model.visit.service;

import org.springframework.stereotype.Service;

import zpl.model.visit.face.IVisistor;
import zpl.model.visit.model.CommonEmployee;
import zpl.model.visit.model.Employee;
import zpl.model.visit.model.ManagerEmployee;

@Service
public class Visitor implements IVisistor {

	public void visit(CommonEmployee commonEmployee) {
		System.out.println(this.getCommonInfo(commonEmployee));
	}

	public void visit(ManagerEmployee managerEmployee) {
		System.out.println(this.getManagerInfo(managerEmployee));
	}

	/**
	 * ��ӡ������Ϣ
	 * 
	 * @param employee
	 * @return
	 */
	private String getBasiceInfo(Employee employee) {
		String info = "������" + employee.getName() + "\t";
		info += ("�Ա�" + (employee.getGender() == 0 ? "Ů" : "��") + "\t");
		info += "���䣺" + employee.getAge() + "\t";
		return info;
	}

	private String getManagerInfo(ManagerEmployee managerEmployee) {
		return this.getBasiceInfo(managerEmployee) + "ҵ����" + managerEmployee.getPerformance();
	}

	private String getCommonInfo(CommonEmployee commonEmployee) {
		return this.getBasiceInfo(commonEmployee) + "������" + commonEmployee.getJob();
	}
}
