package com.smirk.fragments

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import com.mentee.util.others.AppController
import com.smirk.LoginActivity
import com.smirk.R
import com.smirk.activity.*
import com.smirk.customView.PoppinsMButton
import kotlinx.android.synthetic.main.fragment_settings.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SettingsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SettingsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    fun initUI(){
        rlPersonal.setOnClickListener {
            startActivity(Intent(requireActivity(),PersonalProfileActivity::class.java ))
        }
        rlMatches.setOnClickListener {
            startActivity(Intent(requireActivity(),MatchesActivity::class.java ))
        }
        rlProfile.setOnClickListener {
            startActivity(Intent(requireActivity(),ProfileSettingActivity::class.java ))
        }
        rlPhotos.setOnClickListener {
            startActivity(Intent(requireActivity(),YourPhotosActivity::class.java ))
        }
        rlTerms.setOnClickListener {
            //startActivity(Intent(requireActivity(),HelpActivity::class.java ))
        }
        rlPrivacy.setOnClickListener {
           // startActivity(Intent(requireActivity(),OtherProfileActivity::class.java ))
        }
        rlHelp.setOnClickListener {
            startActivity(Intent(requireActivity(),HelpActivity::class.java ))
        }
        tvSignout.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        val dialog = Dialog(requireActivity(), R.style.Theme_AppCompat_Light_Dialog_Alert)
        dialog.window!!.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog!!.getWindow()!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.signout_popup_dialog_layout)

        val yesBtn = dialog.findViewById(R.id.btnYes) as PoppinsMButton
        val noBtn = dialog.findViewById(R.id.btnNo) as PoppinsMButton
        yesBtn.setOnClickListener {
            dialog.dismiss()
            AppController.mInstance.clearData()
            startActivity(Intent(requireActivity(),LoginActivity::class.java))
            requireActivity().finish()
        }
        noBtn.setOnClickListener { dialog.dismiss() }
        dialog.show()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SettingsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SettingsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}