import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamSample_NG {
  public static void main(String[] args) {
    try {
      // �@ストリームを開く
      FileInputStream fis = new FileInputStream(args[0]);
      FileOutputStream fos = new FileOutputStream(args[1]);
      int data;
      // �A読み込む / 書き込む
      while ((data = fis.read()) != -1) {
        fos.write(data);
      }
      // �Bストリームを閉じる
      fis.close();
      fos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
