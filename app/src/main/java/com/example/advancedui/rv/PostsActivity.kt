package com.example.advancedui.rv

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.advancedui.R
import kotlinx.android.synthetic.main.activity_recycler_view.*

class PostsActivity : AppCompatActivity() {
    private lateinit var viewModel: PostViewModel
    private val postAdapter = PostAdapter(this::postClicked)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        viewModel = ViewModelProviders.of(this).get(PostViewModel::class.java)

        posts.layoutManager = LinearLayoutManager(this)
        posts.adapter = postAdapter

        posts.apply {
            layoutManager = LinearLayoutManager(this@PostsActivity)
            adapter = postAdapter
            addItemDecoration(
                DividerItemDecoration(
                    this@PostsActivity,
                    DividerItemDecoration.VERTICAL
                )
            )
        }

        viewModel.posts.observe(this, Observer { posts ->
            postAdapter.summitList(posts)
        })

    }

    private fun postClicked(post: Post) {
        //Do action when an item is clicked
        Toast.makeText(this, "${post.description}\n${post.alt_description}", Toast.LENGTH_SHORT)
            .show()
    }
}
