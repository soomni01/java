package ch11.sec04;

public class TryWithResourceExample {
    public static void main(String[] args) {
        MyResource res = null;
        try {
            res = new MyResource("A");

        } finally {
            try {
                res.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try (MyResource res2 = new MyResource("A")) {
            // res 로 작업
            String d = res.read1();
            int value = Integer.parseInt(d);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (MyResource res3 = new MyResource("A")) {
            throw new Exception("예외!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // effectivley final
        final MyResource res4 = new MyResource("A");
        MyResource res5 = new MyResource("A");

        try (res4; res5) {
//            res5 = null;
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}