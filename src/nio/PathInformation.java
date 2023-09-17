package src.nio;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;

public class PathInformation {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/suh/workspace/java-essentials/nio/test");
        System.out.println(path.toString());
        System.out.println(path.getFileName());
        System.out.println(path.toFile().getAbsolutePath());
        // 바로 위
        System.out.println(path.getParent());
        // root
        System.out.println(path.getRoot());
        System.out.println(path.subpath(0,2));

        path = Paths.get("./src/nio/test");

        if(Files.exists(path) && Files.isReadable(path)){
            // isExecutable, isWriteable도 가능.
        }
        System.out.println(path.toAbsolutePath());
        Path path2 = path.normalize();

        if(Files.exists(path2)){
            System.out.println("Normalize Works");
            File source = path2.toFile();
            File target = new File("./src/nio/test2");
            oldFileCopy(source, target);
            Path path3 = Paths.get("./src/nio/" + LocalDateTime.now().getMinute());
            newFileCopy(path2,path3);

        }

    }

    public static void oldFileCopy(File source, File target){
        try(
                // FileReader와 FileWriter를 사용함.
                BufferedReader br = new BufferedReader(new FileReader(source));
                BufferedWriter bw = new BufferedWriter(new FileWriter(target));
                ) {
            char[] buffer = new char[1024];
            int readCount = 0;

            //ascii character로 읽음. 읽은 ch 수 만큼 반환. 만약 없을시 -1.
            while((readCount = br.read(buffer)) > 0){
                // ch array 로 buffer 지정해줌.
                bw.write(buffer, 0, readCount);
            }

            String tmp = "";
            // 개행 지점까지 String 으로 찾아옴.
            while((tmp = br.readLine()) != null){
                bw.write(tmp);
                bw.newLine();
            }

            System.out.println("파일복사완료!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void newFileCopy(Path source, Path target) throws IOException {
        Path trash = Paths.get("./src/nio/trash/" + target.getFileName());

        if(Files.isDirectory(source) || Files.notExists(source)){
            return;
        }

        if(Files.exists(target)){
            Files.move(target,trash, StandardCopyOption.REPLACE_EXISTING);
        }
        CopyOption[] copyOptions = {StandardCopyOption.REPLACE_EXISTING};
        Files.copy(source, target, copyOptions);
    }


    public static void newFilesMove(){

    }


    public static void newDeleteFile(){

    }

    public static void fileAttributes(){

    }
}
