package app.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import app.model.GeoCodingResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class GoogleApiService {

    private Logger log = LoggerFactory.getLogger(GoogleApiService.class);

    @Value("${googleApi.geoCoding.url}")
    private String geoCodingUrl;

    @Value("${googleApi.key}")
    private String key;

    private static String urlAddOnAdress = "json?adress=";
    private static String urlAddOnKey = "&key=";

    public GeoCodingResponse getGeoCode(String endereco_mapa_planta_novo) throws IOException {
        log.info("Realizando consulta de " + endereco_mapa_planta_novo);
        String url = geoCodingUrl+urlAddOnAdress+endereco_mapa_planta_novo.replace(" ","+")+urlAddOnKey+key;
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
