// Selecting form and inputs
const form = document.querySelector("#login-form");
const emailInput = document.querySelector("#email");
const usernameInput = document.querySelector("#username");
const mobileInput = document.querySelector("#mobile");
const passwordInput = document.querySelector("#password");
const confirmPasswordInput = document.querySelector("#confirm-password");

// Selecting error message elements
const emailError = document.querySelector("#email-error");
const usernameError = document.querySelector("#username-error");
const mobileError = document.querySelector("#mobile-error");
const passwordError = document.querySelector("#password-error");
const confirmPasswordError = document.querySelector("#confirm-password-error");

// Validation functions
function validateEmail(email) {
  const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  return re.test(String(email).toLowerCase());
}

function validateMobile(mobile) {
  const re = /^[0-9]{10}$/;
  return re.test(mobile);
}

function validatePassword(password) {
  const re = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{8,}$/;
  return re.test(password);
}

// Form submission function
function submitForm() {
  if (
    validateEmail(emailInput.value) &&
    usernameInput.value.trim() !== "" &&
    validateMobile(mobileInput.value) &&
    validatePassword(passwordInput.value) &&
    passwordInput.value === confirmPasswordInput.value
  ) {
    // Submit the form
    alert("Form submitted successfully!");
    form.reset();
  } else {
    // Show error messages
    if (!validateEmail(emailInput.value)) {
      emailError.textContent = "Please enter a valid email address.";
    } else {
      emailError.textContent = "";
    }

    if (usernameInput.value.trim() === "") {
      usernameError.textContent = "Please enter a username.";
    } else {
      usernameError.textContent = "";
    }

    if (!validateMobile(mobileInput.value)) {
      mobileError.textContent = "Please enter a valid mobile number.";
    } else {
      mobileError.textContent = "";
    }

    if (!validatePassword(passwordInput.value)) {
      passwordError.textContent =
        "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one number.";
    } else {
      passwordError.textContent = "";
    }

    if (passwordInput.value !== confirmPasswordInput.value) {
      confirmPasswordError.textContent = "Passwords do not match.";
    } else {
      confirmPasswordError.textContent = "";
    }
  }
}

// Event listener for form submission
form.addEventListener("submit", (event) => {
  event.preventDefault();
  submitForm();
});
