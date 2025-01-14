// //complete the addBlog function to add moveup, movedown and delete button.
// function addBlog(blog) {
//   const blogList = document.querySelector(".blog-list");

//   const newBox = document.createElement("div");
//   newBox.classList.add("blog-box");

//   const newBlogPost = document.createElement("div");
//   newBlogPost.classList.add("blog-post");
//   newBox.appendChild(newBlogPost);

//   const newBlogHeader = document.createElement("div");
//   newBlogHeader.classList.add("blog-header");
//   newBlogPost.appendChild(newBlogHeader);

//   const newBlogTitle = document.createElement("h2");
//   newBlogTitle.classList.add("blog-title");
//   newBlogTitle.textContent = blog.title;
//   newBlogHeader.appendChild(newBlogTitle);

//   const newBlogDate = document.createElement("p");
//   newBlogDate.classList.add("blog-date");
//   newBlogDate.textContent = blog.date;
//   newBlogHeader.appendChild(newBlogDate);

//   const newBlogContent = document.createElement("p");
//   newBlogContent.classList.add("blog-content");
//   newBlogContent.textContent = blog.content;
//   newBlogPost.appendChild(newBlogContent);

//   // create a new div with className blog-buttons and append it to newBox
//   const newBlogButtons = document.createElement("div");
//   newBlogButtons.classList.add("blog-buttons");

//   //Create moveup button with class blog-button and move-up
//   //Add event listerner to moveup button
//   const moveUpButton = document.createElement("button");
//   moveUpButton.classList.add("blog-button", "move-up");
//   moveUpButton.textContent = "Move Up";
//   newBlogButtons.appendChild(moveUpButton);

//   //Create movedown button with class blog-button and move-down
//   //Add event listerner to movedown button
//   const moveDownButton = document.createElement("button");
//   moveDownButton.classList.add("blog-button", "move-down");
//   moveDownButton.textContent = "Move Down";
//   newBlogButtons.appendChild(moveDownButton);

//   //Create delete button with class blog-button and delete
//   //Add event listerner to delete button
//   const deleteButton = document.createElement("button");
//   deleteButton.classList.add("blog-button", "delete");
//   deleteButton.textContent = "Delete";
//   newBlogButtons.appendChild(deleteButton);

//   newBox.appendChild(newBlogButtons);
//   blogList.appendChild(newBox);

//   // Add event listeners to the buttons
//   const moveUpButtons = document.querySelectorAll(".move-up");
//   //   console.log(moveUpButtons);
//   moveUpButtons.forEach((button) => {
//     button.addEventListener("click", () => {
//       const currentBox = button.parentElement.parentElement;
//       console.log(currentBox);
//       const previousBox = currentBox.previousElementSibling;
//       console.log(previousBox);
//       if (previousBox) {
//         blogList.insertBefore(currentBox, previousBox);
//       }
//     });
//   });

//   const moveDownButtons = document.querySelectorAll(".move-down");
//   moveDownButtons.forEach((button) => {
//     button.addEventListener("click", () => {
//       debugger;
//       const currentBox = button.parentElement.parentElement;
//       console.log(currentBox);
//       const nextBox = currentBox.nextElementSibling;
//       console.log(nextBox);
//       if (nextBox) {
//         blogList.insertBefore(nextBox, currentBox);
//       }
//       return;
//     });
//   });

//   const deleteButtons = document.querySelectorAll(".delete");
//   deleteButtons.forEach((button) => {
//     button.addEventListener("click", () => {
//       const currentBox = button.parentElement.parentElement;
//       blogList.removeChild(currentBox);
//     });
//   });
// }

// const blogData = [
//   {
//     title: "First Blog Post",
//     date: "January 1, 2022",
//     content: "This is the content of the first blog post.",
//   },
//   {
//     title: "Second Blog Post",
//     date: "February 1, 2022",
//     content: "This is the content of the second blog post.",
//   },
//   {
//     title: "Third Blog Post",
//     date: "March 1, 2022",
//     content: "This is the content of the third blog post.",
//   },
// ];

// blogData.forEach((blog) => addBlog(blog)); // Automatically call the function for each blog in the array

function addBlog(blog) {
  const blogList = document.querySelector(".blog-list");

  const newBox = document.createElement("div");
  newBox.classList.add("blog-box");

  const newBlogPost = document.createElement("div");
  newBlogPost.classList.add("blog-post");
  newBox.appendChild(newBlogPost);

  const newBlogHeader = document.createElement("div");
  newBlogHeader.classList.add("blog-header");
  newBlogPost.appendChild(newBlogHeader);

  const newBlogTitle = document.createElement("h2");
  newBlogTitle.classList.add("blog-title");
  newBlogTitle.textContent = blog.title;
  newBlogHeader.appendChild(newBlogTitle);

  const newBlogDate = document.createElement("p");
  newBlogDate.classList.add("blog-date");
  newBlogDate.textContent = blog.date;
  newBlogHeader.appendChild(newBlogDate);

  const newBlogContent = document.createElement("p");
  newBlogContent.classList.add("blog-content");
  newBlogContent.textContent = blog.content;
  newBlogPost.appendChild(newBlogContent);

  const newBlogButtons = document.createElement("div");
  newBlogButtons.classList.add("blog-buttons");

  const moveUpButton = document.createElement("button");
  moveUpButton.classList.add("blog-button", "move-up");
  moveUpButton.textContent = "Move Up";
  moveUpButton.addEventListener("click", () => {
    const currentBox = moveUpButton.parentElement.parentElement;
    const previousBox = currentBox.previousElementSibling;
    if (previousBox) {
      blogList.insertBefore(currentBox, previousBox);
    }
  });
  newBlogButtons.appendChild(moveUpButton);

  const moveDownButton = document.createElement("button");
  moveDownButton.classList.add("blog-button", "move-down");
  moveDownButton.textContent = "Move Down";
  moveDownButton.addEventListener("click", () => {
    const currentBox = moveDownButton.parentElement.parentElement;
    const nextBox = currentBox.nextElementSibling;
    if (nextBox) {
      blogList.insertBefore(nextBox, currentBox);
    }
  });
  newBlogButtons.appendChild(moveDownButton);

  const deleteButton = document.createElement("button");
  deleteButton.classList.add("blog-button", "delete");
  deleteButton.textContent = "Delete";
  deleteButton.addEventListener("click", () => {
    const currentBox = deleteButton.parentElement.parentElement;
    blogList.removeChild(currentBox);
  });
  newBlogButtons.appendChild(deleteButton);

  newBox.appendChild(newBlogButtons);
  blogList.appendChild(newBox);
}

const blogData = [
  {
    title: "First Blog Post",
    date: "January 1, 2022",
    content: "This is the content of the first blog post.",
  },
  {
    title: "Second Blog Post",
    date: "February 1, 2022",
    content: "This is the content of the second blog post.",
  },
  {
    title: "Third Blog Post",
    date: "March 1, 2022",
    content: "This is the content of the third blog post.",
  },
];

blogData.forEach((blog) => addBlog(blog)); // Automatically call the function for each blog in the array
