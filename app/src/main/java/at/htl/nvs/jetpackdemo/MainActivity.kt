package at.htl.nvs.jetpackdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    lateinit var drawer: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        drawer = findViewById(R.id.container)

        val host = supportFragmentManager.findFragmentById(R.id.navFragment) as NavHostFragment? ?: return
        NavigationUI.setupActionBarWithNavController(this, host.navController, container)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(drawer, Navigation.findNavController(this, R.id.navFragment))
    }
}
