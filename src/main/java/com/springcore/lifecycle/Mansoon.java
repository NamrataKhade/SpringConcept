package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Mansoon implements InitializingBean, DisposableBean {
	private String month;

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Mansoon(String month) {
		super();
		this.month = month;
	}

	public Mansoon() {
		super();
	}

	@Override
	public String toString() {
		return "Mansoon [month=" + month + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// init
		System.out.println("taking Mansoon: init");

	}

	public void destroy() throws Exception {
//init
		System.out.println("Going to  complte mansoon season: destory");
	}

}
