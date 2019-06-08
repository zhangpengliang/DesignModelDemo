package zpl.model.visit.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zpl.model.visit.face.IVisistor;

/**
 * �߹ܵȹ�����Ա
 * 
 * @author zpl
 *
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ManagerEmployee extends Employee {

	private static final long serialVersionUID = 1L;

	private String performance;

	public String getManagerInfo() {
		return this.getBasiceInfo() + "ҵ����" + this.performance;
	}

	/**
	 * ������ģʽ���
	 */
	@Override
	public void accept(IVisistor visitor) {
		visitor.visit(this);
	}

}
