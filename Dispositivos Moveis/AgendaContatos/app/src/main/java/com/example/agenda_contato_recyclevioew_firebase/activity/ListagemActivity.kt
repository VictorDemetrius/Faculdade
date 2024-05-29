package com.example.agenda_contato_recyclevioew_firebase.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.agenda_contato_recyclevioew_firebase.R
import com.example.agenda_contato_recyclevioew_firebase.model.Contato
import com.example.agenda_contato_recyclevioew_firebase.recycle.ContatoAdapter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import okhttp3.Call
import okhttp3.Callback
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.Response
import java.io.IOException
import java.lang.reflect.Type

class ListagemActivity: AppCompatActivity() {
    val gson = Gson()
    val lista = ArrayList<Contato>()
    var clientHttp = OkHttpClient()
    val rcvContatos = findViewById<RecyclerView>(R.id.rcvContatos)


    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.listagem_layout)

        lista.add(Contato("Jão Medeiros", "(11) 98755-6412","jaozinhofigura@gmail.com"))
        lista.add(Contato("Maria Zacarias", "(11) 94789-6481","maryzack@gmail.com"))

        val rcvContatos = findViewById<RecyclerView>(R.id.rcvContatos)
        val adapter = ContatoAdapter(this,lista)
        rcvContatos.adapter = adapter
        rcvContatos.layoutManager = LinearLayoutManager(this)

        val btnFormulario = findViewById<Button>(R.id.btnFormulario)
        btnFormulario.setOnClickListener {
            val intent = Intent(this, FormularioActivity::class.java)
            startActivity(intent)
        }

    }



    override fun onStart() {
        super.onStart()
        val request = Request.Builder()
            .get()
            .url("https://fatec-2024-1s-pdmi-default-rtdb.firebaseio.com/agenda.json")
            .build()
        val response = object : Callback {
            override fun onFailure(call: Call?, e: IOException?) {
                Log.e("AGENDA-CONTATO", e?.message.toString())
            }
            override fun onResponse(call: Call?, response: Response?) {
                Log.i("AGENDA-CONTATO", "Dados recebidos convertendo")
                val body = response?.body()
                val type = object : TypeToken<HashMap<String?, Contato?>?>() {}.type
                val myMap: HashMap<String, Contato> = gson.fromJson(body?.string(), type)
                val listaTemp = ArrayList<Contato>()
                myMap.values.forEach {
                    Log.i("AGENDA-CONTATO", "Contato: $it")
                    listaTemp.add(it)
                }
                this@ListagemActivity.runOnUiThread(
                    java.lang.Runnable {
                        lista.clear()
                        lista.addAll(listaTemp)
                        rcvContatos.adapter?.notifyDataSetChanged()
                    }
                )
            }
        }
        clientHttp.newCall(request).enqueue(response)
    }


}