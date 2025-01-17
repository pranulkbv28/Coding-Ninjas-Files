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
        allNodes.forEach(node => {
            if (node.classList) {
                node.classList.add("text-dark");
            }
        })
        themeSlider.classList.remove("slider-left");
        themeSlider.classList.add("slider-right");
        themeToggle.classList.remove("theme-toggle-light");
        themeToggle.classList.add("theme-toggle-dark");
    } else {
        body.classList.remove("body-dark");
        body.classList.add("body-light");
        allNodes.forEach(node => {
            if (node.classList) {
                node.classList.remove("text-dark");
            }
        })
        themeSlider.classList.remove("slider-right");
        themeSlider.classList.add("slider-left");
        themeToggle.classList.remove("theme-toggle-dark");
        themeToggle.classList.add("theme-toggle-light");
        document.body.style.backgroundColor = rgb(51, 51, 51);
    }
})

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