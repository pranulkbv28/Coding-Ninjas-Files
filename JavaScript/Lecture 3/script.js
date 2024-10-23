function isEligible(mathScore, englishScore, scienceScore) {
  let eligibleForAward = false;

  // Calculate total score for Science Fair participation
  let combinedScore = mathScore + englishScore + scienceScore;

  // Scholarship eligibility: check if student scored more than 80 in at least 2 subjects
  let subjectsAbove80 = 0;
  if (mathScore > 80) subjectsAbove80++;
  if (englishScore > 80) subjectsAbove80++;
  if (scienceScore > 80) subjectsAbove80++;

  let eligibleForScholarship = subjectsAbove80 >= 2;

  // Science Fair participation eligibility
  let eligibleForScienceFair = combinedScore >= 250;

  // Award eligibility: eligible for either scholarship or science fair
  if (eligibleForScholarship || eligibleForScienceFair) {
    eligibleForAward = true;
  }

  return eligibleForAward;
}

function calculateAverage(student1Score, student2Score, student3Score) {
  let averageScore = parseFloat(
    (student1Score + student2Score + student3Score) / 3
  );
  //Write your code here

  return averageScore;
}

function temperatureInCelsius(temperatureInCelsius) {
  // Convert Celsius to Fahrenheit
  let temperatureInFahrenheit = (temperatureInCelsius * 9) / 5 + 32;
  console.log(temperatureInFahrenheit);

  // Check if the Fahrenheit temperature is above 86
  let isHot = temperatureInFahrenheit >= 86;

  return isHot;
}

console.log(temperatureInCelsius(30));
