package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.GeoCodingResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GoogleApiService {

    private Logger log = LoggerFactory.getLogger(GoogleApiService.class);

    public GeoCodingResponse getGeoCode(String url) throws IOException {
        HttpURLConnection httpURLConnection = formatConnection(new URL(url));
        int responseCode = httpURLConnection.getResponseCode();
        log.info("Enviando requisicao 'GET' para URL: " + url);
        log.info("Response Code: " + responseCode);
        Reader reader = new InputStreamReader(httpURLConnection.getInputStream());
        Gson gson = new GsonBuilder().create();
        GeoCodingResponse geoCodingResponse = gson.fromJson(reader, GeoCodingResponse.class);
        reader.close();
        return geoCodingResponse;
    }

    private HttpURLConnection formatConnection (URL url) throws IOException {
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type","applitcation/json");
        return con;
    }

}
