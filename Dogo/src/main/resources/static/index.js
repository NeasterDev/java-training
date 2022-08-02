$(function() {
    // when the button is clicked the values entered are gathered and inserted
    // into the string that will be the url route.
    $('.add').click(function() {
        var x = $('#x').val() || 0;
        var y = $('#y').val() || 0;
        var url = 'api/math/add/' + x + '/' + y;

        // the get method takes the route and then has a function waiting
        // for the response which will take the data and insert it into the
        // HTML.
        $.get(url, function(data) {
            $('#result').text(data);
        });
    });

    // listener for clicks on the search button
    $('.search').click(function() {
        // variable to hold value the user inputs for the id
        var id = $('#id').val() || 0;
        // api/chat/id call to the server to retrieve data from database
        var url = '/api/chat/' + id;

        // get request for api/chat/id
        $.get(url, function(data) {
            // set the value of the name element to the name data from the database
            $('#name').text(data.name);
            // set the value of the chat element to the content data from the database
            $('#chat').text(data.content);
        });
    });
});