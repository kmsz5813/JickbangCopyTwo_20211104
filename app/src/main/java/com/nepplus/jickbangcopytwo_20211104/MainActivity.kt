package com.nepplus.jickbangcopytwo_20211104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jickbangcopytwo_20211104.adapters.RoomAdapter
import com.nepplus.jickbangcopytwo_20211104.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRomms = ArrayList<RoomData>()
    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRomms.add(RoomData(9000,"서울시 동대문구",5,"1번째 방입니다.") )
        mRomms.add(RoomData(28000,"서울시 서대문구",0,"2번째 방입니다."))
        mRomms.add(RoomData(25000,"경기도 고양시",17,"3번째 방입니다."))
        mRomms.add(RoomData(8300,"서울시 중구",-2,"4번째 방입니다."))
        mRomms.add(RoomData(195300,"서울시 송파구",20,"5번째 방입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRomms)
        roomListView.adapter = mRoomAdapter


    }
}