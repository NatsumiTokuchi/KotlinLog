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
        Log.d("kotlintest", "私の名前は" + human.name + "です。年は" + human.age + "歳です。")

        human.think()
        Log.d("kotlintest", "私は" + human.hobby + "について考える。")

    }
}
