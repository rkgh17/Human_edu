window.addEventListener("load",
    function(){
        notices = [
            {"id":0,"title":"","content":"","writter":""}
        ];

        let section = document.querySelector("#section1");
        let cloneButton = section.querySelector(".clone-button");
        let inputButton = section.querySelector(".input-button");
        let tempButton = section.querySelector(".temp-button");
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
            let tempNode = section.querySelector("template");
            console.log(tempNode);
            let cloneNode = document.importNode(tempNode.content, true);
            // importNode는 템플릿 복제 역할
            // true이므로 하위모두 복제(td)
            // tbodyNode.appendChild(cloneNode);
            notices[0].id = window.prompt("번호를 입력해주세요.", 0);
            notices[0].title = window.prompt("제목을 적어주세요.", 0);
            notices[0].content = window.prompt("내용을 기입하세요.", 0);
            notices[0].writter = window.prompt("작성자의 이름을 기입하세요.", 0);

            let tdsNode = cloneNode.querySelectorAll("td");
            tdsNode[0].textContent = notices[0].id;
            tdsNode[1].textContent = notices[0].title;
            tdsNode[2].textContent = notices[0].content;
            tdsNode[3].textContent = notices[0].writter;
            tbodyNode.appendChild(cloneNode);
        };

        tempButton.onclick = function(){
            let tempNode = section.querySelector("template");
            console.log(tempNode);
            let cloneNode = document.importNode(tempNode.content, true);
            // importNode는 템플릿 복제 역할
            // true이므로 하위모두 복제(td)
            // tbodyNode.appendChild(cloneNode);

            let tdsNode = cloneNode.querySelectorAll("td");
            tdsNode[0].textContent = notices[0].id;
            tdsNode[1].textContent = notices[0].title;
            tdsNode[2].textContent = notices[0].content;
            tdsNode[3].textContent = notices[0].writter;
            tbodyNode.appendChild(cloneNode);
        };
    }
);