let word = "VENTURES";
let line = "";

for (let i = 0; i < word.length; i++) {
    line += word[i];

    if (line.length === 2 || i === word.length - 1) {
        console.log(line);
        line = "";
    }
}
