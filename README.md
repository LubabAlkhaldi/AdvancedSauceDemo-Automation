# 🚀 SauceDemo Automation - Refactored Version

This project is a **refactored and enhanced version** of my initial SauceDemo automation script, built using **Java**, **Selenium WebDriver**, and **TestNG**.  
It improves test organization, simulates more realistic user behavior, and includes validation steps for better reliability.

---

## 🧠 Key Improvements Over the First Version

| Feature           | First Version                          | Refactored Version                      |
|-------------------|-------------------------------------|---------------------------------------|
| Test Structure    | One big test method (`mySecondTest`) | Split into multiple TestNG tests with priorities (`Login`, `AddRandomlyItems`, `Checkout`) |
| Item Selection    | Adds all items to cart               | Adds a random number (2-3) of items using shuffled list for randomness |
| Browser Handling  | Instantiates driver at class level, no window maximize | Opens browser and maximizes in `@BeforeTest` method |
| Feedback & Logs   | No feedback output                   | Console output showing number of items added and checkout success message |
| Validation       | No explicit checkout success check  | Checks for confirmation message after checkout |
| Wait Strategy    | Uses fixed `Thread.sleep` (long waits) | Uses shorter `Thread.sleep` to optimize speed |
| Maintainability  | Monolithic code                      | Modular test methods improving readability and scalability |

---

## 🧪 How It Works

### 1. Login Test
Logs into SauceDemo with the standard user credentials.

### 2. Add Random Items Test
- Finds all "Add to cart" buttons.
- Randomizes their order.
- Adds 2 to 3 items randomly.
- Prints the cart badge count to the console.

### 3. Checkout Test
- Navigates to cart and begins checkout.
- Fills user information.
- Completes the purchase.
- Verifies success by asserting the thank-you message.

---

## 🛠️ Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Microsoft Edge and EdgeDriver

---

## ✨ My Reflection

> Refactoring this project helped me improve the test structure and bring the automation closer to real user behavior.  
> Adding verification steps and better logging makes the tests more robust and maintainable.

---

## 🔗 Connect with Me

- [LinkedIn](https://www.linkedin.com/in/lubab-alkhaldi/)
