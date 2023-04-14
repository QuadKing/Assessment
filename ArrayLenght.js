function getStringLengths(inputArray) {
    return inputArray.map(str => str.length);
}
// Input array of strings
const inputArray = ["Regnos", "Semicolon.Africa", "Javascript", "WorkOut"];
// Call the function and store the result in a variable
const lengths = getStringLengths(inputArray);

// Output the result
console.log(lengths);
