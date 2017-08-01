import com.andlinks.demo.dao.IUserDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 陈亚兰 on 2017/7/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext-dao.xml", "classpath:applicationContext-service.xml" })
public class BaseTest {
    @Autowired
    private IUserDao iUserDao;
}
