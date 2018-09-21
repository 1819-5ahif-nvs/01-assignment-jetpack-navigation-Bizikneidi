package at.htl.nvs.jetpackdemo.ui.second


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import at.htl.nvs.jetpackdemo.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonNext.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nameArg", inputName.text.toString())
            Navigation.findNavController(it).navigate(R.id.action_secondFragment_to_thirdFragment, bundle)
        }
    }
}
