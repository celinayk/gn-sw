package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

//Restful API 처리하는 컨트롤러 클래스
@RestController
public class TourismController {

    @GetMapping("/apitest")
    public String callApi() {

        StringBuilder result = new StringBuilder();
        try {
            String apiUrl = "https://apis.data.go.kr/B551011/KorService1/searchFestival1?" +
                    "serviceKey=bx85ZQyXZ%2BzD6Aah4J9Bz7yZ55piQrVEGw0378dm6fkhBh6mQIFwhoQTcpjUKSbZ3NVfcN%2BtdmU2RHEpNpcIzg%3D%3D" +
                    "&numOfRows=10" +
                    "&MobileOS=ETC" +
                    "&MobileApp=AppTest" +
                    "&_type=json" +
                    "&listYN=Y" +
                    "&arrange=A" +
                    "&eventStartDate=20170901";

            URL url = new URL(apiUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), StandardCharsets.UTF_8));

            String returnLine;
            while((returnLine= bufferedReader.readLine())!=null) {
                result.append(returnLine).append("\n");
            }
            urlConnection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result.toString();
    }
}