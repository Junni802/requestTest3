package com.example.requesttest3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.requesttest3.databinding.ActivitySingUpBinding

class SingUpActivity : AppCompatActivity() {
	val binding by lazy { ActivitySingUpBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		binding.webView1.webViewClient = WebViewClient()

		binding.btnSingUp.setOnClickListener {
			binding.webView1.loadUrl("http://192.168.0.29:8083/test/singUp?uid=${binding.txtIID.text}&pw=${binding.txtIPW.text}&name=${binding.txtIName.text}")
		}

		binding.btnBack.setOnClickListener {
			finish()
		}
	}
}