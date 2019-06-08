package zpl.facade.pattern.face;

public interface ILetterProcess {

	/**
	 * д����
	 * 
	 * @param content
	 */
	void writeContent(String content);

	/**
	 * д�ŷ�
	 * 
	 * @param envelope
	 */
	void fillEnvelop(String envelope);

	/**
	 * װ���ŷ�
	 */
	void letterToEnvelope();

	/**
	 * �����ż�
	 */
	void sendLetter();
}
