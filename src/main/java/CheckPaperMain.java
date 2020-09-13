import sim.SimHash;
import sim.formula;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPaperMain {
    public static void main(String[] args) throws IOException {
//        路径指定
        String filePath = "C:\\Users\\Dong\\Desktop\\sim_0.8\\orig.txt";
        String comparePath = "C:\\Users\\Dong\\Desktop\\sim_0.8\\orig_0.8_add.txt";

//        被比较文本与比较文本
        String text1 = new String();
        String text2 = new String();

//        文本输入
        BufferedReader in1 = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF8"));
        BufferedReader in2 = new BufferedReader(new InputStreamReader(new FileInputStream(comparePath), "UTF8"));
        String str;
        while ((str = in1.readLine()) != null) {
            text1 += str;
        }
        while ((str = in2.readLine()) != null) {
            text2 += str;
        }
//        System.out.println(text1);
//        System.out.println(text2);
        in1.close();
        in2.close();

        SimHash hash1 = new SimHash(text1,64);
        SimHash hash2 = new SimHash(text2,64);
        int d = hash1.hammingDistance(hash2);
        System.out.println(d);
        System.out.println(formula.getSimliar(d));
    }
}
