package com.superuse;

class SubClass extends SuperClass {
	private int n;
	SubClass(int n) {
		super();//ͨ��super��ʽ���ø��๹�췽������ʹû��������ʽ���ã�Java��Ȼ����ʽ���ø�����޲ι��췽��
		System.out.println("SubClass(" + n + ")");
		this.n = n;
	}
	
	SubClass() {
		super(300);	//��ʽ���ø�����ض����췽��
		System.out.println("SubClass()");
	}
}
