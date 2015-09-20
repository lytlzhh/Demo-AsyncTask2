package com.example.llw.demo_asynctask;

import android.os.AsyncTask;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button btnstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.image);
        btnstart = (Button) findViewById(R.id.button);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  imageView.setImageResource(R.drawable.r);
                Read("https://www.baidu.com/index.php?tn=58059073_pg&ch=14");

            }
        });


    }

    public void Read(String str) {

        new AsyncTask<String, Void, String>() {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
            }

            @Override
            protected String doInBackground(String... params) {
                try {
                    URL url = new URL(params[0]);
                /*  URLConnection urlConnection =  url.openConnection();
                  InputStream stream =  urlConnection.getInputStream();
                    InputStreamReader streamReader = new InputStreamReader(stream);
                    BufferedReader bufferedReader = new BufferedReader(streamReader);
                    String line;
                    StringBuilder stringBuilder = new StringBuilder();
                    while ((line=bufferedReader.readLine())!="")
                    {
                        stringBuilder.append(line);

                    }
                    bufferedReader.close();
                    stream.close();
                    return  stringBuilder.toString();

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return  null;
            }*/

            @Override
            protected void onProgressUpdate(Void... values) {
                super.onProgressUpdate(values);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
            }
        }.execute(str);
    }
}