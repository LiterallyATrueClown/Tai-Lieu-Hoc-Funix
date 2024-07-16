function contact() {
    //name
    if (document.getElementById("name_input").value == "") {
        document.getElementById("name_notification").innerHTML = "Please fill out your name.";
        document.getElementById("name_notification").style.color = "red";
    } else if (document.getElementById("name_input").value.length > 100) {
        document.getElementById("name_notification").innerHTML = "Your name should not exceed 100 characters.";
        document.getElementById("name_notification").style.color = "red";
    } else {
        document.getElementById("name_notification").innerHTML = "";
    }
    //email
    if (document.getElementById("email_input").value == "") {
        document.getElementById("email_notification").innerHTML = "Please fill out your name.";
        document.getElementById("email_notification").style.color = "red";
    } else {
        document.getElementById("email_notification").innerHTML = "";
    }
    //subject
    if (document.getElementById("subject_input").value.length > 30) {
        document.getElementById("subject_notification").innerHTML = "Message should not exceed 30 characters.";
        document.getElementById("subject_notification").style.color = "red";
    } else if (document.getElementById("subject_input").value == "") {
        document.getElementById("subject_notification").innerHTML = "Please fill out the subject.";
        document.getElementById("subject_notification").style.color = "red";
    } else {
        document.getElementById("subject_notification").innerHTML = "";
    }
    //message
    if (document.getElementById("messenge_input").value == "") {
        document.getElementById("messenge_notification").innerHTML = "Please fill out the messenge.";
        document.getElementById("messenge_notification").style.color = "red";
    } else if (document.getElementById("messenge_input").value.length > 500) {
        document.getElementById("messenge_notification").innerHTML = "Message should not exceed 500 characters.";
        document.getElementById("messenge_notification").style.color = "red";
    } else {
        document.getElementById("messenge_notification").innerHTML = "";
    }
}
