package oop_hus.finalexam.student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 7) {
                    continue;
                }

                if (dataList.get(0).equals("id")) {
                    continue;
                }

                /*
                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào StudentManager để quản lý.
                */

                Student student = new Student.StudentBuilder(dataList.get(0))
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2))
                        .withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(6)))
                        .build();
                StudentManager.getInstance().append(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void main(String[] args) {
        testOriginalData();
        testSortYearOfBirthIncreasing();
        testSortMathsGradeDecreasing();
        testSortMathsGradeIncreasing();
        testSortMathsGradeDecreasing();
        testSortPhysicsGradeIncreasing();
        testSortPhysicsGradeDecreasing();
        testSortChemistryGradeIncreasing();
        testSortChemistryGradeDecreasing();
        testFilterStudentsHighestMathsGrade();
        testFilterStudentsLowestMathsGrade();
        testFilterStudentsHighestPhysicsGrade();
        testFilterStudentsLowestPhysicsGrade();
        testFilterStudentsHighestChemistryGrade();
        testFilterStudentsLowestChemistryGrade();
        testFilterStudentsHighestAverageGrade();
        testFilterStudentsLowestAverageGrade();
    }

    public static void init() {
        String filePath = "finalexam/data/students.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        init();
        System.out.println("Original Data");
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.println(studentIds);
    }

    public static void testSortYearOfBirthIncreasing() {
        init();
        System.out.println("\nTest sort Year of Birth increasing");
        List<Student> students = StudentManager.getInstance().sortYearOfBirthIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortYearOfBirthDecreasing() {
        init();
        System.out.println("\nTest sort Year of Birth decreasing");
        List<Student> students = StudentManager.getInstance().sortYearOfBirthDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortMathsGradeIncreasing() {
        init();
        System.out.println("\nTest sort maths grade increasing");
        StudentManager.print(StudentManager.getInstance().sortMathsGradeIncreasing());
        System.out.println();
    }

    public static void testSortMathsGradeDecreasing() {
        init();
        System.out.println("\nTest sort maths grade decreasing");
        StudentManager.print(StudentManager.getInstance().sortMathsGradeDecreasing());
        System.out.println();
    }

    public static void testSortPhysicsGradeIncreasing() {
        init();
        System.out.println("\nTest sort physics grade increasing");
        StudentManager.print(StudentManager.getInstance().sortPhysicsGradeIncreasing());
        System.out.println();
    }

    public static void testSortPhysicsGradeDecreasing() {
        init();
        System.out.println("\nTest sort physics grade decreasing");
        StudentManager.print(StudentManager.getInstance().sortPhysicsGradeDecreasing());
        System.out.println();
    }

    public static void testSortChemistryGradeIncreasing() {
        init();
        System.out.println("\nTest sort chemistry grade increasing");
        StudentManager.print(StudentManager.getInstance().sortChemistryGradeIncreasing());
        System.out.println();
    }

    public static void testSortChemistryGradeDecreasing() {
        init();
        System.out.println("\nTest sort chemistry grade decreasing");
        StudentManager.print(StudentManager.getInstance().sortChemistryGradeDecreasing());
        System.out.println();
    }

    public static void testFilterStudentsHighestMathsGrade() {
        init();
        System.out.println("\nTest Filter Students Highest Math Grade");
        List<Student> nHighestMathsGradeStudents =  StudentManager.getInstance().filterStudentsHighestMathsGrade(5);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestMathsGradeStudents);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsLowestMathsGrade() {
        init();
        System.out.println("\nTest Filter Students Lowest Math Grade");
        List<Student> nLowestMathsGradeStudents = StudentManager.getInstance().filterStudentsLowestMathsGrade(5);
        String codeString = StudentManager.getInstance().idOfStudentsToString(nLowestMathsGradeStudents);
        System.out.print(codeString);
    }

    public static void testFilterStudentsHighestPhysicsGrade() {
        init();
        System.out.println("\nTest Filter Students Highest Physics Grade");
        List<Student> nHighestPhysicsGradeStudents = StudentManager.getInstance().filterStudentsHighestPhysicsGrade(5);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestPhysicsGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsLowestPhysicsGrade() {
        System.out.println("\n Test Filter Students Lowest Physics Grade()");
        List<Student> nLowestPhysicsGradeStudents = StudentManager.getInstance().filterStudentsLowestPhysicsGrade(5);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nLowestPhysicsGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsHighestChemistryGrade() {
        System.out.println("\n Test Filter Students Highest Chemistry Grade()");
        List<Student> nHighestChemistryGradeStudents = StudentManager.getInstance().filterStudentsHighestChemistryGrade(5);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestChemistryGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsLowestChemistryGrade() {
        System.out.println("\n Test Filter Students Lowest Chemistry Grade()");
        List<Student> nLowestChemistryGradeStudents = StudentManager.getInstance().filterStudentsLowestChemistryGrade(5);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nLowestChemistryGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsHighestAverageGrade() {
        System.out.println("\n Test Filter Students Highest Chemistry Grade()");
        List<Student> nHighestChemistryGradeStudents = StudentManager.getInstance().filterStudentsHighestAverageGrade(5);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestChemistryGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsLowestAverageGrade() {
        System.out.println("\n Test Filter Students Lowest Chemistry Grade()");
        List<Student> nLowestChemistryGradeStudents = StudentManager.getInstance().filterStudentsLowestAverageGrade(5);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nLowestChemistryGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }
}
