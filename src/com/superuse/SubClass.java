package com.superuse;

class SubClass extends SuperClass {
	private int n;
	SubClass(int n) {
		super();//通过super显式调用父类构造方法；即使没有这行显式调用，Java仍然会隐式调用父类的无参构造方法
		System.out.println("SubClass(" + n + ")");
		this.n = n;
	}
	
	SubClass() {
		super(300);	//显式调用父类的特定构造方法
		System.out.println("SubClass()");
	}
}
