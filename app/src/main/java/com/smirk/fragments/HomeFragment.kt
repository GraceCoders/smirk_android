package com.smirk.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smirk.R
import com.smirk.activity.MatchActivity
import com.smirk.adapter.DeckAdapter
import com.smirk.data.HomeBean
import kotlinx.android.synthetic.main.fragment_home.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var homeList: ArrayList<HomeBean>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()

    }

    private fun initUI(){
        homeList = ArrayList<HomeBean>()

        val infoModel = HomeBean()
        infoModel.id = 1
        infoModel.img = R.drawable.img3

        homeList.add(infoModel)

        val infoModel1 = HomeBean()
        infoModel1.id = 2
        infoModel1.img = R.drawable.img3

        homeList.add(infoModel1)

        val infoModel2 = HomeBean()
        infoModel2.id = 3
        infoModel2.img = R.drawable.img3
        homeList.add(infoModel2)

        val infoModel3 = HomeBean()
        infoModel3.id = 3
        infoModel3.img = R.drawable.img3
        homeList.add(infoModel3)

        val infoModel4 = HomeBean()
        infoModel4.id = 3
        infoModel4.img = R.drawable.img3

        homeList.add(infoModel4)

        swipe_deck.setAdapter(DeckAdapter(homeList,requireContext()))

        imgTick.setOnClickListener {
            startActivity(Intent(requireActivity(), MatchActivity::class.java))
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}