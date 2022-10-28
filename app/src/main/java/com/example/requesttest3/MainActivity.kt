package com.example.requesttest3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.requesttest3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		binding.webView.webViewClient = WebViewClient()
		binding.btnSend.setOnClickListener {
			binding.webView.loadUrl("http://192.168.0.29:8083/test/login?uid=${binding.txtID.text}&pw=${binding.txtPW.text}")
		}

		binding.btnEnjoy.setOnClickListener {
			val intent = Intent(this, SingUpActivity::class.java)

			startActivity(intent)
		}
	}
}