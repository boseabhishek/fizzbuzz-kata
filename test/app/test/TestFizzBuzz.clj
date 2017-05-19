(ns app.test.TestFizzBuzz
  (:use midje.sweet)
  (:use [HelloFizzBuzz]))

(facts "In HelloFizzBuzz"

       (fact "When the start number is 1 and end number is 100, it generates the eblow string"
             (populateFizzBuzz 1 100) => "1 2 \"Fizz\" 4 \"Buzz\" \"Fizz\" 7 8 \"Fizz\" \"Buzz\" 11 \"Fizz\" 13 14 \"FizzBuzz\" 16 17 \"Fizz\" 19 \"Buzz\""))
