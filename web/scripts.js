
function consultarInfo() {
    $(document).ready(function() {
        $.post('InfoCampuseroServlet', {
            id: 1
        }, function(responseText) {
            console.log(responseText);
            $('#campusero-info').html(responseText);
        });
    });
    $(document).ready(function() {
        $.post('HistorialEquiposGamerServlet', {
            id: 1
        }, function(responseText) {
            console.log(responseText);
            $('#historial-equipo').html(responseText);
        });
    });
    $(document).ready(function() {
        $.post('InfoEquipoServlet', {
            id: 1
        }, function(responseText) {
            console.log(responseText);
            $('#info-equipo').html(responseText);
        });
    });
    $(document).ready(function() {
        $.post('ListaFabricantesSoftwareServlet', {
            id: 1
        }, function(responseText) {
            console.log(responseText);
            $('#lista-fabricantes').html(responseText);
        });
    });
    $(document).ready(function() {
        $.post('ListaHotelesServlet', {
            id: 1
        }, function(responseText) {
            console.log(responseText);
            $('#lista-software-gamer').html(responseText);
        });
    });
}

consultarInfo();