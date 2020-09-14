import org.junit.Test;
import sim.SimHash;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DevTest {

    @Test
    public void SimHashTest() throws IOException {
        SimHash simHash = new SimHash("你好");
    }

    @Test
    public void mapTest(){
        Map<String, Integer> test = new HashMap<>();
        test.put("h",0);
        if(test.containsKey("h")){
            test.put("h",test.get("h")+1);
            System.out.println("here");
        }
        Integer h = test.get("h");
        System.out.println(h);
    }

    @Test
    public void charTest(){
        String hello = "你好";
        char s = '你';
        String s1 = String.valueOf(s);
        System.out.println(s1);
    }

    @Test
    public void stringTest(){
        String test = "你好世界";
        System.out.println(test.length());
    }
}
