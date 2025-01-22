const divEle = document.querySelector(".card-container");

function getDetails(id) {
  const req = new XMLHttpRequest();

  req.open("GET", `https://dummyjson.com/users/${id}`);
  req.send();

  req.addEventListener("load", function () {
    // console.log(JSON.parse(this.responseText));
    console.log("Entering reqs");
    const userData = JSON.parse(this.responseText);
    console.log(userData);

    displayUser(userData);

    const req2 = new XMLHttpRequest();

    req2.open("GET", `https://dummyjson.com/users/${id - 1}`);
    req2.send();

    req2.addEventListener("load", function () {
      // console.log(JSON.parse(this.responseText));
      if (this.status !== 200) return;

      const userData = JSON.parse(this.responseText);
      console.log(userData);

      displayUser(userData, "afterbegin", "other");

      const req3 = new XMLHttpRequest();

      req3.open("GET", `https://dummyjson.com/users/${id + 1}`);
      req3.send();

      req3.addEventListener("load", function () {
        // console.log(JSON.parse(this.responseText));
        if (this.status !== 200) return;

        const userData = JSON.parse(this.responseText);
        console.log(userData);

        displayUser(userData, "beforeend", "other");
      });
    });
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

getDetails(3);
// getDetails(2);
// getDetails(3);
