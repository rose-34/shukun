package com.example.demo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.code.example.entity.User;
import com.example.demo.code.example.service.IUserService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MpApplicationTests {

	@Autowired
	private IUserService user;
//https://blog.csdn.net/qq_41354631/article/details/90260486 使用插件里 service方法大全

	@Test 
    public void testSelect() {
	User use=user.getById("1");
   System.out.println(use.getName()+"   "+use.getAge());
   User use1=user.getOne(null);
   System.out.println(use1.getName()+"   "+use1.getAge());
   
   QueryWrapper<User> queryWrapper1 = new QueryWrapper<>();
   System.out.println( queryWrapper1.select("name"));
		   
   User uer=user.getOne(queryWrapper1);
   
   System.out.println(uer.getName()+"   dsfad "+uer.getAge());
   List<User> result = user.list(queryWrapper1);
   List<User> result1 = user.list(new QueryWrapper<User>().lt("age", 100).like("name","%c%"));
   for(User userd1 : result) {
	   System.out.println(userd1.getName()+"    sfa"+userd1.getAge()+ " fsf" +userd1.getId());
	 }

   for(User userd : result1) {
	   System.out.println(userd.getName()+"    sfa"+userd.getAge()+ " fsf" +userd.getId());
	 }

   
   
      
    }

}
