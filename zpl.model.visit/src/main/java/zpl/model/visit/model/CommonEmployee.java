package zpl.model.visit.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zpl.model.visit.face.IVisistor;

/**
 * 普通员工
 * 
 * @author zpl
 *
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommonEmployee extends Employee {

	private static final long serialVersionUID = 1L;

	private String job;

	public String getCommonInfo() {
		return this.getBasiceInfo() + "工作：" + this.job;
	}

	/**
	 * 访问模式添加
	 */
	@Override
	public void accept(IVisistor visitor) {
		visitor.visit(this);
	}

}
