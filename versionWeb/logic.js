//Logica para leer y tratar el CSV
  
(function () {
    var delimiter = ','; // Asegurar que esté bien escrito
    var newline = '\n';
    var file = document.getElementById('file');
    var bTable = document.getElementById('basicTable');
    var pTable = document.getElementById('polishedTable');

    if (!file) return;

    file.addEventListener('change', function () {
        if (file.files && file.files.length > 0) {
            parseCSV(file.files[0]);
        }
    });

    function parseCSV(file) {
        if (!file || !FileReader) return;

        var reader = new FileReader();

        reader.onload = function (e) {
            toTable(e.target.result);
        };

        reader.readAsText(file);
    }

    function toTable(text) {
        if (!text || !bTable || !pTable) return;

        // Limpiar las tablas antes de insertar nuevos datos
        bTable.innerHTML = "";
        pTable.innerHTML = "";

        var rows = text.split(newline).map(row => row.trim()).filter(row => row);
        if (rows.length === 0) return;

        var headers = rows.shift().split(delimiter).map(h => h.trim());
        var headerRow = document.createElement('tr');

        headers.forEach(function (h) {
            if (!h) return;
            var th = document.createElement('th');
            th.textContent = h;
            headerRow.appendChild(th);
        });

        bTable.appendChild(headerRow);
        pTable.appendChild(headerRow.cloneNode(true)); // También añadir encabezados a pTable

        rows.forEach(function (row) {
            var cols = row.split(delimiter).map(c => c.trim());
            if (cols.length === 0) return;

            var rtr = document.createElement('tr');
            cols.forEach(function (c) {
                var td = document.createElement('td');
                td.textContent = c;
                rtr.appendChild(td);
            });

            bTable.appendChild(rtr);
            pTable.appendChild(rtr.cloneNode(true)); // También llenar pTable
        });
    }
})();


//Inicializamos la pagina cocmo si hubieran selecccionado cargar datos
document.getElementById("content").innerHTML = cargarDatos.innerHTML;

//Agregamos los event Listeners que nos permiten cambiar entre las opciones del menú
document.querySelectorAll(".menuOptions").forEach(button => {
    button.addEventListener("click", function() {
        const plantilla = document.getElementById(this.getAttribute("data-content"));
        document.getElementById("content").innerHTML = plantilla.innerHTML;
    });

    button.addEventListener("click", function() {
        document.querySelectorAll(".menuOptions").forEach(b => {
            b.classList.remove("active")
        });
        this.classList.add("active");
    });
});