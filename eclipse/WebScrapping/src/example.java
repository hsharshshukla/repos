import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
public class example {
public static void main(String args[]) throws IOException{
	Document d = Jsoup.connect("https://www.wikihow.com/wikiHowTo?search=Signal+wifi").timeout(6000).get();
	Elements ele = d.select("div#searchresults_list");
	for (Element element : ele.select("dev.result")){
		String img_url = element.select("div.result_thumb img").attr("src");
		System.out.println(img_url);
		
	}
		
}
}
