package src.oops14jan2004.Wrapperclass;

public class Lab142 {
    public static void main(String[] args) {

        int a = 10;

        Integer a2 = Integer.valueOf(a);
        Integer a3= Integer.valueOf(a2);
        // wrapper class we use in collection framework


        // Collection Framework -> Class -> Hate primitive data type
        // You have to use the Wrapper classes in Collection.


        Character ch = 'a';
        // unboxing - Character object to primitive conversion
        char a4 = ch;

        System.out.println(Integer.valueOf("55"));
        System.out.println(Integer.max(34,54));
        System.out.println(Integer.min(34,54));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        double d = 90.87;
        String st2 = String.valueOf(d);
        Double st = Double.valueOf(d);
        Integer a22 = st.intValue();
        System.out.println(a22);

    }
}