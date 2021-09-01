import java.util.ArrayList;

/**
 * @author liuhaibo on 2021/09/01
 */
public class TestFlashKeyword {

    public static void main(String... args) {
        KeywordProcessor keywordProcessor = new KeywordProcessor("what name");
        keywordProcessor.add_keyword("java", "com.java");
        keywordProcessor.add_keyword("python", "com.python");
        keywordProcessor.add_keyword("hello world", "com.helloworld");
        keywordProcessor.add_keyword("hello world life", "com.helloworldlife");

        ArrayList<KeywordProcessor.MatchResult> result = keywordProcessor.extract_keywords("ja hello java, this is java hello world life");
        System.out.println(result);
    }
}
