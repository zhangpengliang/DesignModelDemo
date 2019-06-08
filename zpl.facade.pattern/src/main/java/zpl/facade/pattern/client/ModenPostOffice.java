package zpl.facade.pattern.client;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import zpl.facade.pattern.face.ILetterProcess;

/**
 * 门面模式,用于封装各个步骤,<br>
 * 对client用户来说是不需要知道详细步骤的,只需要把必要的东西给我就可以
 * 
 * @author zpl
 *
 */
@Service
public class ModenPostOffice {

	@Resource
	private ILetterProcess letterProcess;

	/**
	 * 邮局发送邮件
	 * 
	 * @param content
	 * @param address
	 */
	public void sendLetter(String content, String address) {
		letterProcess.writeContent(content);
		letterProcess.fillEnvelop(address);
		letterProcess.letterToEnvelope();
		letterProcess.sendLetter();
	}

}
