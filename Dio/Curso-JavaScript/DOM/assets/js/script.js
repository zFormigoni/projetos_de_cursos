const changeBtn = document.getElementById('mode-selector');
const pageTitle = document.getElementById('page-title');
const body = document.getElementsByTagName('body')[0];
const footer = document.getElementsByTagName('footer')[0];

const darkModeClass = 'Dark';


function changeTheme(){
    changeClass();
    changeText();
}

function changeClass(){
    changeBtn.classList.toggle(darkModeClass);
    pageTitle.classList.toggle(darkModeClass);
    body.classList.toggle(darkModeClass);
    footer.classList.toggle(darkModeClass);
}

function changeText(){
    const dark  = 'Dark Mode';
    const light = 'Light Mode';

    if (body.classList.contains(darkModeClass)){
        changeBtn.innerHTML = light;
        pageTitle.innerHTML = dark;
        return;
    }
    if (!body.classList.contains(darkModeClass)){
        changeBtn.innerHTML = dark;
        pageTitle.innerHTML = light;
        return;
    }
}





changeBtn.addEventListener('click', changeTheme);
