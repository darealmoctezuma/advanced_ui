package com.example.advancedui.rv

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.advancedui.R

class PostsActivity : AppCompatActivity() {
    private lateinit var viewModel: PostViewModel

    //TODO 1) Create a new Layout resource file for your Rv item
    //TODO 2) ***Inside the layout resource file*** Design each item
    //For convenience, this file has been already created an designed for you :v

    //TODO 16) Create a new val adapter of type PostAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        //TODO 17) Set a LinearLayoutManager to the posts RecyclerView
        //TODO 18) Set a the posts recyclerView adapter with our custom adapter
        //TODO 19) Add a divider between the posts

        viewModel = ViewModelProviders.of(this).get(PostViewModel::class.java)
        viewModel.posts.observe(this, Observer { posts ->
            //TODO 20) Call postAdapter.summitList and pass posts as its argument
        })

    }

    private fun postClicked(post: Post) {
        //Do action when an item is clicked
        Toast.makeText(this, "${post.description}\n${post.alt_description}", Toast.LENGTH_SHORT)
            .show()
    }
}
