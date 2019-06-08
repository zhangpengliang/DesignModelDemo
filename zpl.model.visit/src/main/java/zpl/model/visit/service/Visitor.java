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
	 * 打印基本信息
	 * 
	 * @param employee
	 * @return
	 */
	private String getBasiceInfo(Employee employee) {
		String info = "姓名：" + employee.getName() + "\t";
		info += ("性别：" + (employee.getGender() == 0 ? "女" : "男") + "\t");
		info += "年龄：" + employee.getAge() + "\t";
		return info;
	}

	private String getManagerInfo(ManagerEmployee managerEmployee) {
		return this.getBasiceInfo(managerEmployee) + "业绩：" + managerEmployee.getPerformance();
	}

	private String getCommonInfo(CommonEmployee commonEmployee) {
		return this.getBasiceInfo(commonEmployee) + "工作：" + commonEmployee.getJob();
	}
}
