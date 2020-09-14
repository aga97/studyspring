package me.jungwoo.springinitializr;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class CrawlServiceImpl implements CrawlService{

    @Override
    public String getData() {
        String data;

        String URL = "https://sports.news.naver.com/index.nhn";
        try {
            Document doc = Jsoup.connect(URL).get();// 지정한 url의 html 태그를 다 가져옴, 문자열 형태
            data = doc.toString();
            Elements el = doc.select("strong.title");

            String title = el.text();
            //String news = el.select("p.news").text();

            return title;
        } catch (Exception e){
            return "fail Crawling";
        }
    }
}
