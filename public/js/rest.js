function _ajax_request(url, data, callback, type, method) {
    // shift arguments if data argument was omitted
    if ( jQuery.isFunction( data ) ) {
        type = type || callback;
        callback = data;
        data = {};
    }
    if (!data) {
        data = {};
    }
    // i need it to be contentType: "application/x-www-form-urlencoded"
    // need to edit its body to have _method = method...
    return jQuery.ajax({
        url: url,
        type: method,
        dataType: type,
        data: data,
        success: callback
    });
};
jQuery.extend({
    put: function(url, data, callback, type) {
        return _ajax_request(url, data, callback, type, "put");
    },
    patch: function(url, data, callback, type) {
        return _ajax_request(url, data, callback, type, "patch");
    },
    delete: function(url, data, callback, type) {
        return _ajax_request(url, data, callback, type, "delete");
    }
});

$(document).ready(function() {
    $('body').on('submit', 'form#book', function() {
        var method = $(this).find('#method').val();
        var title = $(this).find('#title').val();
        var url = '/books/'+title;
        if (method === 'get') {
            $.get(url, function() { console.log("Successfully got text"); });
        } else if (method === 'delete') {
            $.delete(url, function() {
                console.log("Delete success!");
            });
        } else if (method === 'put') {
            $.put(url, function () {
                console.log("put success");
            });
        } else {
            console.log("Error: unknown request '"+method+"'");
        }
        return false;
    });
});
