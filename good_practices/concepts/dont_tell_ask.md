## Tell Don't Ask

- The code always need to tell another code what to do, instead of asking for informations to do some task. Example:

I want to publish a post using my Post class:

```ruby
# The ASK way - wrong way
# Check the post status outside 
#   the class to create the post

class Post {
	status
}

post = Post.new()
if(post.status == PostStatus::DRAFT) {
  post.status = PostStatus::PUBLISHED
} else {
	throw AlreadyPublishedPostException.new()
}

```

```ruby
# The TELL way - right way
# Tell the post class to publish
#  the post

class Post {
	def publish()
    if(self.status != PostStatus::DRAFT) {
			throw AlreadyPublishedPostException.new()
		}
		
		self.status = PostStatus::PUBLISHED
  end

	private

	status
}

post = Post.new()
post.publish()
```
