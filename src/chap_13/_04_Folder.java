package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "DREAM";
        File folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }

        System.out.println("-------------------------------------------------------------");

        folderName = "D/R/E/A/M";
        // "D" + File.separator + "R" + File.separator + "E" + File.separator + "A" + File.separator + "M" + File.separator

        // folder.mkdir();
        folder = new File(folderName);
        folder.mkdirs();
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdirs)");
        }
    }
}
