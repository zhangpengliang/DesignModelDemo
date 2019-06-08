package zpl.model.visit.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private Integer gender;

	private Integer age;

	private Integer salary;

}
