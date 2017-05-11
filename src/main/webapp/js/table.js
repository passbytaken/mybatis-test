var myList = "";
console.log(JSON.stringify(myList));
$.ajax({
    type: 'GET',
    url: 'http://localhost:8080/queryAll',
    data: JSON.stringify(myList),
    contentType: 'application/json',
    dataType: 'json',
    success: function (data) {
        console.log(data);
        if (data === null){
            alert("fail!");
        } else {
            buildHtmlTable(data.result, '#excelDataTable');
        }
    }
});

// Builds the HTML Table out of myList.
function buildHtmlTable(myList, selector) {
    var columns = addAllColumnHeaders(myList, selector);
    var tbody = $('<tbody/>');

    for (var i = 0; i < myList.length; i++) {
        var row$ = $('<tr/>');
        for (var colIndex = 0; colIndex < columns.length; colIndex++) {
            var cellValue = myList[i][columns[colIndex]];
            if (cellValue == null) cellValue = "";
            row$.append($('<td/>').html(cellValue));
        }
        $(tbody).append(row$);
//                $(selector).append(row$);
    }

    $(selector).append(tbody);
}

// Adds a header row to the table and returns the set of columns.
// Need to do union of keys from all records as some records may not contain
// all records.
function addAllColumnHeaders(myList, selector) {
    var columnSet = [];
    var thead = $('<thead/>');
    var headerTr$ = $('<tr/>');

    for (var i = 0; i < myList.length; i++) {
        var rowHash = myList[i];
        for (var key in rowHash) {
            if ($.inArray(key, columnSet) == -1) {
                columnSet.push(key);
                headerTr$.append($('<th/>').html(key));
            }
        }
    }

    $(thead).append(headerTr$);
    $(selector).append(thead);

    return columnSet;
}