import com.artivr.Application;
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
    @Test
    public void getUserCount(){
       int a = userService.getUserName(123456789);
       System.out.println(a);
    }
}
