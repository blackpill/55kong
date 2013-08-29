import java.util.regex.*;

public class pattern{
  public static void main(String[] args){
    String content= "<ul class=\"map-list clearfix\"><li > <h3><a target = \"_blank\" href=\"/forum-7-1.html\">sc/zmd</a><span>(zt:10846443)</span></h3> <a target = \"_blank\" href=\"/forum-7-1.html\" class=\"pic\"><img width=\"50\" height=\"50\" alt=\"sc/zmd\" src=\"/images/bbsmap/map_7.jpg\"></a> <a target = \"_blank\" href=\"/forum-7-1.html\"><p class=\"white\">dazhe...</p></a> </li><li > <h3><a target = \"_blank\" href=\"/forum-8-1.html\">smsj</a><span>(zt:1415967)</span></h3> <a target = \"_blank\" href=\"/forum-8-1.html\" class=\"pic\"><img width=\"50\" height=\"50\" alt=\"smsj\" src=\"/images/bbsmap/map_8.jpg\"></a> <a target = \"_blank\" href=\"/forum-8-1.html\"><p class=\"white\">wydh...</p></a> </li></ul>";

    //Pattern sp = Pattern.compile("<span class=\"SectionName\"><a[^<>]+>([^<>]+)</a></span>(.*?)class=\"SecLine\"></td>", Pattern.DOTALL);
    Pattern sp = Pattern.compile("<ul class=\"map-list clearfix\">(.*?)</ul>", Pattern.DOTALL);
    Matcher sm = sp.matcher(content);
    if(sm.find()){
      String str1 = sm.group(1);
      System.out.println(str1);
    }
    Pattern sp2 = Pattern.compile("<h3><a target = \"_blank\" href=\"/forum-[0-9]-1.html\">([^<>]+)</a>", Pattern.DOTALL);
    Matcher sm2 = sp2.matcher(content);

    while(sm2.find()){
      String str2 = sm2.group(1);
      System.out.println(str2);
    }
  }
}
