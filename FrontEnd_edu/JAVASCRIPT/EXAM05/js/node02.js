window.addEventListener("load", 
    function(){
        let section = document.querySelector("#section1");
        let noticeList = section.querySelector(".notice-list");
        let delButton = section.querySelector(".del-button");
        let swapButton = section.querySelector(".swap-button");
        let tbodyNode = noticeList.querySelector("tbody");

        let allCheckBox = section.querySelector(".overall-checkbox");

        allCheckBox.onchange = function(){
            let inputs=tbodyNode.querySelectorAll("input[type = 'checkbox']");
            // inputs[0]~[2] => 하단의 체크박스 -> tbody
            console.log(inputs);
            for(let i=0;i<inputs.length;i++){
                inputs[i].checked = allCheckBox.checked;
            }
        };

        delButton.onclick = function(){
            let inputs=tbodyNode.querySelectorAll("input[type='checkbox']:checked");
            console.log(inputs);
            for(let i = 0; i<inputs.length;i++){
                inputs[i].parentElement.parentElement.remove();
            }
        };

        swapButton.onclick = function(){
            let inputs=tbodyNode.querySelectorAll("input[type='checkbox']:checked");
            // 체크가 된 input태그
            if(inputs.length !=2){
                alert("2개만 선택해주세요.");
                return;
            }
            let trs=[];
            for(let i = 0; i<inputs.length ; i++){

                trs.push(inputs[i].parentElement.parentElement);
                // // inputs => input 태그
                // // inputs[i].parentElement ==> td태그
                // // inputs[i].parentElement.parentElement ==> tr태그
                // // trs.push함수는 tr태그를 자손까지 모두 카피해서 trs에 반영.

            }
            let cloneNode = trs[0].cloneNode(true);
            trs[1].replaceWith(cloneNode);
            trs[0].replaceWith(trs[1]);
            

        };
        
    }
)