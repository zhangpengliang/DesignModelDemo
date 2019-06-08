package zpl.model.visit.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zpl.model.visit.model.CommonEmployee;
import zpl.model.visit.model.Employee;
import zpl.model.visit.model.ManagerEmployee;
import zpl.model.visit.service.Visitor;

@Controller
@RequestMapping("/test")
public class VisistorController {

	@Resource
	private Visitor visitor;

	/**
	 * 访问者模式
	 */
	@RequestMapping("/index1")
	public void visitorRequest1() {
		List<Employee> list = fillDate();
		for (Employee employee : list) {
			employee.accept(visitor);
		}

	}

	/**
	 * 如果不用访问者模式,就得用instanceof来判断
	 */
	@RequestMapping("/index2")
	public void visitorRequest2() {
		List<Employee> list = fillDate();
		for (Employee employee : list) {
			if (employee instanceof CommonEmployee) {
				System.out.println(((CommonEmployee) employee).getCommonInfo());
			} else {
				System.out.println(((ManagerEmployee) employee).getManagerInfo());
			}
		}
	}

	private List<Employee> fillDate() {
		List<Employee> list = new ArrayList<Employee>();
		CommonEmployee common = new CommonEmployee();
		common.setAge(12);
		common.setGender(1);
		common.setJob("开发");
		common.setName("张三");
		list.add(common);
		ManagerEmployee manage = new ManagerEmployee();
		manage.setAge(12);
		manage.setGender(1);
		manage.setPerformance("---90%---");
		manage.setName("李四");
		list.add(manage);
		return list;
	}
}
