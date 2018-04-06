import org.testng.annotations.Test;

public class OddClass {


        @Test
        private void toShowAllEvenNumbers() {

            int i;
            for(i = 1; i <= 100; i++)
                if (i % 2 == 0) {
                    System.out.println(i);
                }
        }
    }


