//Take a sentence as an input and reverse every word in that sentence. 
//Example - This is a sunny day > shiT si a ynnus yad.
function reverseWordsInSentence(sentence) {
    const words = sentence.split(" ");
    const reversedWords = words.map(word => reverseWord(word));
    const reversedSentence = reversedWords.join(" ");
    return reversedSentence;
  }
  function reverseWord(word) {
    return word.split("").reverse().join("");
  }
  const inputSentence = "This is a sunny day in JavaScript";
  const reversedSentence = reverseWordsInSentence(inputSentence);
  console.log("Reversed Sentence: " + reversedSentence);