package zpl.facade.pattern.face;

import org.springframework.stereotype.Service;

@Service
public class LetterProcessImpl implements ILetterProcess {

	public void writeContent(String content) {
		System.out.println("内容：" + content);
	}

	public void fillEnvelop(String envelope) {
		System.out.println("信封内容：" + envelope);
	}

	public void letterToEnvelope() {
		System.out.println("装进信封.........\n");
	}

	public void sendLetter() {
		System.out.println("发送信封........\n");
	}

}
