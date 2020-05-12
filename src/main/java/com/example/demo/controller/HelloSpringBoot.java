package com.example.demo.controller;

import com.example.demo.annotation.Auth;
import com.example.demo.annotation.MyAnnotation;
import com.example.demo.bean.UsercoreUserRegister;
import com.example.demo.pojo.User;
import com.example.demo.service.UserRegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author fanzq22858
 * @version $Id: HelloSpringBoot.java, v 0.1 2018/7/9 10:33 Exp $
 */
@Controller
public class HelloSpringBoot {

    @Resource
    private UserRegisterService userRegisterService;
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    @Autowired
//    private RedisTemplate redisTemplate;

    @Auth("admin")
    @RequestMapping("/helloSpringBoot")
    @MyAnnotation(value = "这是第一个Controller啊")
    public String helloSpring(Model model) throws Exception {
        System.out.println("hello spring boot");
        List<UsercoreUserRegister> list = userRegisterService.selectList(1, 10);
//        stringRedisTemplate.opsForValue().set("token","12121111");
        model.addAttribute("list", list);
//        System.out.println(stringRedisTemplate.opsForValue().get("token"));

        User user = new User();
        user.setAge(12);
        user.setName("阿訇");
        user.setBirth(new Date());
        user.setAddress("天堂别墅10号");
        return "hello";
    }


    public static void main(String[] args) {
        int[] array = {38, 65, 97, 76, 13, 27, 49};
        doBubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }


    /**
     * 插入排序方法
     */
    public static void doInsertSort(int[] array) {
        for (int index = 1; index < array.length; index++) {
            int temp = array[index];
            int leftindex = index - 1;
            while (leftindex >= 0 && array[leftindex] > temp) {
                array[leftindex + 1] = array[leftindex];
                leftindex--;
            }
            array[leftindex + 1] = temp;
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /**
     * 冒泡排序方法
     * @param array
     */
    public static void doBubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp;
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
