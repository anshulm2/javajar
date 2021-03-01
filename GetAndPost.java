import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.io.OutputStream;

import java.io.OutputStreamWriter;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.ProtocolException;

import java.net.URL;

class GetAndPost
{
public static void main(String[] args) throws IOException {
    System.out.println("hellow orld");
    GetAndPost.MyGETRequest();
}

public static void MyGETRequest() throws IOException {
    URL urlForGetRequest = new URL("https://reqres.in/api/products/");
    String readLine = null;
    HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
    conection.setRequestMethod("GET");
    //conection.setRequestProperty("usierId", "a1bcdef"); // set userId its a sample here
    int responseCode = conection.getResponseCode();


    if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(conection.getInputStream()));
        StringBuffer response = new StringBuffer();
        while ((readLine = in .readLine()) != null) {
            response.append(readLine);
        } in .close();
        // print result
        //         System.out.println("JSON String Result " + response.toString());
        //                 //GetAndPost.POSTRequest(response.toString());
        //                     } else {
        //                             System.out.println("GET NOT WORKED");
        //                                 }
        //
        //                                 }
                                 }
}
}
