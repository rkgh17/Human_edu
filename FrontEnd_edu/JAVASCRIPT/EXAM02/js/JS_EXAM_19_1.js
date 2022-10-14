// window.onload = function (){
window.addEventListener("load", 
    function(){
        let btnPrint = document.getElementById("btnInput");
        btnPrint.onclick = function(){
            let x;
            let y;
            x=eval(prompt('x값입력 : ',0));
            y=eval(prompt('y값입력 : ',0));
            btnInput.value=x+y;
        };
    }
);