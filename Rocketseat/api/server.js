const express = require("express");
const axios = require("axios");

const app = express();

app.listen(3000);
app.use(express.json());
/* let author = "vitor";

app.route("/").get((req, res) => {
  res.send("<h1>vitor</h1>");
});

app.route("/post").post(async (req, res) => {
  res.send(req.body);

  console.log(req.body);
});

app.route("/getput").get((req, res) => {
  res.send(author);
});

app.route("/put").put((req, res) => {
  author = req.body;
  res.send(author);
  console.log(author);
});

app.route("/delete").delete((req, res) => {
  res.send(`Apagado: ${author}`);
  author = "";
});
 */

app.route("/").get((req, res) => {
  axios
    .get("https://api.github.com/users/zFormigoni")
    .then((result) => res.send(`<img src=${result.data.avatar_url}>`))
    .catch((e) => console.log(e));
});
