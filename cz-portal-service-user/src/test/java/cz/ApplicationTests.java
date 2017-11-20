package cz;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.cz.user.domain.Address;
import com.cz.user.domain.User;
import com.cz.user.mapper.UserMapper;
import com.cz.user.service.AddressService;
import com.cz.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = com.cz.user.UserApplication.class)
public class ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;
    @Autowired
    private AddressService addressService;

    @Test
    public void test1(){
        User user = new User();
        user.setEmail("aluba");
        userService.insert(user);
    }

    @Test
    public void test2(){
        EntityWrapper ew = new EntityWrapper<Address>();
        ew.eq("username","user");
        List<Address> addresses = addressService.selectList(ew);
        System.out.println(addresses.toString());
    }
}