package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val myName: MyName = MyName("Júlia")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = myName

//        findViewById<Button>(R.id.btnEntraNome).setOnClickListener {
//            adicionarApelido(it)
//        }
        binding.btnEntraNome.setOnClickListener {
            adicionarApelido(it)
        }
    }

    private fun adicionarApelido(view: View) {

        binding.apply {
            myName?.nickname = edtNickname.text.toString()
            invalidateAll()
            edtNickname.visibility = View.GONE
            view.visibility = View.GONE
            txtExibeApelido.visibility = View.VISIBLE

        }

        val guardaTeclado = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        guardaTeclado.hideSoftInputFromWindow(view.windowToken, 0)
    }


}