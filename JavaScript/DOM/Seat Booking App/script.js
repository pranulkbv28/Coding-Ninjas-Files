//Create you project here from scratch
const moviesList = [
  { movieName: "Flash", price: 7 },
  { movieName: "Spiderman", price: 5 },
  { movieName: "Batman", price: 4 },
];

let movieName = document.getElementById("movieName");
let moviePrice = document.getElementById("moviePrice");

function getMovieDetails(movieName) {
  return moviesList.find((movie) => movie.movieName === movieName);
}

// Use moviesList array for displaing the Name in the dropdown menu
const selectMovieDropdown = document.getElementById("selectMovie");
moviesList.forEach((movie) => {
  const option = document.createElement("option");
  option.value = movie.movieName;
  option.innerText = `${movie.movieName} $${movie.price}`;

  selectMovieDropdown.appendChild(option);
});

movieName.innerText = moviesList[0].movieName;
moviePrice.innerText = `$ ${moviesList[0].price}`;

selectMovieDropdown.addEventListener("change", (e) => {
  const movieDetails = getMovieDetails(e.target.value);
  movieName.innerText = movieDetails.movieName;
  moviePrice.innerText = `$ ${movieDetails.price}`;
});

//Add eventLister to each unoccupied seat
const selectedSeatsHolder = document.getElementById("selectedSeatsHolder");
let selectedSeats = [];
const allSeats = document.querySelectorAll("#seatCont .seat");
const numberOfSeat = document.getElementById("numberOfSeat");
const totalPrice = document.getElementById("totalPrice");

totalPrice.innerText = `$ 0`;

// Set data-seat attribute for each seat
Array.from(allSeats).forEach((seat, idx) => {
  seat.setAttribute("data-seat", idx + 1);
});

// Filter unoccupied seats
const unoccupiedSeats = Array.from(allSeats).filter(
  (seat) => !seat.classList.contains("occupied")
);

const seatClickListener = (e) => {
  const seat = e.target;
  seat.classList.toggle("selected");
  const seatNumber = e.target.getAttribute("data-seat");

  if (seat.classList.contains("selected")) {
    selectedSeats.push(seatNumber);
  } else {
    selectedSeats = selectedSeats.filter((s) => s !== seatNumber);
  }

  // Update the selectedSeatsHolder
  if (selectedSeats.length > 0) {
    selectedSeatsHolder.innerHTML = "";
    selectedSeats.forEach((seat) => {
      const span = document.createElement("span");
      span.style.border = "2px solid lightgreen";
      span.style.color = "lightgreen";
      span.style.padding = "5px";
      span.style.display = "flex";
      span.style.justifyContent = "center";
      span.style.alignItems = "center";
      span.innerText = seat;
      selectedSeatsHolder.appendChild(span);
    });
    numberOfSeat.innerText = selectedSeats.length;

    const pricePerSeat = parseFloat(moviePrice.innerText.split("$")[1]);
    totalPrice.innerText = `$ ${selectedSeats.length * pricePerSeat}`;
  } else {
    selectedSeatsHolder.innerHTML = `<span class="noSelected">No Seat Selected</span>`;
    numberOfSeat.innerText = 0;
    totalPrice.innerText = `$ 0`;
  }

  console.log(selectedSeats);
};

// Add event listener to each unoccupied seat
unoccupiedSeats.forEach((seat) => {
  seat.addEventListener("click", seatClickListener);
});

//Add eventLsiter to continue Button
const proceedBtn = document.getElementById("proceedBtn");
proceedBtn.addEventListener("click", () => {
  if (selectedSeats.length === 0) {
    alert("Oops no seat Selected");
  } else {
    alert(`Yayy! Your Seats have been booked`);
    allSeats.forEach((seat) => {
      if (selectedSeats.includes(seat.getAttribute("data-seat"))) {
        seat.classList.remove("selected");
        seat.classList.add("occupied");
        seat.removeEventListener("click", seatClickListener);
      }
    });
    // Clear selected seats after proceeding
    selectedSeats = [];
    selectedSeatsHolder.innerHTML = `<span class="noSelected">No Seat Selected</span>`;
    numberOfSeat.innerText = 0;
    totalPrice.innerText = `$ 0`;
  }
});

// Add event listener to Cancel Button
const cancelBtn = document.getElementById("cancelBtn");
cancelBtn.addEventListener("click", () => {
  if (selectedSeats.length === 0) {
    alert("no Seat Selected");
  } else {
    // alert("All selected seats will be cleared");
    allSeats.forEach((seat) => {
      if (selectedSeats.includes(seat.getAttribute("data-seat"))) {
        seat.classList.remove("selected");
      }
    });
    // Clear selected seats after canceling
    selectedSeats = [];
    selectedSeatsHolder.innerHTML = `<span class="noSelected">No Seat Selected</span>`;
    numberOfSeat.innerText = 0;
    totalPrice.innerText = `$ 0`;
  }
});
