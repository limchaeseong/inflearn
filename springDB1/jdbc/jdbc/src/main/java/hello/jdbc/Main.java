package hello.jdbc;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double pointSum = 0.0;
        double gradePointSum = 0.0;

        for(int i = 0; i<20 ; i++){
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            double point = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            double gradePoint = 0.0;

            if(grade.charAt(0)=='P') continue;
            else if(grade.charAt(0)=='A') gradePoint += 4.0;
            else if(grade.charAt(0)=='B') gradePoint += 3.0;
            else if(grade.charAt(0)=='C') gradePoint += 2.0;
            else if(grade.charAt(0)=='D') gradePoint += 1.0;

            if(grade.charAt(0)!='F')
                if(grade.charAt(1)=='+') gradePoint += 0.5;

            pointSum += point;
            gradePointSum += point * gradePoint;

        }
        br.close();

        System.out.printf("%.6f\n",gradePointSum /pointSum);
    }
}
