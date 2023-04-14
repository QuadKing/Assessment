// Write a function that takes number of age, and then return that age in milliseconds

function convertToMilliseconds(age) {
    let ageInMilliseconds = age * 365 * 24 * 60 * 60 * 1000;
    console.log("Age in milliseconds: " + ageInMilliseconds);
    return ageInMilliseconds;
}

// Get numeric input from command-line arguments
let age = process.argv[2];

convertToMilliseconds(30);
