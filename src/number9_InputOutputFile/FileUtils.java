package number9_InputOutputFile;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    public void printNioFileDetails(String fileName){
            Path path = Paths.get(fileName);
            Path path1 = FileSystems.getDefault().getPath(fileName);
            Path path2 = Paths.get(System.getProperty("user.dir"), fileName);

        FileSystem fileSystem = path.getFileSystem();

        System.out.println("File name " + path.getFileName());
        System.out.println("Root dir " + path.getRoot());
        Path absolutePath = path.toAbsolutePath();
        System.out.println("Absolute path " +  absolutePath);
        System.out.println("Parent dir " + absolutePath.getParent());
        System.out.println("Name count " + path.getNameCount());

    }

}
