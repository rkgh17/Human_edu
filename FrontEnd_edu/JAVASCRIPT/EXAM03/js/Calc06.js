window.addEventListener("load",
    function(){
        let btnPrint = document.getElementById("add");
        btnPrint.onclick = function(){
            let section = document.getElementById("section1");
            let input_x = section.querySelector("input[name='txt1']");
            let input_y = section.querySelector("input[name='txt2']");

            let x,y;
            x=parseInt(input_x.value);
            y=parseInt(input_y.value);
            sum.value = x+y;
        };
    }

);