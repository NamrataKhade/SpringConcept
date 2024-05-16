package com.springcore.springexpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/springexpression/spelconfig.xml");
		Demo d=context.getBean("demo",Demo.class);
		System.out.println(d);
		
	SpelExpressionParser temp=	new SpelExpressionParser();
      Expression expession= temp.parseExpression("22+25");
       System.out.println(expession.getValue());
	}

}
