import com.itheima.dao.ItmesDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testservice {
    @Test
    public  void  testService(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-service.xml");
        ItemsService bean = ac.getBean(ItemsService.class);
        Items byId = bean.findById(1);
        System.out.println(byId.getName());

    }
}
