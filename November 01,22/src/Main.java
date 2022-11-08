public class Main {
    public static void main(String[]args){
        Student st = new Student();
        st.address = "Savar";
        st.name = "Abid";
        st.dob = "03 January 2001";
        st.semester = 4;
        st.id = "213-35-757";
        st.cgpa = 3.93f;
        st.display();
        System.out.println(st.Studying("OOP with java","BLC","Secret"));
    }
}