$.fn.serializeObject = function () {
    var o = {};
    var a = this.serializeArray();
    $.each(a, function () {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};

function add() {
    value = "";
    if($.trim($('#name').val()) === '') {
        alert('不能为空');
        return
    };


    var formData = $("#form1").serializeObject();
    console.log(JSON.stringify(formData));
    $.ajax({
        type: 'POST',
        url: 'http://localhost:8080/create',
        data: JSON.stringify(formData),
        contentType: 'application/json',
        dataType: 'json',
        success: function (data) {
            if (data = null){
                alert("fail!");
            }
            else alert("Success!");

        }
    });

}