package test_app;

/**
 * Created by asadreev on 5/20/16.
 */
public class Page {
    private String url;
    String title;
    public int numberOfSomeThings;

    public Page(String url, String title, int numberOfSomeThings){
        this.url = url;
        this.title = title;
        this.numberOfSomeThings = numberOfSomeThings;
    }
    public Page(){
        this.url = "";
        this.title = "";
        this.numberOfSomeThings = 5;
    }
    public String getURL(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }


    public String getTitle(){
        return title;
    }

    public int getNumbers(){
        return numberOfSomeThings;
    }

}
