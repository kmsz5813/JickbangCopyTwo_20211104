package com.nepplus.jickbangcopytwo_20211104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jickbangcopytwo_20211104.datas.RoomData

class MainActivity : AppCompatActivity() {

    val mRomms = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRomms.add(RoomData(9000,"서울시 동대문구",5,"1번째 방입니다.") )
        mRomms.add(RoomData(28000,"서울시 서대문구",0,"2번째 방입니다."))
        mRomms.add(RoomData(25000,"경기도 고양시",17,"3번째 방입니다."))
        mRomms.add(RoomData(8300,"서울시 중구",-2,"4번째 방입니다."))
        mRomms.add(RoomData(195300,"서울시 송파구",20,"5번째 방입니다."))


    }
}