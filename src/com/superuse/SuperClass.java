package com.superuse;

class SuperClass {
	private int n;
	
	SuperClass() {
		System.out.println("SuperClass()");
	}
	
	SuperClass(int n) {
		System.out.println("SuperClass(" + n + ")");
		this.n = n;
	}

}
