public class Student {
    private String Name;
    private int Age;
    private char Grade;

    public void Student1() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public char getGrade() {
        return Grade;
    }

    public void setGrade(char Grade) {
        this.Grade = Grade;
    }
}

class Student2{
    public static void main(String[] args){
        Student st = new Student();
        st.setName("Ovini Galathure");
        st.setAge(22);
        st.setGrade('A');
        System.out.println("Name="+st.getName()+"\n"+"Age=" + st.getAge()+"\n"+"Grade="+st.getGrade() );

    }

}
