package lesson4;

/**
 * Created by Student on 22.07.2016.
 */
public class Example1 {
    public static void main(String[] args){
        //List<String> strList = new ArrayList<>();
        //strList.add(new Integer(0));
       ///Test test = new Test(1.25);
       ///System.out.print(test.getType());
        System.out.print(revertString(new Short("10")));


    }
    public static <T> String revertString(T obj){ // параметризация методов
        return  obj.getClass().getName();
    }
    static  class Test<T>{//параметризация класса
        T param;

        public Test(T param) {
            this.param = param;
        }

        public T getParam() {
            return param;
        }

        public void setParam(T param) {
            this.param = param;
        }

        public String getType(){
            return param.getClass().getTypeName();
        }
    }
}
