# 🚀 Advanced SauceDemo Automation

This is an **advanced automation project** for [SauceDemo](https://www.saucedemo.com/) using **Java**, **Selenium WebDriver**, and **TestNG**.  
It simulates a complete user journey: login, adding random items to cart, and finishing checkout — all structured and scalable.

---

## 🧠 What’s Special About This Project?

This is a **refactored and improved version** of a previous basic script I wrote for SauceDemo.  
Here’s a quick comparison:

| Feature | Old Version | This Version |
|--------|-------------|--------------|
| Test Structure | Simple script | Organized with TestNG |
| Item Selection | Fixed | Random using `shuffle()` |
| Feedback | No console messages | Console prints + badge count |
| Realism | Static scenario | Dynamic + user-like behavior |
| Scalability | Hard to expand | Easy to scale & maintain |

---

## 🧪 What the Code Does

The test is divided into **three main steps**:

### 1. `Login()`
Logs in using the provided `standard_user` credentials.

### 2. `AddRandomlyItems()`
- Collects all "Add to cart" buttons.
- Shuffles them randomly.
- Adds 2 to 3 items randomly to cart.
- Prints how many items were added using the cart badge.

### 3. `Checkout()`
- Opens the cart.
- Fills in user info.
- Confirms the checkout.
- Validates success by checking for the thank-you message.

---

## 🛠️ Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Microsoft Edge + EdgeDriver

---

## ✨ Author Note

> I created this project as part of my QA learning journey.  
> Every improvement I make helps me understand real-world automation better.  
> It started simple, but I’m proud of how it’s growing 🌱

---

## 🔗 Let’s Connect

- [LinkedIn](https://www.linkedin.com/in/lubab-alkhaldi/)
