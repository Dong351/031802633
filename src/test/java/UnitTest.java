import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class UnitTest {

    /**
     * 测试给出的示例原本
     */
    @Test
    public void simTest() throws IOException {
        File folder = new File("src/TestFile/sim_0.8");
        File[] files = folder.listFiles();
        for(File file:files){
            if(file == files[0]){
                continue;
            }
            System.out.println(files[0].getName()+" 与文本 " + file.getName() + "的相似度为：");
            Unit.ans(files[0].getPath(),file.getPath());
            System.out.println("-----------------------------");
        }
    }

    /**
     * 在3000字符下文本的比较（使用余弦相似度算法）
     */
    @Test
    public void CosTest() throws IOException {
        File folder = new File("src/TestFile/costest");
        File[] files = folder.listFiles();
        for(File file:files){
            if(file == files[0]){
                continue;
            }
            System.out.println(files[0].getName()+" 与文本 " + file.getName() + "的相似度为：");
            Unit.ans(files[0].getPath(),file.getPath());
            System.out.println("-----------------------------");
        }
    }

    /**
     * 特殊文本比较
     * 空文本
     */
    @Test
    public void esTest1() throws IOException {
        Unit.ans("src/TestFile/estest/a_orig.txt","src/TestFile/estest/blank.txt");
    }

}
