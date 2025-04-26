package strings;

public class StringP {

    public static void main(String[] args) {
        //1
        String s1="efgh";
        String s2;

        s2=s1;
        // Deep copy of s1 is created & then s2 is updated
        s2=s1+"abcd";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);

        //2

        String s3=new String("1234");
        String s4="1234";
        System.out.println(s3==s4);

        //3
        String s5=new String("5678").intern();
        String s6="5678";
        System.out.println(s5==s6);

        //4 During Runtime concatenation or SubString string doesnt store in string pool

        String s7="amar";
        String s8="am";
        s8=s8+"ar";
        System.out.println(s8);
        System.out.println(s7==s8);
        String s9="amarthya";
        String s10=s9.substring(0,4);
        System.out.println(s10);
        System.out.println(s7==s9);

    }


}
