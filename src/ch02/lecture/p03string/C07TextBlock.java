package ch02.lecture.p03string;

public class C07TextBlock {
    public static void main(String[] args) {
        /*
        동해물과 백두산이
        마르고 닳도록
         */
        String a = "동해물과 백두산이 \n마르고 닳도록\n";
        System.out.println("a = " + a);

        String b = "동해물과 백두산이 \n" +
                "마르고 닳도록\n";
        System.out.println("b = " + b);

        // """ : text block
        // 작성한 대로 문자열 완성
        // 첫 """ 이후 엔터
        // 가장 왼쪽 들여쓰기 기준으로 들여쓰기 결정
        String c = """
                동해물과 백두산이
                마르고 닳도록
                """;
        System.out.println("c = " + c);

        // "
        String html1 = "<html>\n" +
                "   <head>\n" +
                "   </head>\n" +
                "   <body>\n" +
                "   </body>\n" +
                "</html>\n";
        System.out.println(html1);
        // """
        String html2 = """
                <html>
                    <head>
                    </head>
                    <body>
                    </body>
                </html>
                """;
        System.out.println(html2);
    }
}
