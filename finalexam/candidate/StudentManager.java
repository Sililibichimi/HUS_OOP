package oop_hus.finalexam.candidate;

import java.util.Comparator;

public class StudentManager {
    // Singleton pattern
    private static StudentManager instance;

    private MyList studentList;

    private StudentManager() {
        studentList = new MyArrayList();
    }

    public static StudentManager getInstance() {
        if(instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }

    public MyList getStudentList() {
        return this.studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     * @param student
     */
    public void append(Student student) {
        studentList.append(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        studentList.insert(student, index);
    }

    /**
     * Bỏ sinh viên ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        studentList.remove(index);
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        return (Student) studentList.get(index);
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán tăng dần.
     * @return
     */
    public MyList sortMathsGradeIncreasing() {
        MyList sortedList = studentList;
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getMathsGrade() > o2.getMathsGrade()) {
                    return 1;
                } else if(o1.getMathsGrade() < o2.getMathsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        quickSort(sortedList, comparator, 0, sortedList.size() - 1);
        return sortedList;
    }
    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán giảm dần.
     * @return
     */
    public MyList sortMathsGradeDecreasing() {
        MyList sortedList = studentList;
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getMathsGrade() > o2.getMathsGrade()) {
                    return -1;
                } else if(o1.getMathsGrade() < o2.getMathsGrade()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        quickSort(sortedList, comparator, 0, sortedList.size() - 1);
        return sortedList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình tăng dần.
     * @return
     */
    public MyList sortAverageGradeIncreasing() {
        MyList sortedList = studentList;
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAverageGrade() > o2.getAverageGrade()) {
                    return 1;
                } else if(o1.getAverageGrade() < o2.getAverageGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        quickSort(sortedList, comparator, 0, sortedList.size() - 1);
        return sortedList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình giảm dần.
     * @return
     */
    public MyList sortAverageGradeDecreasing() {
        MyList sortedList = studentList;
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAverageGrade() > o2.getAverageGrade()) {
                    return -1;
                } else if(o1.getAverageGrade() < o2.getAverageGrade()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        quickSort(sortedList, comparator, 0, sortedList.size() - 1);
        return sortedList;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán cao nhất.
     * @param howMany
     * @return
     */
    public MyList filterStudentsHighestMathsGrade(int howMany) {
        MyList sortedList = sortMathsGradeDecreasing();
        MyList filteredList = new MyArrayList();
        MyIterator it = sortedList.iterator();
        for(int i = 0; i < howMany; i++) {
            filteredList.append(it.next());
        }
        return filteredList;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán thấp nhất.
     * @param howMany
     * @return
     */
    public MyList filterStudentsLowestMathsGrade(int howMany) {
        MyList sortedList = sortMathsGradeIncreasing();
        MyList filteredList = new MyArrayList();
        MyIterator it = sortedList.iterator();
        for(int i = 0; i < howMany; i++) {
            filteredList.append(it.next());
        }
        return filteredList;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình cao nhất.
     * @param howMany
     * @return
     */
    public MyList filterStudentsHighestAverageGrade(int howMany) {
        MyList sortedList = sortAverageGradeDecreasing();
        MyList filteredList = new MyArrayList();
        MyIterator it = sortedList.iterator();
        for(int i = 0; i < howMany; i++) {
            filteredList.append(it.next());
        }
        return filteredList;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình thấp nhất.
     * @param howMany
     * @return
     */
    public MyList filterStudentsLowestAverageGrade(int howMany) {
        MyList sortedList = sortAverageGradeIncreasing();
        MyList filteredList = new MyArrayList();
        MyIterator it = sortedList.iterator();
        for(int i = 0; i < howMany; i++) {
            filteredList.append(it.next());
        }
        return filteredList;
    }

    private void quickSort(MyList studentList, Comparator<Student> comparator, int left, int right) {

        int i = left;
        int j = right;
        Student pivot = (Student) studentList.get(left + (right - left) / 2);

        while (i <= j) {
            while (comparator.compare((Student) studentList.get(i), pivot) < 0) {
                i++;
            }
            while (comparator.compare((Student) studentList.get(j), pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = (Student) studentList.get(i);
                studentList.set(studentList.get(j), i);
                studentList.set(temp, j);
                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(studentList, comparator, left, j);
        }
        if (i < right) {
            quickSort(studentList, comparator, i, right);
        }
    }

    public static String idOfStudentsToString(MyList studentList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");
        MyIterator it = studentList.iterator();
        while (it.hasNext()) {
            Student student = (Student) it.next();
            idOfStudents.append(student.getId()).append(" ");
        }
        return idOfStudents.toString().trim() + "]";
    }

    public static void print(MyList studentList) {
        StringBuilder studentsString = new StringBuilder();
        studentsString.append("[\n");
        MyIterator it = studentList.iterator();
        while (it.hasNext()) {
            Student student = (Student) it.next();
            studentsString.append(student.toString()).append("\n");
        }
        System.out.print(studentsString.toString().trim() + "\n]");
    }
}
