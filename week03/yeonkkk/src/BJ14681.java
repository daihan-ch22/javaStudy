import java.io.*;

public class BJ14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        String result;

        if (x > 0) {
            if (y > 0) result = "1";
            else result = "4";
        } else {
            if (y > 0) result = "2";
            else result = "3";
        }

        bw.write(result);
        br.close();
        bw.close();
    }
}
