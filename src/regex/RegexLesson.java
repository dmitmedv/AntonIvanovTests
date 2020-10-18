package regex;
//FOR MAIN CLASS
//RegexLesson regexLesson = new RegexLesson();
//regexLesson.test1();
        //ArrayListTest.print();
public class RegexLesson {
    String p = "Phone +7(903)8887766, +7(915)1112233";
    String regex = "(\\+7\\(\\d\\d\\d\\)\\d{3})(\\d{4})";

    public void test1() {
        System.out.println(p.replaceAll(regex,"$1****"));
    }
}
