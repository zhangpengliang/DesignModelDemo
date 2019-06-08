package zpl.facade.pattern.face;

public interface ILetterProcess {

	/**
	 * 写内容
	 * 
	 * @param content
	 */
	void writeContent(String content);

	/**
	 * 写信封
	 * 
	 * @param envelope
	 */
	void fillEnvelop(String envelope);

	/**
	 * 装进信封
	 */
	void letterToEnvelope();

	/**
	 * 发送信件
	 */
	void sendLetter();
}
