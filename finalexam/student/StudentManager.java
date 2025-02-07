package oop_hus.finalexam.student;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StudentManager {
    // Singleton pattern
    private static StudentManager instance;

    private List<Student> studentList;

    private StudentManager() {
        studentList = new LinkedList<>();
    }

    public static StudentManager getInstance() {
        if(instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }

    public List<Student> getStudentList() {
        return this.studentList;
    }

    public void append(Student student) {
        studentList.add(student);
    }

    public void add(Student student, int index) {
        studentList.add(index, student);
    }

    public void remove(int index) {
        studentList.remove(index);
    }

    public void remove(Student student) {
        studentList.remove(student);
    }

    public Student studentAt(int index) {
        return studentList.get(index);
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự năm sinh tăng dần.
     */
    public List<Student> sortYearOfBirthIncreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return left.getYearOfBirth() - right.getYearOfBirth();
            }
        });
        return newList;
    }

    /**
     * Sắp xếp sinh viên theo thứ tự năm sinh giảm dần.
     * @return
     */
    public List<Student> sortYearOfBirthDecreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return right.getYearOfBirth() - left.getYearOfBirth();
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán tăng dần.
     */
    public List<Student> sortMathsGradeIncreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (left.getMathsGrade() > right.getMathsGrade()) {
                    return 1;
                } else if (left.getMathsGrade() < right.getMathsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán giảm dần.
     */
    public List<Student> sortMathsGradeDecreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (right.getMathsGrade() > left.getMathsGrade()) {
                    return 1;
                } else if (right.getMathsGrade() < left.getMathsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý tăng dần.
     */
    public List<Student> sortPhysicsGradeIncreasing() {
        List<Student> result = new LinkedList<>(this.studentList);
        Collections.sort(result, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (left.getPhysicsGrade() > right.getPhysicsGrade()) {
                    return 1;
                } else if (left.getPhysicsGrade() < right.getPhysicsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return result;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý giảm dần.

     */
    public List<Student> sortPhysicsGradeDecreasing() {
        List<Student> result = new LinkedList<>(this.studentList);
        Collections.sort(result, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (left.getPhysicsGrade() < right.getPhysicsGrade()) {
                    return 1;
                } else if (left.getPhysicsGrade() > right.getPhysicsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return result;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa tăng dần
     */
    public List<Student> sortChemistryGradeIncreasing() {
        List<Student> result = new LinkedList<>(this.studentList);
        Collections.sort(result, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (left.getChemistryGrade() > right.getChemistryGrade()) {
                    return 1;
                } else if (left.getChemistryGrade() < right.getChemistryGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return result;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa giảm dần.
     */
    public List<Student> sortChemistryGradeDecreasing() {
        List<Student> result = new LinkedList<>(this.studentList);
        Collections.sort(result, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (right.getChemistryGrade() > left.getChemistryGrade()) {
                    return 1;
                } else if (right.getChemistryGrade() < left.getChemistryGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return result;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình tăng dần.
     */
    public List<Student> sortAverageGradeIncreasing() {
        List<Student> result = new LinkedList<>(this.studentList);
        Collections.sort(result, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (left.getAverageGrade() > right.getAverageGrade()) {
                    return 1;
                } else if (left.getAverageGrade() < right.getAverageGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return result;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình giảm dần.
     */
    public List<Student> sortAverageGradeDecreasing() {
        List<Student> result = new LinkedList<>(this.studentList);
        Collections.sort(result, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (left.getAverageGrade() > right.getAverageGrade()) {
                    return -1;
                } else if (left.getAverageGrade() < right.getAverageGrade()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        return result;
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý cao nhất.
     */
    public List<Student> filterStudentsHighestPhysicsGrade(int howMany) {
        howMany = Math.min(howMany, studentList.size());
        List<Student> result = sortPhysicsGradeDecreasing();
        return result.subList(0, howMany);
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý thấp nhất.
     */
    public List<Student> filterStudentsLowestPhysicsGrade(int howMany) {
        howMany = Math.min(howMany, studentList.size());
        List<Student> result = sortPhysicsGradeIncreasing();
        return result.subList(0, howMany);
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán cao nhất.
     */
    public List<Student> filterStudentsHighestMathsGrade(int howMany) {
        howMany = Math.min(howMany, studentList.size());
        List<Student> result = sortMathsGradeDecreasing();
        return result.subList(0, howMany);
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán thấp nhất.
     */
    public List<Student> filterStudentsLowestMathsGrade(int howMany) {
        howMany = Math.min(howMany, studentList.size());
        List<Student> result = sortMathsGradeIncreasing();
        return result.subList(0, howMany);
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa cao nhất.
     */
    public List<Student> filterStudentsHighestChemistryGrade(int howMany) {
        howMany = Math.min(howMany, studentList.size());
        List<Student> result = sortChemistryGradeDecreasing();
        return result.subList(0, howMany);
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa thấp nhất.
     */
    public List<Student> filterStudentsLowestChemistryGrade(int howMany) {
        howMany = Math.min(howMany, studentList.size());
        List<Student> result = sortChemistryGradeIncreasing();
        return result.subList(0, howMany);
    }

    public List<Student> filterStudentsHighestAverageGrade(int howMany) {
        howMany = Math.min(howMany, studentList.size());
        List<Student> result = sortAverageGradeDecreasing();
        return result.subList(0, howMany);
    }

    public List<Student> filterStudentsLowestAverageGrade(int howMany) {
        howMany = Math.min(howMany, studentList.size());
        List<Student> result = sortAverageGradeIncreasing();
        return result.subList(0, howMany);
    }

    public static String idOfStudentsToString(List<Student> countryList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");
        for (Student country : countryList) {
            idOfStudents.append(country.getId()).append(" ");
        }
        return idOfStudents.toString().trim() + "]";
    }

    public static void print(List<Student> studentList) {
        StringBuilder studentsString = new StringBuilder();
        studentsString.append("[\n");
        for (Student student : studentList) {
            studentsString.append(student.toString()).append("\n");
        }
        System.out.print(studentsString.toString().trim() + "\n]");
    }
}
