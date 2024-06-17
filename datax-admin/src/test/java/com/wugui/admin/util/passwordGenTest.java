package com.wugui.admin.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @description TODO
 * @Author huangsq
 * @Date 2024/3/18 下午3:08
 **/
public class passwordGenTest {
    public static void main(String[] args) {
        String encode = new BCryptPasswordEncoder().encode("123456");
        System.out.println(encode);
        //$2a$10$2KCqRbra0Yn2TwvkZxtfLuWuUP5KyCWsljO/ci5pLD27pqR3TV1vy
    }
}
