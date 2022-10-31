package com.example.assignment3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import com.example.assignment3.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addDetail("Android 9.0", "Pie")
        addDetail("Android 8.0", "Oreo")
    }

    @SuppressLint("ResourceType")
    private fun addDetail(versionName: String, codeName: String) {

        val tableRow = TableRow(this)

        tableRow.addView(etAndroidVersion, 0)
        tableRow.addView(etAndroidCodeNm, 1)

        val tvVersionParam = TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT).apply {
            setMargins(0, 5, 8, 0)
        }
        tvVersionParam.weight = 1f
        etAndroidVersion.setBackgroundResource(R.color.table_row_bg)
        etAndroidVersion.layoutParams = tvVersionParam

        val tvCodeNameParam = TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT).apply {
            setMargins(0, 2, 0, 0)
        }
        tvCodeNameParam.weight = 1f
        etAndroidCodeNm.setBackgroundResource(R.color.table_row_bg)
        etAndroidCodeNm.layoutParams = tvCodeNameParam
    }

    fun addRow(view: View) {
        addDetail(etAndroidVersion.text.toString(), etAndroidCodeNm.text.toString())
    }
}