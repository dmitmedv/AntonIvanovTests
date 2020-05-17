package regex;

public class RegexLesson {
    String p = "Privet   ,  kak dela  . how are you. Test, test2.";
    String regex = "(\\w)(\\s+)([\\.,])";

    public void test1() {
        System.out.println(p.replaceAll(regex,"$1$3"));
    }
}
