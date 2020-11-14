function add() {

        let ism=document.getElementById("ism").value

    axios.post("api/add", {ism:ism})
        .then(function (response) {
            console.log(response)
        })

    window.location.href="/";

}

function getAll() {
    axios.get("api/all")
        .then(function (response) {
            let data=JSON.parse(JSON.stringify(response.data));
            console.log(data);
            let out="";
            for (let i = 0; i <data.length ; i++) {
                out+="<div class=\"row\">\n" +
                    "                <div class=\"col-6 border\">"+data[i].id+"</div>\n" +
                    "                <div class=\"col-6 border\">"+data[i].ism+"</div>\n" +
                    "            </div>"
            }
            document.getElementById("root").innerHTML=out;

        })
}
