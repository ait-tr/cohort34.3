const words = [
    "стол",
    "стул",
    "шкаф",
    "диван",
    "холодильник",
    "ковер"
];

const links = [
    {link: "https://google.com", label: "google"},
    {link: "https://www.sap.com/", label: "sap"},
    {link: "https://kpmg.com/xx/en/home.html", label: "KPMG"},
    {link: "https://www.epam.com/", label: "epam"}
];

const root = document.querySelector("#root");

function getLinksBlock(array){
    const container = document.createElement("div");
    array.forEach(({link, label}) => {
        const linkNode = document.createElement("a");
        linkNode.innerText = label;
        linkNode.href = link;
        container.append(linkNode);
    })
    return container;
}

root.append(getLinksBlock(links));


function getList(array){
    const olNode = document.createElement("ol");
    array.forEach(word => {
        const liElem = document.createElement("li");
        liElem.innerText = word;
        olNode.append(liElem);
    })
    return olNode;
}

// root.append(getList(words));