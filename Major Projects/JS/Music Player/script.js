const allNodes = document.body.childNodes;
const body = document.body;
const mainContainer = document.getElementById("mainContainer");
const themeSection = document.getElementById("themeSection");

const themeToggle = document.getElementById("themeToggle");
const themeSlider = document.getElementById("slider");
themeSlider.addEventListener("click", () => {
  if (themeSlider.classList.contains("slider-left")) {
    body.classList.remove("body-light");
    body.classList.add("body-dark");
    allNodes.forEach((node) => {
      if (node.classList) {
        node.classList.add("text-dark");
      }
    });
    themeSlider.classList.remove("slider-left");
    themeSlider.classList.add("slider-right");
    themeToggle.classList.remove("theme-toggle-light");
    themeToggle.classList.add("theme-toggle-dark");
    allSongsSection.classList.remove("section-color-light");
    allSongsSection.classList.add("section-color-dark");
    songCardSection.classList.remove("section-color-light");
    songCardSection.classList.add("section-color-dark");
    playlistSection.classList.remove("section-color-light");
    playlistSection.classList.add("section-color-dark");
  } else {
    body.classList.remove("body-dark");
    body.classList.add("body-light");
    allNodes.forEach((node) => {
      if (node.classList) {
        node.classList.remove("text-dark");
      }
    });
    themeSlider.classList.remove("slider-right");
    themeSlider.classList.add("slider-left");
    themeToggle.classList.remove("theme-toggle-dark");
    themeToggle.classList.add("theme-toggle-light");
    // document.body.style.backgroundColor = rgb(51, 51, 51);
    allSongsSection.classList.remove("section-color-dark");
    allSongsSection.classList.add("section-color-light");
    songCardSection.classList.remove("section-color-dark");
    songCardSection.classList.add("section-color-light");
    playlistSection.classList.remove("section-color-dark");
    playlistSection.classList.add("section-color-light");
  }
});

// initialising body section
const bodySection = document.getElementById("bodySection");

// initialising all songs section
const allSongsSection = document.getElementById("allSongsSection");
allSongsSection.classList.add("section-color-light");
const filterByGenreSection = document.getElementById("filterBy");
const songsContainer = document.getElementById("songsContainer");

// initialising song card section
const songCardSection = document.getElementById("songCardSection");
songCardSection.classList.add("section-color-light");

// initialising playlist section
const playlistSection = document.getElementById("playlistSection");
playlistSection.classList.add("section-color-light");
const footerSection = document.getElementById("footerSection");

const allSongsData = [
  {
    id: 1,
    name: "Bad Guy",
    genre: "Pop",
    artist: "Billie Eilish",
    duration: "3:14",
    releaseYear: 2019,
    album: "When We All Fall Asleep, Where Do We Go?",
    songImage:
      "https://www.billboard.com/wp-content/uploads/media/Billie-Eilish-Bad-Guy-screenshot-2019-billboard-1500.jpg",
  },
  {
    id: 2,
    name: "Rockstar",
    genre: "Hip-Hop",
    artist: "DaBaby",
    duration: "3:01",
    releaseYear: 2020,
    album: "Blame It on Baby",
    songImage:
      "https://crazyhood.com/wp-content/uploads/2020/06/da-baby-roddy-ricch-rockstar.jpg",
  },
  {
    id: 3,
    name: "Blinding Lights",
    genre: "Pop",
    artist: "The Weeknd",
    duration: "3:20",
    releaseYear: 2019,
    album: "After Hours",
    songImage:
      "https://i1.sndcdn.com/artworks-Eke4dWZTIrXCkXPW-hX2ihg-t500x500.jpg",
  },
  {
    id: 4,
    name: "Shape of You",
    genre: "Pop",
    artist: "Ed Sheeran",
    duration: "3:53",
    releaseYear: 2017,
    album: "Divide",
    songImage:
      "https://upload.wikimedia.org/wikipedia/en/b/b4/Shape_Of_You_%28Official_Single_Cover%29_by_Ed_Sheeran.png",
  },
  {
    id: 5,
    name: "God's Plan",
    genre: "Hip-Hop",
    artist: "Drake",
    duration: "3:19",
    releaseYear: 2018,
    album: "Scorpion",
    songImage: "https://i.ytimg.com/vi/ScfgOVJiu_I/maxresdefault.jpg",
  },
  {
    id: 6,
    name: "Smells Like Teen Spirit",
    genre: "Rock",
    artist: "Nirvana",
    duration: "5:01",
    releaseYear: 1991,
    album: "Nevermind",
    songImage:
      "https://upload.wikimedia.org/wikipedia/en/3/3c/Smells_Like_Teen_Spirit.jpg",
  },
  {
    id: 7,
    name: "Levitating",
    genre: "Pop",
    artist: "Dua Lipa",
    duration: "3:23",
    releaseYear: 2020,
    album: "Future Nostalgia",
    songImage:
      "https://i1.sndcdn.com/artworks-hSYY3M1z3IiDRrFK-7vTNMA-t500x500.jpg",
  },
  {
    id: 8,
    name: "Bohemian Rhapsody",
    genre: "Rock",
    artist: "Queen",
    duration: "5:55",
    releaseYear: 1975,
    album: "A Night at the Opera",
    songImage:
      "https://m.media-amazon.com/images/M/MV5BMTA2NDc3Njg5NDVeQTJeQWpwZ15BbWU4MDc1NDcxNTUz._V1_.jpg",
  },
  {
    id: 9,
    name: "Stairway to Heaven",
    genre: "Rock",
    artist: "Led Zeppelin",
    duration: "8:02",
    releaseYear: 1971,
    album: "Led Zeppelin IV",
    songImage:
      "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqben79h3kCCNh7MZRmggCsv536EVyghEHUA&s",
  },
  {
    id: 10,
    name: "Humble",
    genre: "Hip-Hop",
    artist: "Kendrick Lamar",
    duration: "2:57",
    releaseYear: 2017,
    album: "DAMN.",
    songImage:
      "https://m.media-amazon.com/images/M/MV5BOTUwNzRiNDAtN2E2ZC00ZTk1LWE1OGYtZGU3YjliYTA0NjdhXkEyXkFqcGc@._V1_.jpg",
  },
  {
    id: 11,
    name: "Hotel California",
    genre: "Rock",
    artist: "Eagles",
    duration: "6:30",
    releaseYear: 1976,
    album: "Hotel California",
    songImage:
      "https://images.genius.com/6c7e025561819a4af1476af223c1a7f8.600x600x1.jpg",
  },
  {
    id: 12,
    name: "Sicko Mode",
    genre: "Hip-Hop",
    artist: "Travis Scott",
    duration: "5:12",
    releaseYear: 2018,
    album: "Astroworld",
    songImage:
      "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJie8EXL-PdF-iSuLuvemNmb7s2__RZmWYbA&s",
  },
];

// select options render
let allGenreArray = allSongsData.map((song) => song.genre);
// const genreArray = []
// while (allGenreArray.length > 0) {
//   const genre = allGenreArray.pop();
//   if (!genreArray.includes(genre)) {
//     genreArray.push(genre);
//   }
// }
const genreArray = [...new Set(allGenreArray)];
// console.log(genreArray);
genreArray.forEach((genre) => {
  const option = document.createElement("option");
  option.value = genre;
  option.textContent = genre;
  filterByGenreSection.appendChild(option);
});

// filter by genre
filterByGenreSection.addEventListener("change", (e) => {
  // console.log(e.target.value);
  allSongsRender(e.target.value);
});

// all songs render
function allSongsRender(genre) {
  songsContainer.innerHTML = "";
  if (genre === "All") {
    allSongsData.forEach((song) => {
      const songCard = document.createElement("div");
      songCard.classList.add("song-card");
      songCard.innerHTML = `
        <div class="song-details">
          <span class="song-name">${song.name}</span> - <span class="song-artist">${song.artist}</span>
        </div>
      `;
      songCard.addEventListener("click", () => {
        console.log(song.name);
      });
      songsContainer.appendChild(songCard);
      // <img class="song-section-image" src="${song.songImage}" alt="${song.name}" />
    });
  } else {
    const filteredSongs = allSongsData.filter((song) => song.genre === genre);
    filteredSongs.forEach((song) => {
      const songCard = document.createElement("div");
      songCard.classList.add("song-card");
      songCard.innerHTML = `
            <div class="song-details">
              <span class="song-name">${song.name}</span> - <span class="song-artist">${song.artist}</span>
            </div>
          `;
      songsContainer.appendChild(songCard);
      // <p>${song.genre}</p>
      // <p>${song.releaseYear}</p>
      // <p>${song.album}</p>
      // <img class="song-section-image" src="${song.songImage}" alt="${song.name}" />
    });
  }
}
allSongsRender("All");

// song card render

// function to get song and card details
function findSong(id) {
  if (id > allSongsData.length || id < 1) {
    return findSong(1);
  }

  const song = allSongsData.filter((song) => song.id === id);
  return song[0];
}

// footer render
const currDate = new Date();
const year = currDate.getFullYear();
footerSection.innerHTML = `
    <span>
        Made with ❤️ by pranulkbv28
    </span>
    <span>
        © ${year}
    </span>
`;
