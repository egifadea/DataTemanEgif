package com.example.datatemanegif

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman=ArrayList()
        listTeman.add(MyFriend("Ali Mustofa", "laki-laki", "alimustofa@gmail.com",
        "08123456789", "Bogor")
        )
        listTeman.add(MyFriend("Egif Adea Lutfi", "perempuan", "egifegif568@gmail.com",
        "081546240013", "Blitar")
        )
        listTeman.add(MyFriend("Rika Nurhalimah", "perempuan", "rikahalimah264@gmail.com",
        "085746989442", "Berarum")
        )
        listTeman.add(MyFriend("Riko Arbiansah", "laki-laki", "riko345@gmail.com",
        "085855155077", "kalimatan")
        )
        listTeman.add(MyFriend("Latif Sirait", "laki-laki", "latif6667@gmail.com",
        "081276365764", "surabaya")
        )
        listTeman.add(
            MyFriend("Febrianti Ayu", "perempuan", "febrianti@gmail.com",
        "082678543009", "sidoarjo")
        )
        listTeman.add(
            MyFriend("Sistahana", "perempuan", "sistahana@gmail.com",
        "081345267987", "malang")
        )
        listTeman.add(MyFriend("putri", "perempuan", "putri8765@gmail.com",
            "085134256864", "jakarta")
        )



    }

    private fun tampilTeman() {
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(requireActivity(), listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iniview()
    }


    private fun iniview() {
        simulasiDataTeman()
        tampilTeman()

    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}