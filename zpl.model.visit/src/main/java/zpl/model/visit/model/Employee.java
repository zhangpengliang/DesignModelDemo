package zpl.model.visit.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zpl.model.visit.face.IVisistor;

/**
 * ��Աʵ������,һЩ������Ϣ
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
	 * ��ӡ������Ϣ
	 * 
	 * @param employee
	 * @return
	 */
	public String getBasiceInfo() {
		String info = "������" + this.name + "\t";
		info += ("�Ա�" + (this.gender == 0 ? "Ů" : "��") + "\t");
		info += "���䣺" + this.age + "\t";
		return info;
	}

}
