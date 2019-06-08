package zpl.facade.pattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zpl.facade.pattern.client.ModenPostOffice;

/**
 * 门面模式（外观模式）
 * 
 * @author zpl
 *
 */
@Controller
@RequestMapping("face")
public class FacadeController {

	@Autowired
	private ModenPostOffice modenPostOffice;

	@RequestMapping("/send")
	public void sendLetter(String content, String address) {
		modenPostOffice.sendLetter(content, address);
	}

}
