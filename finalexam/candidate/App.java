package oop_hus.finalexam.candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        testOriginalData();
        testSortMathsGradeIncreasing();
        testSortMathsGradeDecreasing();
        testSortAverageGradeIncreasing();
        testSortAverageGradeDecreasing();
        testFilterStudentsHighestMathsGrade();
        testFilterStudentsLowestMathsGrade();
        testFilterStudentsHighestAverageGrade();
        testFilterStudentsLowestAverageGrade();

        /*


        - Viết code để test cho tất cả các hàm bên dưới.
        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
        là <TenSinhVien_MaSinhVien_CandidateManager>.txt (Ví dụ, NguyenVanA_123456_CandidateManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_CandidateManager>.zip (Ví dụ, NguyenVanA_123456_CandidateManager.zip),
        nộp lên classroom.
         */
    }

    public static void init() {
        String filePath = "finalexam/data/students.csv";
        readListData(filePath);
    }

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

                Student student = new Student.StudentBuilder(dataList.get(0))
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2))
                        .withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(6)))
                        .build();
                StudentManager.getInstance().append(student);


                /*
                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào StudentManager để quản lý.
                */
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

    public static void testOriginalData() {
        init();
        System.out.println("Test original data");
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.print(studentIds);
    }

    public static void testSortMathsGradeIncreasing() {
        init();
        System.out.println("\nTest sort maths grade increasing");
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().sortMathsGradeIncreasing());
        System.out.print(studentIds);
    }

    public static void testSortMathsGradeDecreasing() {
        init();
        System.out.println("\nTest sort maths grade decreasing");
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().sortMathsGradeDecreasing());
        System.out.print(studentIds);
    }

    public static void testSortAverageGradeIncreasing() {
        init();
        System.out.println("\nTest sort average grade increasing");
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().sortAverageGradeIncreasing());
        System.out.print(studentIds);
    }

    public static void testSortAverageGradeDecreasing() {
        init();
        System.out.println("\nTest sort average grade decreasing");
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().sortAverageGradeDecreasing());
        System.out.print(studentIds);
    }

    public static void testFilterStudentsHighestMathsGrade() {
        init();
        System.out.println("\nTest filter students highest maths grade");
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().filterStudentsHighestMathsGrade(5));
        System.out.print(studentIds);
    }

    public static void testFilterStudentsLowestMathsGrade() {
        init();
        System.out.println("\nTest filter students lowest maths grade");
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().filterStudentsLowestMathsGrade(5));
        System.out.print(studentIds);
    }

    public static void testFilterStudentsHighestAverageGrade() {
        init();
        System.out.println("\nTest filter students highest average grade");
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().filterStudentsHighestAverageGrade(5));
        System.out.print(studentIds);
    }

    public static void testFilterStudentsLowestAverageGrade() {
        init();
        System.out.println("\nTest filter students lowest average grade");
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().filterStudentsLowestAverageGrade(5));
        System.out.print(studentIds);
    }
}


