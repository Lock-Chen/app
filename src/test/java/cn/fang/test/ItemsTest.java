package cn.fang.test;

import cn.fang.dao.ItemsDao;
import cn.fang.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void FindB2yId(){
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        从容器中拿到所需要的dao的代理对象
        ItemsDao bean = ac.getBean(ItemsDao.class);
        Items byId = bean.findById(1);
        System.out.println(byId);
    }
}
