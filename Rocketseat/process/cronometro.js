var time;
const timeInput = () => {
  process.stdout.write("Segundos? ");
  process.stdin.on("data", (data) => {
    time = data.toString().trim();
    process.exit();
  });
  return time;
};

time = timeInput();

const timer = () => {
  console.log(time);
  setInterval(timer, 1000);
};
timer();
