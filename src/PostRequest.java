import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;


public class PostRequest {

    public  String post1(String input) throws Exception {
        //Making the connection to the URL from where we are fetching the API.
        URL url = new URL("https://gpa-rho.vercel.app/getBard_Response");
        //Creating the connection with the URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");

        //Passing the actual query to the API
        String requestBody = "{\"Query\": \"" + input + "\" ,\"Key\":\"sweetfriend\"}";
        connection.setDoOutput(true);
        connection.getOutputStream().write(requestBody.getBytes());

        //Reading the output in buffered reader.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        //Taking the output line by line using the readLine() method.
        String line,reply="";
        while ((line = bufferedReader.readLine()) != null) {
            JSONObject jsonObject = new JSONObject(line);
            //Storing the JSON object as a string.
            reply = (String) jsonObject.get("Content");
        }
        //Passing the string back to the calling function.
        return reply;
    }

}