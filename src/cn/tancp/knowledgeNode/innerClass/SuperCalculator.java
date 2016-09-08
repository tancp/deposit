package cn.tancp.knowledgeNode.innerClass;

public class SuperCalculator {
	public void add(int a, int b, DoJob customer) {
		int result = a + b;
		customer.fillBlank(a, b, result);
	}
}