package geradores;

import java.io.*;
import java.util.*;

public class DumpFile {

  public static void dump(String filePath) throws Exception {
    File f = new File(filePath);
    
    System.out.println(f.getAbsolutePath());

    Scanner scan = new Scanner(f);

    while (scan.hasNextLine()) {
      System.out.println(scan.nextLine());
    }

    scan.close();
  }

  public static void main(String[] args) throws Exception {
    dump("file.txt");
  }
}