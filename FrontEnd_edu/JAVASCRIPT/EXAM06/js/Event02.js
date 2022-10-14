window.addEventListener("load", function(){
    let section = document.querySelector("#section1");
    let imgList = section.querySelector(".img-list");
    let imgs = section.querySelectorAll(".imgs");
    let currentImg = section.querySelector(".current-img");

    imgList.onclick=function(e){
        // 버블링
        // 상위태그 이벤트를 통해서 처리 가능
        // if(e.target.className == "imgs"){
        //     currentImg.src = e.target.src;
        // }
        // 똑같은 결과
        if(e.target.tagName == "IMG"){
                currentImg.src = e.target.src;
            }
        
    };
}
);