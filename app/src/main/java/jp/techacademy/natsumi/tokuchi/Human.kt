package jp.techacademy.natsumi.tokuchi

class Human: Animal, Thinkable {
    var hobby: String

    constructor(name: String, age: Int, hobby:String): super(name, age) {
        this.hobby = hobby
    }

    override fun say() {
    }

    override fun think() {
    }
}

