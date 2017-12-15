package com.lxit.crmsystem;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lxit.crmsystem.dao.TestDao;
import com.lxit.crmsystem.entity.Client;
import com.lxit.crmsystem.entity.Role;
import com.lxit.crmsystem.util.Serialnumber;
/**
 * 测试类
 * @author Administrator
 *
 */
public class QyhTest {
	private static ApplicationContext ac;
	@Test
	public void test(){
		ac = new ClassPathXmlApplicationContext("spring.xml");
		SqlSessionFactory sessionFactory = ac.getBean(SqlSessionFactory.class);
		SqlSession sqlsession = sessionFactory.openSession();
		TestDao stu9 =  sqlsession.getMapper(TestDao.class);
			/*List<Client> list= stu9.selKh();
			for (Client client : list) {
				System.out.println(client.getClientId());
				if(client.getClientId()%2==0){
					client.setClientState(28);
				}else{
					client.setClientState(27);
				}
				stu9.updKh(client);
			}*/
			
		List<Role> list = stu9.selJs();
		for (Role role : list) {
			role.setRoleId(role.getRoleId());
			role.setDepartmentId(45);
			stu9.insertJs(role);
			role.setRoleId(role.getRoleId());
			role.setDepartmentId(46);
			stu9.insertJs(role);
			role.setRoleId(role.getRoleId());
			role.setDepartmentId(47);
			stu9.insertJs(role);
			role.setRoleId(role.getRoleId());
			role.setDepartmentId(48);
			stu9.insertJs(role);
			role.setRoleId(role.getRoleId());
			role.setDepartmentId(49);
			stu9.insertJs(role);
			role.setRoleId(role.getRoleId());
			role.setDepartmentId(50);
			stu9.insertJs(role);
			role.setRoleId(role.getRoleId());
			role.setDepartmentId(51);
			stu9.insertJs(role);
			role.setRoleId(role.getRoleId());
			role.setDepartmentId(52);
			stu9.insertJs(role);
		}
		sqlsession.close();
	}
}
