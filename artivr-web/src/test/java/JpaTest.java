import com.artivr.Application;
import com.artivr.web.config.BaseConfiguration;
import com.artivr.web.config.LogConfiguration;
import com.artivr.web.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class JpaTest {
    @Autowired
    private UserService userService;
    @Autowired
    private BaseConfiguration baseConfiguration;
    @Autowired
    private LogConfiguration logConfiguration;
    @Test
    public void dataSourceTest(){
        baseConfiguration.toString();
        logConfiguration.toString();
    }
}
