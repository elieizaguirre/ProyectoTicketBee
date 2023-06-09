package APIREST;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestClient {

    private static final String API_URL = "https://deusto-api.arambarri.eus/api/clientes";  
    private static final String TOKEN = "258c263f485581b788b509f2499f49418c640fa412a19ae2a96a7d93a38354f1b06e577ec301a213027acbcde59a9a8ce709862b8e8e6f59c90dbbe6f2a4c43582fa58f384bd7c45016bcd1e61c25358c0e3a9d592dc5e39d60b5825b931ec77ccb228ce133e1360902eb3ec8948aa13ba66bbd8f92df5e1cc5acd00848f1cce";  

    public static void main(String[] args) throws Exception {

        URL url = new URL(API_URL);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        // set request headers
        con.setRequestMethod("GET");
        con.setRequestProperty("Authorization", "Bearer " + TOKEN);

        // send GET request
        int responseCode = con.getResponseCode();

        // read response from server
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // print response
        System.out.println(response.toString());  
    }
}

