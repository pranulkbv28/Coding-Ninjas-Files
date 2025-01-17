const mainContainer = document.getElementById("mainContainer");
const themeSection = document.getElementById("themeSection");
const bodySection = document.getElementById("bodySection");
const allSongsSection = document.getElementById("allSongsSection");
const songCardSection = document.getElementById("songCardSection");
const playlistSection = document.getElementById("playlistSection");
const footerSection = document.getElementById("footerSection");

const currDate = new Date();
const year = currDate.getFullYear()
footerSection.innerHTML = `
    <span>
        Made with ❤️ by pranulkbv28
    </span>
    <span>
        © ${year}
    </span>
`