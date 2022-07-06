Feature:  Login and place order
  This will give the user the ability to login on demo blaze  website and place an order

  Scenario Outline: A user login on  demo blaze website and place an order
    Given a user is on the demo blaze website
    When a user clicks on login button link text
    When a user enters username as "<Username>" and password as "<Password>"
    And a user clicks on login button
    When a user selects Samsung galaxy s6
    When a user clicks on Add to cart button
    And a user clicks on Cart button
    When a user clicks on Place Order button
    When a user enters name as "<Name>"
    And a user enters country as "<Country>"
    And a user enters my city as "<City>"
    And a user enters credit card as "<Credit card>"
    And a user enters month as "<Month>"
    And a user enters year as "<Year>"
    And a user clicks on purchase button
    Then a user should see get the purchase id




    Examples:
      |Username|Password| Name   | Country              | City     | Credit card | Month   | Year |
      |admin   |admin   | Zintle | South Africa         |Cape Town | 242422424   | January | 2022 |
      |admin   |admin   | Promise| United Arab Emirates |Dubai     | 232323232   | March   | 2022 |
      |admin   |admin   | Lonwabo| Mexico               |San Diego | 252525252   |April    |2022  |