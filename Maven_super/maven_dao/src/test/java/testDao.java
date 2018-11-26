import com.itheima.dao.ItmesDao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDao {
    @Test
    public  void  testDao(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        ItmesDao itmesDao = ac.getBean(ItmesDao.class);
        Items byId = itmesDao.findById(1);
        System.out.println(byId.getName());

    }
}
