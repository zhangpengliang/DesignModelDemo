package zpl.model.visit.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zpl.model.visit.face.IVisistor;

/**
 * ��ͨԱ��
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
		return this.getBasiceInfo() + "������" + this.job;
	}

	/**
	 * ����ģʽ���
	 */
	@Override
	public void accept(IVisistor visitor) {
		visitor.visit(this);
	}

}
