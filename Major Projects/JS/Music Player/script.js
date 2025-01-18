// all initialisations

// initialising all nodes
const allNodes = document.body.childNodes;

// initialising body
const body = document.body;

// initialising main container
const mainContainer = document.getElementById("mainContainer");

// initialising theme section
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
const songType = document.getElementById("songType");
const songsContainer = document.getElementById("songsContainer");

// initialising song card section
const songCardSection = document.getElementById("songCardSection");
songCardSection.classList.add("section-color-light");

// initialising playlist section
const playlistSection = document.getElementById("playlistSection");
playlistSection.classList.add("section-color-light");
const playlistName = document.getElementById("playlistName");
const createPlaylist = document.getElementById("createPlaylist");
const playlistSongsContainer = document.getElementById(
  "playlistSongsContainer"
);
const playlistSongsContainerHeader = document.getElementById(
  "playlistSongsContainerHeader"
);
const playlistsContainer = document.getElementById("playlistsContainer");

// initialising footer section
const footerSection = document.getElementById("footerSection");

// all songs data
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
    artist: "The Weekend",
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
];

const myPlaylists = [];
let selectedPlaylist = "";

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
  allSongsRender(e.target.value);
});

// all songs render
function allSongsRender(genre) {
  songsContainer.innerHTML = "";
  songType.textContent = `${genre} Songs`;
  if (genre === "All") {
    allSongsData.forEach((song) => {
      const songCard = document.createElement("div");
      songCard.classList.add("song-details-container");
      songCard.innerHTML = `
        <div class="song-details">
          <span class="song-name">${song.name}</span> - <span class="song-artist">${song.artist}</span>
        </div>
      `;
      songCard.addEventListener("click", () => {
        console.log(song);
        songCardRender(song);
      });
      songsContainer.appendChild(songCard);
    });
  } else {
    const filteredSongs = allSongsData.filter((song) => song.genre === genre);
    filteredSongs.forEach((song) => {
      const songCard = document.createElement("div");
      songCard.classList.add("song-details-container");
      songCard.innerHTML = `
            <div class="song-details">
              <span class="song-name">${song.name}</span> - <span class="song-artist">${song.artist}</span>
            </div>
          `;
      songCard.addEventListener("click", () => {
        console.log(song);
        songCardRender(song);
      });
      songsContainer.appendChild(songCard);
    });
  }
}
allSongsRender("All");

// song card render
function songCardRender(song) {
  songCardSection.innerHTML = "";

  // creating elements

  // song card div
  const songCardDiv = document.createElement("div");
  songCardDiv.classList.add("song-card");
  const songImage = document.createElement("img");
  songImage.classList.add("song-image");
  songImage.src = song.songImage;
  const songNamePara = document.createElement("p");
  songNamePara.classList.add("song-name");
  songNamePara.textContent = song.name;
  const songArtistPara = document.createElement("p");
  songArtistPara.classList.add("song-artist");
  songArtistPara.textContent = song.artist;

  // song audio container
  const songAudioContainer = document.createElement("div");
  songAudioContainer.classList.add("song-audio-container");
  const audioController = document.createElement("audio");
  audioController.src = `./assets/${song.artist} - ${song.name}.mp3`;
  console.log(`./assets/${song.artist} - ${song.name}.mp3`);
  audioController.controls = true;

  // song options div
  const songOptionsDiv = document.createElement("div");
  songOptionsDiv.classList.add("song-options");
  // song tracker div
  const songTracker = document.createElement("div");
  songTracker.classList.add("song-tracker");
  const prevSong = document.createElement("button");
  prevSong.textContent = "<=";
  prevSong.addEventListener("click", () => {
    songCardRender(findSong(song.id - 1));
  });
  const nextSong = document.createElement("button");
  nextSong.textContent = "=>";
  nextSong.addEventListener("click", () => {
    songCardRender(findSong(song.id + 1));
  });
  songTracker.append(prevSong, nextSong);
  // playlist options div
  const playlistOptionDiv = document.createElement("div");
  playlistOptionDiv.classList.add("playlist-options");
  const addToplaylistButton = document.createElement("button");
  addToplaylistButton.textContent = "Add to Playlist";
  addToplaylistButton.addEventListener("click", () => {
    if (selectedPlaylist === "") {
      alert("Please select a playlist");
      return;
    }

    const playlist = myPlaylists.filter(
      (playlist) => playlist.name === selectedPlaylist
    );
    playlist[0].songs.push(song);
    renderMessage("Song added to playlist");
    console.log(playlist[0]);
    renderPlaylistSongs(playlist[0]);
    setTimeout(() => {
      removeMessage();
    }, 2000);
  });
  playlistOptionDiv.appendChild(addToplaylistButton);

  // appending the elements

  // song card div
  songCardDiv.appendChild(songImage);
  songCardDiv.appendChild(songNamePara);
  songCardDiv.appendChild(songArtistPara);
  songCardSection.appendChild(songCardDiv);

  // song audio container
  songAudioContainer.appendChild(audioController);
  songCardSection.appendChild(songAudioContainer);

  // song options div
  songOptionsDiv.appendChild(songTracker);
  songOptionsDiv.appendChild(playlistOptionDiv);
  songCardSection.appendChild(songOptionsDiv);
}

// function to get song and card details
function findSong(id) {
  if (id > allSongsData.length || id < 1) {
    return findSong(1);
  }

  const song = allSongsData.filter((song) => song.id === id);
  return song[0];
}

// function add playlist
createPlaylist.addEventListener("click", addPlaylist);

function addPlaylist() {
  const newPlaylist = {
    name: playlistName.value,
    songs: [],
  };

  if (newPlaylist.name === "") {
    alert("Please enter a valid playlist name");
    playlistName.value = "";
    return;
  } else if (
    myPlaylists.some(
      (playlist) =>
        playlist.name.toLowerCase() === newPlaylist.name.toLowerCase()
    )
  ) {
    alert("Playlist name already exists");
    playlistName.value = "";
    return;
  }

  myPlaylists.push(newPlaylist);
  renderPlaylists();

  playlistName.value = "";
}

// function to render playlists
function renderPlaylists() {
  playlistsContainer.innerHTML = "";
  selectedPlaylist = "";
  myPlaylists.forEach((playlist) => {
    const playlistCard = document.createElement("div");
    playlistCard.classList.add("playlist-details");
    playlistCard.innerHTML = `
      <span class="playlist-name">${playlist.name}</span>
    `;
    playlistCard.addEventListener("click", () => {
      const allPlaylists = document.querySelectorAll(".playlist-details");
      allPlaylists.forEach((playlist) => {
        playlist.classList.remove("playlist-active");
      });
      playlistCard.classList.add("playlist-active");
      selectedPlaylist = playlist.name;
      console.log(selectedPlaylist);
      renderPlaylistSongs(playlist);
    });

    playlistsContainer.appendChild(playlistCard);
  });
}

// function to render playlist songs
function renderPlaylistSongs(playlist) {
  playlistSongsContainer.innerHTML = "";
  playlist.songs.forEach((song) => {
    const songCard = document.createElement("div");
    songCard.classList.add("song-details-container");
    songCard.innerHTML = `
        <div class="song-details">
          <span class="song-name">${song.name}</span> - <span class="song-artist">${song.artist}</span>
        </div>
      `;

    // playing song on click
    songCard.addEventListener("click", () => {
      console.log(song);
      songCardRender(song);
    });

    // deleting song from playlist
    songCard.addEventListener("contextmenu", (e) => {
      e.preventDefault();
      const index = playlist.songs.indexOf(song);
      playlist.songs.splice(index, 1);
      renderMessage("Song removed from playlist");
      renderPlaylistSongs(playlist);
      setTimeout(() => {
        removeMessage();
      }, 2000);
    });
    playlistSongsContainer.appendChild(songCard);
  });
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

// render message container
const messageContainer = document.createElement("div");
function renderMessage(message) {
  messageContainer.classList.add("message-container");
  messageContainer.innerHTML = `
    <span>${message}</span>
  `;
  mainContainer.appendChild(messageContainer);
}

// remove message container
function removeMessage() {
  messageContainer.remove();
}
