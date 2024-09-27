const express = require('express');
const app = express();
const port = process.env.PORT || 3000;

app.get('/add', (req, res) => {
  const num1 = parseFloat(req.query.num1);
  const num2 = parseFloat(req.query.num2);

  if (isNaN(num1) || isNaN(num2)) {
    res.status(400).send('Invalid input. Please provide two numbers.');
  } else {
    const sum = num1 + num2;
    res.send(`The sum of ${num1} and ${num2} is ${sum}`);
  }
});

app.listen(port, () => {
  console.log(`Server listening on port ${port}`);
});