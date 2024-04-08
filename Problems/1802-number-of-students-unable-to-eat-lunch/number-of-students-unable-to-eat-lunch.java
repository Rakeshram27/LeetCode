class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int stu0 = 0; // student with zero
        int stu1; // student with one
        for(int n: students){
            if(n == 0) stu0++;
        }
        stu1 = students.length - stu0;

        for (int sandwich : sandwiches) {
            if (stu0 == 0 && sandwich == 0) {
                return stu1;
            }
            else if (stu1 == 0 && sandwich == 1) {
                return stu0;
            }
            if (sandwich == 0) stu0--;
            else stu1--;
            }
        return 0;
    }
}