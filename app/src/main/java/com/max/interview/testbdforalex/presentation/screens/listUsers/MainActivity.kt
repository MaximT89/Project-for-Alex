package com.max.interview.testbdforalex.presentation.screens.listUsers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.max.interview.testbdforalex.R
import com.max.interview.testbdforalex.data.cache.room.UserDao
import com.max.interview.testbdforalex.data.cache.room.UserEntity
import com.max.interview.testbdforalex.data.common.storage.UserStorage
import com.max.interview.testbdforalex.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    @Inject
    lateinit var userDao: UserDao

    @Inject
    lateinit var userStorage: UserStorage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            lifecycleScope.launch {

                userDao.insertUser(UserEntity(0,
                    userStorage.getRandomFirstName(),
                    userStorage.getRandomLastName(),
                    userStorage.getRandomAge()))

                val list = userDao.getUsers()

                withContext(Dispatchers.Main) {

                    val sb = StringBuilder()

                    list.forEach {
                        sb.append(it.toString()).append("\n")
                    }

                    binding.textView.text = sb.toString()
                }
            }
        }
    }
}