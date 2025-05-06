console.log("Hello from JavaScript!");
console.log("Language: JavaScript");

let num1 = 7;
let num2 = 4;
console.log("Product:", num1 * num2);

let msg = "Message from JavaScript";
console.log("Sending to TypeScript: " + msg);

const { exec } = require("child_process");

function callNext() {
    exec("start app.ts", (err) => {
        if (err) {
            console.error("Failed to launch TypeScript.");
        }
    });
}

callNext();
