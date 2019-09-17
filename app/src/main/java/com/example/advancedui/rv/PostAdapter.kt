package com.example.advancedui.rv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.advancedui.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_post.view.*

class PostAdapter(val postClickListener: (post: Post) -> Unit) :
    RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    private val posts = mutableListOf<Post>()

    fun summitList(posts: List<Post>) {
        this.posts.clear()
        this.posts.addAll(posts)
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount() = posts.size

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(posts[position])
    }

    inner class PostViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val username = view.username
        private val profile = view.profile
        private val postImage = view.postImage

        fun bind(post: Post) {
            username.text = post.user.username

            Picasso.get()
                .load(post.user.profile_image.small)
                .into(profile)

            Picasso.get()
                .load(post.urls.regular)
                .into(postImage)

            view.setOnClickListener {
                postClickListener.invoke(post)
            }
        }
    }
}