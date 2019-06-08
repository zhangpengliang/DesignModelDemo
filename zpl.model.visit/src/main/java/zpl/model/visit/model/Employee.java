package zpl.model.visit.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zpl.model.visit.face.IVisistor;

/**
 * 人员实例对象,一些基本信息
 * 
 * @author zpl
 *
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private Integer gender;

	private Integer age;

	private Integer salary;

	public abstract void accept(IVisistor visitor);

	/**
	 * 打印基本信息
	 * 
	 * @param employee
	 * @return
	 */
	public String getBasiceInfo() {
		String info = "姓名：" + this.name + "\t";
		info += ("性别：" + (this.gender == 0 ? "女" : "男") + "\t");
		info += "年龄：" + this.age + "\t";
		return info;
	}

}
