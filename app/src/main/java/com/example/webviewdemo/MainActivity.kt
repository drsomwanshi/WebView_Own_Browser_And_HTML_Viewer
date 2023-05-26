package com.example.webviewdemo

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var web1:WebView?=null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        web1=findViewById(R.id.web1);
    }
    fun fun1(v: View)
    {
        var txt1=findViewById(R.id.txt1) as EditText
        var text=txt1.text.toString()
        web1?.loadUrl(text)
    }
    fun fun2(v: View)
    {
        var txt1=findViewById(R.id.txt1) as EditText
        var text=txt1.text.toString()
        web1?.loadData(text,"text/html","utf-8")
    }
    fun fun3(v: View)
    {
        val url = "https://cocsit.org.in/assets/pdf/Lab%20Mannual/MOBILE_APPLICATION_DEVELOPMENT_LAB_Mannual_for_bcsty_pra1.pdf"
        web1?.getSettings()?.setJavaScriptEnabled(true);
        web1?.getSettings()?.setLoadWithOverviewMode(true);
        web1?.loadUrl("https://docs.google.com/viewer" +
                "?embedded=true&url="+url);
    }
    fun fun4(v: View)
    {
        web1?.goBack()
    }
    fun fun5(v: View)
    {
        web1?.goForward()
    }


}