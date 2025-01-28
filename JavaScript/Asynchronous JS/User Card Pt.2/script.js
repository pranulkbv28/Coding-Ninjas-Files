const divEle = document.querySelector(".card-container");

function getDetails(id) {
  // const request = fetch(`https://dummyjson.com/users/${id}`);
  // console.log(request);

  // const response = request.then((res) => {
  //   console.log(res);
  //   return res.json();
  // });

  // // this is being done because json() returns a promise
  // response.then((data) => {
  //   console.log(data);
  // });

  // more simplified

  fetch(`https://dummyjson.com/users/${id}`)
    .then((res) => {
      if (!res.ok) {
        throw new Error("No such id exists");
      }
      return res.json();
    })
    .then((userData) => {
      console.log(userData);
      displayUser(userData);
      return fetch(`https://dummyjson.com/users/${id - 1}`);
    })
    .then((res) => {
      if (!res.ok) {
        throw new Error("No previous id exists");
      }
      return res.json();
    })
    .then((userData) => {
      console.log(userData);
      displayUser(userData, "afterbegin", "other");
      return fetch(`https://dummyjson.com/users/${id + 1}`);
    })
    .then((res) => {
      if (!res.ok) {
        throw new Error("No previous id exists");
      }
      return res.json();
    })
    .then((userData) => {
      console.log(userData);
      displayUser(userData, "beforeend", "other");
      // return fetch(`https://dummyjson.com/users/${id + 1}`);
    })
    .catch((err) => {
      console.error("Error fetching user details:", err);
    });
}

function displayUser(userData, pos = "beforeend", className = "") {
  const card = `
      <div class="user-card ${className}">
        <img src=${userData.image} alt="Profile Image" />
        <h3>${userData.firstName}</h3>
        <h3>${userData.lastName}</h3>
        <p class="email">${userData.email}</p>
        <button class="btn">View Profile</button>
      </div>
    `;

  divEle.insertAdjacentHTML(pos, card);
}

getDetails(2);
// console.log("User: ", userDetails);

// const req = new XMLHttpRequest();

// req.open("GET", `https://dummyjson.com/users/${id}`);
// req.send();

// req.addEventListener("load", function () {
//   // console.log(JSON.parse(this.responseText));
//   console.log("Entering reqs");
//   const userData = JSON.parse(this.responseText);
//   console.log(userData);

//   displayUser(userData);

//   const req2 = new XMLHttpRequest();

//   req2.open("GET", `https://dummyjson.com/users/${id - 1}`);
//   req2.send();

//   req2.addEventListener("load", function () {
//     // console.log(JSON.parse(this.responseText));
//     if (this.status !== 200) return;

//     const userData = JSON.parse(this.responseText);
//     console.log(userData);

//     displayUser(userData, "afterbegin", "other");

//     const req3 = new XMLHttpRequest();

//     req3.open("GET", `https://dummyjson.com/users/${id + 1}`);
//     req3.send();

//     req3.addEventListener("load", function () {
//       // console.log(JSON.parse(this.responseText));
//       if (this.status !== 200) return;

//       const userData = JSON.parse(this.responseText);
//       console.log(userData);

//       displayUser(userData, "beforeend", "other");
//     });
//   });
// });
