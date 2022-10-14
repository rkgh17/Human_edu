window.addEventListener("load",
    function(){
        let section = document.querySelector("#section1");
        let titleInput = section.querySelector(".title-input");
        let addButton = section.querySelector(".add-input");
        let delButton = section.querySelector(".del-input");
        let menuList = section.querySelector(".menu-list");

        addButton.onclick = function(){
            let txtNode = document.createTextNode(titleInput.value);
            let liNode = document.createElement("li");
            // li태그를 만들어서 linode변수에 추가

            liNode.appendChild(txtNode);
            menuList.appendChild(liNode);
        };
        delButton.onclick = function(){
            let liNode = menuList.children[0];
            menuList.removeChild(liNode);
        }
    }
);