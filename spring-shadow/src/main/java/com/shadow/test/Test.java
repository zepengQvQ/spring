package com.shadow.test;

import com.shadow.app.Appconfig;
import com.shadow.dao.MemberDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j(topic = "e")
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				as
				= new AnnotationConfigApplicationContext(Appconfig.class);
		System.out.println(as.getBean(MemberDao.class));
		MemberDao bean = as.getBean(MemberDao.class);
		bean.test1();

//		log.debug();

	}
}
