function order() {
if (document.getElementById("dropdown_content1").value == "--Select Cake--") {
    document.getElementById("dropdown_notification").innerHTML = "Please select our product.";
    document.getElementById("dropdown_notification").style.color = "red";
}else {
    document.getElementById("dropdown_notification").innerHTML = ""
}
if (document.getElementById("name_input").value == "") {
    document.getElementById("name_notification").innerHTML = "Please fill out your name.";
    document.getElementById("name_notification").style.color = "red"
} else if (document.getElementById("name_input").value.length > 100) {
    document.getElementById("name_notification").innerHTML = "Your name should not exceed 100 characters.";
    document.getElementById("name_notification").style.color = "red";
} else {;
    document.getElementById("name_notification").innerHTML = "";
};
if (document.getElementById("messenge_input").value.length > 30) {;
    document.getElementById("messenge_notification").innerHTML = "Message should not exceed 30 characters.";
    document.getElementById("messenge_notification").style.color = "red";
} else {;
    document.getElementById("messenge_notification").innerHTML = "";
};
if (document.getElementById("delto_input").value.length > 500) {;
    document.getElementById("delto_notification").innerHTML = "Address should not exceed 500 characters.";
    document.getElementById("delto_notification").style.color = "red";
} else if (document.getElementById("delto_input").value == "") {;
        document.getElementById("delto_notification").innerHTML = "Please fill out the address.";
        document.getElementById("delto_notification").style.color = "red";
} else {;
    document.getElementById("delto_notification").innerHTML = "";
};
if (document.getElementById("date_input").value == "") {;
    document.getElementById("date_notification").innerHTML = "Please fill out the deliver date.";
    document.getElementById("date_notification").style.color = "red";
}else {
    document.getElementById("date_notification").innerHTML = "";
}
}