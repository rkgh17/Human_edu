window.addEventListener("load",
    function(){
        let btnPrint = document.getElementById("add");
        btnPrint.onclick = function(){
            let section = document.getElementById("section1");
            let input_x = section.querySelector("#txt1");
            let input_y = section.querySelector("#txt2");
            // let input = section.getElementsByClassName("txt");
            console.log(input_x);

            let x,y;
            x=parseInt(input_x.value);
            y=parseInt(input_y.value);
            sum.value = x+y;
        };
    }

);