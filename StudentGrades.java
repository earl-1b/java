// Llena Earl Laurence
// Final Challenge No. 3

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store student names
        String[] studentNames = {"Emjay", "Luis", "Dynes", "Rojan", "Earl"};

        int[][] scores = new int[5][3];

        // Input scores for each student
        for (int row = 0; row < scores.length; row++) {
            for (int col = 0; col < scores[row].length; col++) {
            System.out.println("Enter " + studentNames[row] + "'s score for Subject " + (col + 1) + ":");
                scores[row][col] = sc.nextInt();
            }
        }

        // Calculate and display the average score for each student
        System.out.println("\nStudent Averages:");
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
            total += scores[i][j];
            }

            // Calculate average
            double average = (double) total / scores[i].length;

            // Display the average
            System.out.println(studentNames[i] + "\tAverage: " + String.format("%.2f", average));
        }

        // Close the scanner
        sc.close();
    }
}