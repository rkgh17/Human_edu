window.addEventListener("load",
    function(){
        let btnPrint = document.getElementById("add");
        btnPrint.onclick = function(){
            let section = document.getElementById("section1");
            let input = section.getElementsByClassName("txt");
            // input[0] : txt1 / input[1] : txt2
            console.log(input);

            let x,y;
            x=parseInt(input[0].value);
            y=parseInt(input[1].value);
            input[3].value = x+y;
            // sum.value = x+y;
        };
    }

);