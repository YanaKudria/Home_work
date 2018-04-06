import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class TryCatchClass {
        private String name;


        @Test
        public void toUseStringName(){
           try{System.out.println(name); }
            catch (Exception e){
               System.out.println("we don't have value of name variable");
           }

        }



}

