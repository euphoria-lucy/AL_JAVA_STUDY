package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader : 파일에서 내용을 읽어올 때
        // BufferedWriter : 파일에 내용을 쓸 때

        // 파일 쓰기
        // try(BufferedWriter bw = new BufferedWriter(new FileWriter("DREAM.txt"))) {
            // bw.write("DREAM\n");
            // bw.newLine();
            // bw.write("꿈과 희망");
            // bw.newLine();
            // bw.write("이제 시작이에요!");
        // } catch (IOException e) {
            // throw new RuntimeException(e);
        // }

        // 파일 읽기
        try(BufferedReader br = new BufferedReader(new FileReader("DREAM.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
