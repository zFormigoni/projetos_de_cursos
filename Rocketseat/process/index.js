const questions = [
  "O que eu aprendi hoje?",
  "O que me deixou aborrecido? E o que eu posso fazer para melhorar?",
  "O que me deixou feliz hoje?",
];
const answers = [];

const ask = (index = 0) => {
  process.stdout.write("\n" + questions[index] + " ");
};

process.stdin.on("data", (data) => {
  answers.push(data.toString().trim());
  if (answers.length < questions.length) {
    ask(answers.length);
  } else {
    console.log(answers);
    process.exit();
  }
});

process.on("exit", () => {
  console.log(`Respostas salvas, obrigado`);
  console.log(`Respostas: \n` + answers);
});

ask();
