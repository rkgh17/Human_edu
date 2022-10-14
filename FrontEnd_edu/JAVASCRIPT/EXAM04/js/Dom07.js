window.addEventListener("load",
    function(){
        notices = [
            {"id":5,"title":"가입인사2","content":"안녕하세요1","writter":"황인성"},
            {"id":6,"title":"가입인사3","content":"안녕하세요2","writter":"황혜린"}
        ];

        let section = document.querySelector("#section1");
        let cloneButton = section.querySelector(".clone-button");
        let inputButton = section.querySelector(".input-button");
        let noticeList = section.querySelector(".notice-list");
        let tbodyNode = section.querySelector("tbody");

        cloneButton.onclick = function(){
            let trNode = noticeList.querySelector("tbody tr");
            // tbody tr 을 포함하는 자손 모두 가져옴.
            let cloneNode = trNode.cloneNode(true);
            // cloneNode(true)면 자손 모두 카피(tr 이하 모두 카피)
            // false이면 tr만 카피.(td는 생략)

            tbodyNode.appendChild(cloneNode);
        };

        inputButton.onclick = function(){
            let trNode = noticeList.querySelector("tbody tr");
            let cloneNode1 = trNode.cloneNode(true);
            // let cloneNode2 = trNode.cloneNode(true);
            tbodyNode.appendChild(cloneNode1);
            // tbodyNode.appendChild(cloneNode2);
            
            let tdsNode1 = cloneNode1.querySelectorAll("td");
            // let tdsNode2 = cloneNode2.querySelectorAll("td");

            tdsNode1[0].textContent = notices[0].id;
            tdsNode1[1].textContent = notices[0].title;
            tdsNode1[2].textContent = notices[0].content;
            tdsNode1[3].textContent = notices[0].writter;

            // tdsNode2[0].textContent = notices[1].id;
            // tdsNode2[1].textContent = notices[1].title;
            // tdsNode3[2].textContent = notices[1].content;
            // tdsNode2[3].textContent = notices[1].writter;
        };
    }
);