package zpl.model.visit.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private Integer gender;

	private Integer age;

	private Integer salary;

}
