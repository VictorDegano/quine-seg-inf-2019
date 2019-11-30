import java.util.Arrays;

public class SelfReader {
    static char comma = 34;
    static char backslash = 92;
    static char tab = 9;
    static char e = 101;
    static char f = 102;
    static char c = 99;
    static char t = 116;
    static char n = 110;
    static char percent = 37;
    static char o = 111;
    static char space = 32;
    static char sum = 43;
    static char bracketo = 40;
    static char bracketc = 41;
    static char or = 124;
    static char blank = 0;
    static char s = 115;

    private static String sc ="%oc%n\n" +
    "%ctpublic class SelfReader {%n\n" +
    "%ct    static char comma = 34;%n\n" +
    "%ct    static char backslash = 92;%n\n" +
    "%ct    static char tab = 9;%n\n" +
    "%ct    static char e = 101;%n\n" +
    "%ct    static char f = 102;%n\n" +
    "%ct    static char c = 99;%n\n" +
    "%ct    static char t = 116;%n\n" +
    "%ct    static char n = 110;%n\n" +
    "%ct    static char percent = 37;%n\n" +
    "%ct    static char o = 111;%n\n" +
    "%ct    static char space = 32;%n\n" +
    "%ct    static char sum = 43;%n\n" +
    "%ct    static char bracketo = 40;%n\n" +
    "%ct    static char bracketc = 41;%n\n" +
    "%ct    static char or = 124;%n\n" +
    "%ct    static char blank = 0;%n\n" +
    "%ct    static char s = 115;%n\n" +
    "%ct%n\n" +
    "%ct    private static String sc = %oc%s%oc;%n\n" +
    "%ct%n\n" +
    "%ct    public static void selfPrint(){%n\n" +
    "%ct%n\n" +
    "%ct        char[] firstReplace = {percent,e,f};%n\n" +
    "%ct        char[] secondReplace = {percent,e,f,backslash,comma};%n\n" +
    "%ct        char[] thirdReplace = {percent,c,t};%n\n" +
    "%ct        char[] fourReplace = {tab,backslash,comma,percent,c,t};%n\n" +
    "%ct        char[] fiveReplace = {percent,n};%n\n" +
    "%ct        char[] sixReplace = {percent,n,backslash,backslash,backslash,n,backslash,comma,space,sum};%n\n" +
    "%ct        char[] sevenReplace = {percent,o,c};%n\n" +
    "%ct        char[] eightReplace = {tab,backslash,comma,percent,o,c};%n\n" +
    "%ct        char[] regex = {bracketo,percent,o,c,bracketc,or,bracketo,percent,n,bracketc,or,bracketo,percent,c,t,bracketc,or,bracketo,percent,e,f,bracketc};%n\n" +
    "%ct        char[] replaceFirst = {percent,s};%n\n" +
    "%ct%n\n" +
    "%ct        String variable = sc.replaceAll(String.valueOf(firstReplace), String.valueOf(secondReplace));%n\n" +
    "%ct        variable = variable.replaceAll(String.valueOf(thirdReplace), String.valueOf(fourReplace));%n\n" +
    "%ct        variable = variable.replaceAll(String.valueOf(fiveReplace), String.valueOf(sixReplace));%n\n" +
    "%ct        variable = variable.replaceAll(String.valueOf(sevenReplace), String.valueOf(eightReplace));%n\n" +
    "%ct        String sourceCode = sc.replaceAll(String.valueOf(regex),String.valueOf(blank)).replaceFirst(String.valueOf(replaceFirst), variable);%n\n" +
    "%ct        System.out.println(sourceCode);%n\n" +
    "%ct        String variable = sc.replaceAll(String.valueOf(Arrays.asList(comma,percent,e,f,comma)), String.valueOf(Arrays.asList(comma,curly,percent,e,f,comma)));%n\n" +
    "%ct        variable = variable.replaceAll(String.valueOf(Arrays.asList(comma,percent,c,t,comma)), String.valueOf(Arrays.asList(tab,tab,backslash,comma,percent,c,t,comma)));%n\n" +
    "%ct        String sourceCode = sc.replaceFirst(\"%s\", sc);%n\n"+
    "%ct        System.out.println(sourceCode);%n\n" +
    "%ct    }%n\n" +
    "%oc}%ef";

    public static void selfPrint(){
        char[] firstReplace = {percent,e,f};
        char[] secondReplace = {percent,e,f,backslash,comma};
        char[] thirdReplace = {percent,c,t};
        char[] fourReplace = {tab,backslash,comma,percent,c,t};
        char[] fiveReplace = {percent,n};
        char[] sixReplace = {percent,n,backslash,backslash,backslash,n,backslash,comma,space,sum};
        char[] sevenReplace = {percent,o,c};
        char[] eightReplace = {tab,backslash,comma,percent,o,c};
        char[] regex = {bracketo,percent,o,c,bracketc,or,bracketo,percent,n,bracketc,or,bracketo,percent,c,t,bracketc,or,bracketo,percent,e,f,bracketc};
        char[] replaceFirst = {percent,s};

        String variable = sc.replaceAll(String.valueOf(firstReplace), String.valueOf(secondReplace));
        variable = variable.replaceAll(String.valueOf(thirdReplace), String.valueOf(fourReplace));
        variable = variable.replaceAll(String.valueOf(fiveReplace), String.valueOf(sixReplace));
        variable = variable.replaceAll(String.valueOf(sevenReplace), String.valueOf(eightReplace));
        String sourceCode = sc.replaceAll(String.valueOf(regex),String.valueOf(blank)).replaceFirst(String.valueOf(replaceFirst), variable);
        System.out.println(sourceCode);
    }
}
