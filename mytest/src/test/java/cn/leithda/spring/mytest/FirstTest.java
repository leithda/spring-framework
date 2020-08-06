package cn.leithda.spring.mytest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


/**
 * Created with IntelliJ IDEA.
 * User: 长歌
 * Date: 2020/7/24
 * Description:
 */
public class FirstTest {

	@Test
	public void beanFactoryTest(){
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
		System.out.println(myTestBean);
	}

	@Test
	public void classPathXmlApplicationContextTest(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-first.xml");
		MyTestBean myTestBean = (MyTestBean) context.getBean("myTestBean");
		System.out.println(myTestBean);
	}
}