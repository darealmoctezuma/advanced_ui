package com.example.advancedui.rv

//TODO 4) Create a PostAdapter class and an inner class PostViewHolder
//TODO 5) Make PostViewHolder receive a View on it's constructor and make it extend RecyclerView.ViewHolder having view as it's constructor argument
//TODO 6) Create 3 private variables: username, profile and postImage and assign it's value form the view argument
//TODO 7) Make PostAdapter extend RecyclerView.Adapter<PostAdapter.PostViewHolder>()
//TODO 8) Implement methods
//TODO 9) On onCreateViewHolder() return a new ViewHolder of type PostViewHolder
//TODO 10) Create a new private val with name posts of type mutableListOf<Post>()
//TODO 11) Make getItemCount() return the size of the posts list
//TODO 12) Create a new method bind(post: Post) on PostViewHolder (Already commented on the file for convenience)
//TODO 13) Call the bind method on the holder object passing in the post at the given position (posts[position])
//TODO 14) Create a method on PostAdapter summitList(posts: List<Post>) (Already commented on the file for convenience)
//TODO 15) Called notifyDataSetChanged() on summitList


//TODO 21) Set val postClickListener: (post: Post) -> Unit as the constructor argument for PostAdapter
//TODO 22) On the bind method, set an onClickListener to the view and invoke the listener passing the post as a parameter

/*
fun bind(post: Post) {
    username.text = post.user.username

    Picasso.get()
        .load(post.user.profile_image.small)
        .into(profile)

    Picasso.get()
        .load(post.urls.regular)
        .into(postImage)
}*/

/*fun summitList(posts: List<Post>) {
    this.posts.clear()
    this.posts.addAll(posts)
}*/

