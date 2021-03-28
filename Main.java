import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
            readFile();
            mergeFile();
            pickedPageRead();


    }
    public static void readFile() throws IOException {
        int r;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte [] bArray;
        try (FileInputStream inputStream = new FileInputStream("files/1f.txt")){
            while ((r = inputStream.read()) != -1){
                outputStream.write(r);
                System.out.print((char) r);
            }
            bArray = outputStream.toByteArray();


        }
    }

    public static void mergeFile() throws IOException {
        ArrayList<InputStream> al = new ArrayList<>();
        int r;
        al.add(new FileInputStream("files/2f1.txt"));
        al.add(new FileInputStream("files/2f2.txt"));
        al.add(new FileInputStream("files/2f3.txt"));
        al.add(new FileInputStream("files/2f4.txt"));
        al.add(new FileInputStream("files/2f5.txt"));
        BufferedInputStream inputStream = new BufferedInputStream(new SequenceInputStream(Collections.enumeration(al)));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("files/merged.txt"));
        while ((r = inputStream.read()) != -1){
            outputStream.write(r);
            System.out.print((char) r);
        }
    }

    public static void pickedPageRead() throws IOException {
        int PAGE = 1800;
        int p;
        byte[] pageByte;
        RandomAccessFile randomAccessFile = new RandomAccessFile("files/3f.txt","r");
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите страницу: ");
        p = scanner.nextInt() - 1;
        randomAccessFile.seek(p * PAGE);
        pageByte = new byte[1800];
        randomAccessFile.read(pageByte);
        System.out.println(new String(pageByte));
        randomAccessFile.close();
    }
}
