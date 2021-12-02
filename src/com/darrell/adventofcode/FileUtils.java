package com.darrell.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtils {

  public static String readFile(String remainingPath)
  {
    File file = getFile(remainingPath);
    StringBuilder fileData = new StringBuilder();
    try(Scanner reader = new Scanner(file)) {
      while(reader.hasNextLine())
      {
        fileData.append(reader.nextLine()).append("\n");
      }
    }
    catch(FileNotFoundException e)
    {
      System.out.println("File not found");
      e.printStackTrace();
    }
    return fileData.toString();
  }

  private static File getFile(String remainingPath)
  {
    String path = System.getProperty("user.dir") + "/com/darrell/adventofcode" + remainingPath;
    return new File(path);
  }

}
