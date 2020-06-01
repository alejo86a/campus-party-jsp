
function consultarInfo() {
    $(document).ready(function() {
        $.post('InfoCampuseroServlet', {
            id: 1
        }, function(responseText) {
            console.log(responseText);
            $('#campusero-info').html(responseText);
        });
    });
}

consultarInfo();