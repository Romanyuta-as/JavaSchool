package HomeWork.HomeWork17;

/**
 * Created by 1 on 07.09.2016.
 */
public class Example1 {
    //
    public static void main(String[] args) {
        // плохой код
//        String[]  questionnaire = new String[3];
//        questionnaire[1] = "Alexander";
//        questionnaire[2] = "22";
//        questionnaire[3] = "Romanyuta";

        //Замена поля-массива объектом
        Anketa anketa = new Anketa();
        anketa.setName("Alexander");
        anketa.setAge(22);

    }

    static class Anketa{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
