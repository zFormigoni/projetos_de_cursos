const express = require("express");
const app = express();

const itens = [
  {
    tittle: "V",
    message: "Algo com V",
  },
  {
    tittle: "I",
    message: "Algo com I",
  },
  {
    tittle: "T",
    message: "Algo com T",
  },
  {
    tittle: "O",
    message: "Algo com O",
  },
  {
    tittle: "R",
    message: "Algo com R",
  },
];

const subtitle = "usando o node com express";

app.set("view engine", "ejs");

app.get("/", (req, res) => {
  res.render("pages/index", { qualitys: itens, subtitle: subtitle });
});

app.get("/sobre", (req, res) => {
  res.render("pages/about");
});

app.listen(8080);
console.log("rodando");
