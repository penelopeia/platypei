package com.platypus.platypusapp;

import org.json.JSONObject;
import org.json.JSONException;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class response extends AppCompatActivity {

    private Button call;
    private TextView response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);

        response = (TextView) findViewById(R.id.textView3);
        call = (Button) findViewById(R.id.button7);
    }
//
//    public void invokeWS(RequestParams params){
//        // Make RESTful webservice call using AsyncHttpClient object
//        AsyncHttpClient client = new AsyncHttpClient();
//        client.get("http://192.168.2.2:9999/useraccount/login/dologin",params ,new AsyncHttpResponseHandler() {
//            // When the response returned by REST has Http response code '200'
//            @Override
//            public void onSuccess(String response) {
//                try {
//                    // JSON Object
//                    JSONObject obj = new JSONObject(response);
//                    // When the JSON response has status boolean value assigned with true
//                    if(obj.getBoolean("status")){
//                        Toast.makeText(getApplicationContext(), "You are successfully logged in!", Toast.LENGTH_LONG).show();
//                        // Navigate to Home screen
//                        navigatetoHomeActivity();
//                    }
//                    // Else display error message
//                    else{
//                        errorMsg.setText(obj.getString("error_msg"));
//                        Toast.makeText(getApplicationContext(), obj.getString("error_msg"), Toast.LENGTH_LONG).show();
//                    }
//                } catch (JSONException e) {
//                    // TODO Auto-generated catch block
//                    Toast.makeText(getApplicationContext(), "Error Occured [Server's JSON response might be invalid]!", Toast.LENGTH_LONG).show();
//                    e.printStackTrace();
//
//                }
//            }
//            // When the response returned by REST has Http response code other than '200'
//            @Override
//            public void onFailure(int statusCode, Throwable error,
//                                  String content) {
//                // Hide Progress Dialog
//                prgDialog.hide();
//                // When Http response code is '404'
//                if(statusCode == 404){
//                    Toast.makeText(getApplicationContext(), "Requested resource not found", Toast.LENGTH_LONG).show();
//                }
//                // When Http response code is '500'
//                else if(statusCode == 500){
//                    Toast.makeText(getApplicationContext(), "Something went wrong at server end", Toast.LENGTH_LONG).show();
//                }
//                // When Http response code other than 404, 500
//                else{
//                    Toast.makeText(getApplicationContext(), "Unexpected Error occcured! [Most common Error: Device might not be connected to Internet or remote server is not up and running]", Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//    }
}
