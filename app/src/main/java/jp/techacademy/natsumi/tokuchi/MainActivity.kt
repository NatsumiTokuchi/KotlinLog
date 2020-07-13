package jp.techacademy.natsumi.tokuchi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("得地菜摘", 24, "アプリ開発")

        human.say()

        human.think()
    }
}
