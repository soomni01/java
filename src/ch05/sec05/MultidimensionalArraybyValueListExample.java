package ch05.sec05;

public class MultidimensionalArraybyValueListExample {
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 96}, {76, 88}
        };

        System.out.println("1차원 배열 길이(반의 수): " + scores.length);
        System.out.println("2차원 배열 길이(첫 번재 반의 학생 수): " + scores[0].length);
        System.out.println("2차원 배열 길이(두 번재 반의 학생 수): " + scores[1].length);

        System.out.println("scores[0][2]: " + scores[0][2]);
        System.out.println("scores[1][1]: " + scores[1][1]);

        int calss1Sum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            calss1Sum += scores[0][i];
        }
        double class1Avg = (double) calss1Sum / scores[0].length;
        System.out.println("첫 번재 반의 평균 점수: " + class1Avg);

        int calss2Sum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            calss2Sum += scores[1][i];
        }
        double class2Avg = (double) calss2Sum / scores[1].length;
        System.out.println("두 번재 반의 평균 점수: " + class2Avg);

        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i < scores.length; i++) {
            totalStudent += scores[i].length;
            for (int k = 0; k < scores[i].length; k++) {
                totalSum += scores[i][k];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체 학생의 평균 점수: " + totalAvg);
    }
}
