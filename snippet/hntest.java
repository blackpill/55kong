import java.util.regex.*;
import java.net.MalformedURLException;
import java.io.IOException;
import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class hntest{
  public static void main(String[] args){
    try{
       getHomeTile();
    }catch(Exception e){
       e.printStackTrace();
    }
  }

  public static void getHomeTile() throws FailingHttpStatusCodeException, MalformedURLException, IOException{
        final WebClient webClient = new WebClient(BrowserVersion.FIREFOX_3_6);
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.getCookieManager().setCookiesEnabled(true);

        final HtmlPage htmlPage = webClient.getPage("http://www.baidu.com");
        //System.out.println(htmlPage.getTitleText());
        //System.out.println(htmlPage.getTextContent());
        System.out.println("END");
  }
}
