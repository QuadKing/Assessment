const readline = require('readline');

const correctNumber = Math.floor(Math.random() * 31) + 1;
let isCorrect = false;

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
function promptGuess() {
    rl.question("Guess the number between 1 and 31: ", (guess) => {
        guess = parseInt(guess);
        if (guess === correctNumber) {
            console.log("Correct Guess");
            rl.close();
        } else {
            console.log("Incorrect Guess");
            promptGuess();
        }
    });
}

// Start the game by prompting for the first guess
promptGuess();
