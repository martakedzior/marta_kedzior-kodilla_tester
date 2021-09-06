
Feature: Is it Divisible?
  Everybody likes divisible numbers

  Scenario Outline: Number is divisible or not
    Given Given number is <number>
    When  I ask is it divisible by 3 0r 5 or both
    Then  I should get <answer>
    Examples:
      | number | answer     |
      | 3      | "Fizz"     |
      | 5      | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 19     | "None"     |
      | 22     | "None"     |
      | 26     | "None"     |