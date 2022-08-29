static class Student
{
    //Enter your code here
    public String name;
    public int eng;
    public int maths;
    public int hindi;

    public void setName(String name){
        this.name = name;
    }


    public void setEng(int eng) {
        this.eng = eng;
    }


    public void setMaths(int maths){
        this.maths = maths;
    }


    public void setHindi(int hindi){
        this.hindi = hindi;
    }


    public int getEng(){
        return eng;
    }


    public int getMaths(){
        return maths;

    }

    public int getHindi(){
        return hindi;
    }
    
    public String getName(){
        return name;
    }
}
static Student[] createStudentArray(int n)
    {
       //Enter your code here
       Student[] st = new Student[n];

       for(int i=0; i<n; i++){
           Student student = new Student();
           student.setName(sc.next());
           student.setEng(sc.nextInt());
           student.setMaths(sc.nextInt());
           student.setHindi(sc.nextInt());

           st[i] = student;
       }
       return st;
    }
    
    static int engAverage(Student st[], int n)
    {
        //Enter your code here
        int avgEng = 0;;
        for(int i=0; i<n; i++){
            avgEng +=st[i].getEng();
        }
        if (avgEng == 0)
        return 0;
        double avg = (double) avgEng /  n;
        int ans = (int) Math.floor(avg);
        return ans;
    }
    
    static int avgPercentageOfClass(Student st[], int n)
    {
        //Enter your code here
        int avgPercent= 0;
        for(int i=0; i<n; i++){
            int avgSub = 0;
            avgSub += st[i].getEng();
            avgSub += st[i].getMaths();
            avgSub += st[i].getHindi();

            double totalPrecent = (double) avgSub/3;
            avgPercent +=(int) Math.floor(totalPrecent);
        }

        double ans2 = (double) avgPercent/n;
        int ans1 = (int)Math.floor(ans2);
        return ans1;
   }