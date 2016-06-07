package test_app;


//import test_app.Page;

/**
 * Created by asadreev on 5/20/16.
 */
public class HelloWorld {
    private static String var = "Hello world";

    public static String getString(){
         String str = "New String";
        return str;
    }

  public static void main(String args[]) {
        String result = getString();

        Page page = new Page("Google.com","Google Title", 20);
        Page page1 = new Page("Facebook.com","Facebook Title", 30);
        Page page2 = new Page("vk.com","VK Title", 7);
        Page page3 = new Page("LinkedIn","LinkedIn Title", 15);

       Page type2 = new Page();
        page.getTitle();

       String url = page.getURL();



   }


}
