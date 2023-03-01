package number9_InputOutputFile;

import java.io.IOException;
import java.nio.file.*;

public class FileUtils {

    public void printNioFileDetails(String fileName) throws IOException {
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

        System.out.println("File exists " + Files.exists(path)); // если нет доступа то тоже будет false
        System.out.println("File does not exists " + Files.notExists(path));
        System.out.println("Is readable " + Files.isReadable(path));
        System.out.println("Is writable " + Files.isWritable(path));
        System.out.println("Is executable " + Files.isExecutable(path));

        System.out.println("Is the same file " + Files.isSameFile(path, path1));

        Path parentPath = absolutePath.getParent();
        Path filesPath = parentPath.resolve("files");
        if(Files.notExists(filesPath)) {
            Files.createDirectory(filesPath);
        }
        Files.copy(absolutePath, filesPath.resolve(path), StandardCopyOption.REPLACE_EXISTING);

    }

}
