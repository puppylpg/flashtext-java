import java.util.List;

/**
 * @author liuhaibo on 2021/09/01
 */
public class TestFlashKeyword {

    public static void main(String... args) {
        test1();
        test2();
        test3();
        test4();
    }

    private static void test1() {
        System.out.println("===============1");
        KeywordProcessor keywordProcessor = new KeywordProcessor();
        keywordProcessor.add_keyword("java", "com.java");
        keywordProcessor.add_keyword("python", "com.python");
        keywordProcessor.add_keyword("hello world", "com.helloworld");
        keywordProcessor.add_keyword("hello world life", "com.helloworldlife");

        List<KeywordProcessor.MatchResult> result = keywordProcessor.extract_keywords("ja hello java, this is java he$$llo world life");
        System.out.println(result);
    }

    private static void test2() {
        System.out.println("===============2");
        KeywordProcessor keywordProcessor = new KeywordProcessor();
        keywordProcessor.add_keyword("Counter Strike Global Offensive", "com.csgolong");
        keywordProcessor.add_keyword("csgo", "com.csgo");
//        keywordProcessor.add_keyword("hello world", "com.helloworld");
//        keywordProcessor.add_keyword("hello world life", "com.helloworldlife");

        List<KeywordProcessor.MatchResult> result = keywordProcessor.extract_keywords("Counter Strike: Global Offensive, aka csgo, aka cs:go, aka Counter Strike Global Offensive");
        System.out.println(result);
    }

    private static void test3() {
        System.out.println("===============3");
        KeywordProcessor keywordProcessor = new KeywordProcessor();
        keywordProcessor.add_keyword("反恐精英", "com.csgolong");
        keywordProcessor.add_keyword("csgo", "com.csgo");
//        keywordProcessor.add_keyword("hello world", "com.helloworld");
//        keywordProcessor.add_keyword("hello world life", "com.helloworldlife");

        List<KeywordProcessor.MatchResult> result = keywordProcessor.extract_keywords("你说这个反恐精英它是个好游戏吗 反恐精英，反恐:精英，反恐：精英");
        System.out.println(result);
    }

    private static void test4() {
        System.out.println("===============4");
        KeywordProcessor keywordProcessor = new KeywordProcessor();
        keywordProcessor.add_keyword("有道", "com.csgolong");
        keywordProcessor.add_keyword("csgo", "com.csgo");
//        keywordProcessor.add_keyword("hello world", "com.helloworld");
//        keywordProcessor.add_keyword("hello world life", "com.helloworldlife");

        List<KeywordProcessor.MatchResult> result = keywordProcessor.extract_keywords("有道有道有道道dao");
        System.out.println(result);
    }
}
