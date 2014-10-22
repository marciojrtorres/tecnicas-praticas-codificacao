package problema;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;

public class UploadManager {

  private final File dir;
  private final long maxArquivos;
  private final long maxTamanho;

  public UploadManager(String dir, long maxArquivos, 
      long maxTamanho) {
    this.dir = new File(dir);
    this.maxArquivos = maxArquivos;
    this.maxTamanho = maxTamanho;
  }

  public boolean store(File arquivo) {
    if (totalFilesInDir(dir) < maxArquivos 
        && arquivo.isFile()
        && arquivo.length() < maxTamanho) {
      try {
        FileOutputStream fos = 
            new FileOutputStream(dir.getAbsolutePath() + "/"
            + UUID.randomUUID().toString());
        FileInputStream fis = new FileInputStream(arquivo);
        int b = -1;
        while ((b = fis.read()) != -1) {
          fos.write(b);
        }
        fis.close();
        fos.flush();        
        fos.close();
        return true;
      } catch (Exception e) {
        throw new RuntimeException("nao foi "
            + "possivel armazenar", e);
      }
    } else {
      return false;
    }
  }

  public int totalFilesInDir(File dir) {
    File[] listFiles = dir.listFiles();
    if (listFiles == null) {
      return 0;
    }
    int total = 0;
    for (File f : listFiles) {
      if (f.isFile()) {
        total++;
      }
      if (f.isDirectory()) {
        total += totalFilesInDir(f);
      }
    }
    return total;
  }

  public static void main(String[] args) {    
    UploadManager um = 
        new UploadManager("/home/marcio/uploads",
            1000000L, 4000000L);
    System.out.println(
        um.store(new File("/home/marcio/arquivo.doc")));
  }

}