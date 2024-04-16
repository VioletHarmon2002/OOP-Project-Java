package Orientaatiotehtävät3.second;

import java.util.Random;

public class StudentAgeStatistics {
    public static void main(String[] args) {

        int[][] ageDistribution = {
                {16, 20, 16},
                {21, 25, 28},
                {26, 30, 36},
                {31, 35, 20}
        };

        int[] generatedAges = generateStudentAges(ageDistribution, 1000);

        System.out.println("Generated Age Values:");
        for (int age : generatedAges) {
            System.out.println(age);
        }
    }

    public static int[] generateStudentAges(int[][] ageDistribution, int totalAges) {
        Random random = new Random();
        int[] generatedAges = new int[totalAges];
        int currentIndex = 0;

        while (currentIndex < totalAges) {
            int randomNumber = random.nextInt(100) + 1;
            int cumulativePercentage = 0;


            for (int[] ageRange : ageDistribution) {
                cumulativePercentage += ageRange[2];
                if (randomNumber <= cumulativePercentage) {

                    int randomAge = random.nextInt(ageRange[1] - ageRange[0] + 1) + ageRange[0];
                    generatedAges[currentIndex++] = randomAge;
                    break;
                }
            }
        }
        return generatedAges;
    }
}
