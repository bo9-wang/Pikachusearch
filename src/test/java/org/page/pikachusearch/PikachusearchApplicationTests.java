package org.page.pikachusearch;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PikachusearchApplicationTests {



    @Test
    void contextLoads() {
        String str1 = "11";
        String str2 = "22";
        stringTest(str1,str2);
        System.out.println(str1+",,"+str2);
    }

    void stringTest(String str1,String str2){
        str1 = "111";
        str2 = "222";

    }

}
