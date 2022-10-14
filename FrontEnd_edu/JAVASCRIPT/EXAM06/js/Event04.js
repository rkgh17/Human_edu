window.addEventListener("load", function(){
    let section = document.querySelector("#section1");
    let container = section.querySelector(".container");
    let box = section.querySelector(".box");

    container.onclick = function(e){
        console.log("x,y : " + e.x,e.y);
        console.log("client : " + e.clientX, e.clientY);
        console.log("page : " + e.pageX, e.pageY);
        console.log("offset : " + e.offsetX,e.offsetY);
        //클릭한 점의 포인트

        box.style.position="absolute";
        // absolute는 절대위치

        // box.style.left = e.x + "px";
        // box.style.top = e.y + "px";
        box.style.left = e.pageX + "px";
        box.style.top = e.pageY + "px";
    };
}
);