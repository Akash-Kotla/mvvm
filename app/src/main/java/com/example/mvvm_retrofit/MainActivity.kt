package com.example.mvvm_retrofit
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_retrofit.api.ApiUtilities
import com.example.mvvm_retrofit.api.Apiinterface
import com.example.mvvm_retrofit.model.PostModel
import com.example.mvvm_retrofit.repository.UserRepository
import com.example.mvvm_retrofit.viewmodel.UsersViewModel
import com.example.mvvm_retrofit.viewmodel.UsersViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response
import kotlin.toString as toString1


class MainActivity : AppCompatActivity() {
    private lateinit var usersViewModel: UsersViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val apiInterface = ApiUtilities.getInstance().create(Apiinterface::class.java)
        val userRepository = UserRepository(apiInterface)


//        fun handleUserResponse(response: Response<PostModel>): Resources<PostModel> {
//            if (response.isSuccessful) {
//                response.body()?.let { resultResponse ->
//                    return Resources.Success()
//                }
//            }
//            return Resources.Error(response.message())
//        }


        usersViewModel = ViewModelProvider(
            this, UsersViewModelFactory(userRepository),
        )[UsersViewModel::class.java]


//        apiInterface.getpostmodels("")
//
//        usersViewModel.userRepository.getUser("")

        usersViewModel.user.observe(this) { response ->
            if (response == null) {
                return@observe

            }



//            img_btn.setOnClickListener{
//                //userRepository.getUser()
//                name.text = response.data?.get(0)?.name
//                email.text = response.data?.get(0)?.email
//                course_level.text = response.data?.get(0)?.courseLevel
//                total_credits.text = response.data?.get(0)?.totalCredit.toString()
//                credits.text = response.data?.get(0)?.creditsUsed.toString()
//                expiry_date.text = response.data?.get(0)?.packageExpiryDate
//            }

          phoneoremail.addTextChangedListener {

          }




            //data to textview
//           name.text = response.data?.get(0)?.name
//            email.text = response.data?.get(0)?.email
//            course_level.text = response.data?.get(0)?.courseLevel
//            total_credits.text = response.data?.get(0)?.totalCredit.toString()
//            credits.text = response.data?.get(0)?.creditsUsed.toString()
//            expiry_date.text = response.data?.get(0)?.packageExpiryDate
        }


    }


    }













