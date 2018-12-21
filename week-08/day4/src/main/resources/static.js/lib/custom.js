$('textarea').keypress(function(){

    if(this.value.length > 160){
        return false;
    }
    $("#remainingC").html("Remaining characters : " +(160 - this.value.length));
});​