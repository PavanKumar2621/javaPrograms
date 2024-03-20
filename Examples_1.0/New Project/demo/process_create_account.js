// Retrieve the form data from the HTML form
const formData = new FormData(document.querySelector('form'));

// Send a POST request to the PHP script to create the account
fetch('process_create_account.php', {
  method: 'POST',
  body: formData
})
.then(response => response.text())
.then(data => {
  // Display a success or error message based on the response from the server
  if (data === 'success') {
    alert('Account created successfully');
  } else {
    alert('Error creating account: ' + data);
  }
})
.catch(error => {
  // Display an error message if the request failed
  alert('An error occurred: ' + error.message);
});
