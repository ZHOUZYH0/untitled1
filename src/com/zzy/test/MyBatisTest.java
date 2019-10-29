package com.zzy.test;

import com.zzy.model.User;
import com.zzy.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class MyBatisTest {
    @Test
    public void test_selectAllUser() throws Exception {
        //1、创建SqlSessionFactory对象，也是单例模式的
        SqlSessionFactory factory = MyBatisUtil.getSqlSessionFactory();
        //2、创建SqlSession对象
        SqlSession session = factory.openSession();
        //3、调用session的方法

        User u = new User();
        //通过id查找User
        /*
        u.setId(2);
        Object o = session.selectOne("user.selectById", u);
        System.out.println(o);*/

        //通过id更新User
        /*User u = new User();
        u.setId(2);
        u.setUsername("sss");
        u.setPassword("zzz");
        int update = session.update("user.updateById", u);
        session.commit();
        System.out.println(update);*/

        //添加User
        /*u.setUsername("111");
        u.setPassword("222");
        int insert = session.insert("user.addUser", u);
        System.out.println(insert);*/

        //删除
        /*u.setId(3);
        u.setUsername("111");
        u.setPassword("222");
        int delete = session.delete("user.delUser", u);
        System.out.println(delete);
        session.commit();*/

        //


//        session.commit();

        /*List<User> users = session.selectList("user.selectAllUser");
        //4、打印测试
        for(User u:users){
            System.out.println(u);
        }
        *///5、关闭资源
        session.close();
    }
}

