const url = 'https://api.github.com/users/zFormigoni';

function getUser() {
    fetch(url)
        .then((response) => response.json())
        .then((data) => console.log(data))
        .then((data) => (Render.textContent = data))
        .catch((e) => console.error(e));
}

getUser();
