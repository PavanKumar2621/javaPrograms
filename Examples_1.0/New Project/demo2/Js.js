function validateForm() {
    var email = document.getElementById("email").value;
    var mobileNumber = document.getElementById("moblienumber").value;
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirm_password").value;

    var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    var mobilePattern = /^\d{10}$/;

    var emailValid = emailPattern.test(email);
    var mobileValid = mobilePattern.test(mobileNumber);

    if (!emailValid) {
      document.getElementById("email").classList.add("error");
      document.getElementById("email").focus();
      return false;
    }

    if (!mobileValid) {
      document.getElementById("moblienumber").classList.add("error");
      document.getElementById("moblienumber").focus();
      return false;
    }

    if (password !== confirmPassword) {
      document.getElementById("confirm_password").classList.add("error");
      document.getElementById("confirm_password").focus();
      return false;
    }

    return true;
}

  