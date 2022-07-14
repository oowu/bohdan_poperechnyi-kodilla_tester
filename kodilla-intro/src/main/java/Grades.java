public class Grades {

    private int[] grades;
    private int size;

    public Grades(){
        this.grades = new int[10];
        this.size = 0;

    }

    public void add(int value){
        if (this.size == 10){
            return;
        }
        this.grades[this.size]=value;
        this.size++;
    }

    public void seeLastGrade(){
        int lastGrade = grades[Grades.this.size-1];
        System.out.println(lastGrade);
    }

    public void seeAverage(){
        int sum = 0;
        for (int i = 0; i<Grades.this.size;i++){
            sum += this.grades[i];
        }
        System.out.println();
        double average = ((double)sum) /Grades.this.grades.length;
        System.out.println(average);
    }
    public static void main(String[] args){
        Grades gradesList = new Grades();

        gradesList.add(3);
        gradesList.add(1);
        gradesList.add(2);
        gradesList.add(5);
        gradesList.add(4);
        gradesList.add(4);
        gradesList.add(1);
        gradesList.add(2);
        gradesList.add(4);
        gradesList.add(5);
        gradesList.seeLastGrade();
        gradesList.seeAverage();

        Grades gradesList2 = new Grades();
        gradesList2.add(4);
        gradesList2.add(4);
        gradesList2.add(4);
        gradesList2.add(4);
        gradesList2.add(4);
        gradesList2.add(4);
        gradesList2.add(4);
        gradesList2.add(4);
        gradesList2.add(4);
        gradesList2.add(4);
        gradesList2.seeLastGrade();
        gradesList2.seeAverage();
    }

}

