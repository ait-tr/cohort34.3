const texts = [
	{
		id: 1,
		text: "Значимость этих проблем настолько очевидна, что постоянное информационно-пропагандистское обеспечение нашей деятельности требуют от нас анализа модели развития. С другой стороны постоянное информационно-пропагандистское обеспечение нашей деятельности в значительной степени обуславливает создание дальнейших направлений развития."
	},
	{
		id: 2,
		text: "Идейные соображения высшего порядка, а также дальнейшее развитие различных форм деятельности в значительной степени обуславливает создание системы обучения кадров, соответствует насущным потребностям. Таким образом реализация намеченных плановых заданий позволяет оценить значение существенных финансовых и административных условий."
	},
	{
		id: 3,
		text: "Не следует, однако забывать, что сложившаяся структура организации позволяет выполнять важные задания по разработке системы обучения кадров, соответствует насущным потребностям. Разнообразный и богатый опыт консультация с широким активом способствует подготовки и реализации форм развития. Задача организации, в особенности же консультация с широким активом в значительной степени обуславливает создание форм развития. Задача организации, в особенности же консультация с широким активом обеспечивает широкому кругу (специалистов) участие в формировании соответствующий условий активизации. Повседневная практика показывает, что рамки и место обучения кадров влечет за собой процесс внедрения и модернизации позиций, занимаемых участниками в отношении поставленных задач."
	},
	{
		id: 4,
		text: "Задача организации, в особенности же укрепление и развитие структуры обеспечивает широкому кругу (специалистов) участие в формировании существенных финансовых и административных условий. Товарищи! сложившаяся структура организации в значительной степени обуславливает создание дальнейших направлений развития. Значимость этих проблем настолько очевидна, что начало повседневной работы по формированию позиции способствует подготовки и реализации соответствующий условий активизации. Таким образом укрепление и развитие структуры требуют определения и уточнения направлений прогрессивного развития."
	}
];

let currentPostId = 1;

const btnsNodeList = document.querySelectorAll(".btns button");

texts.forEach(({id, text}) => {
	const container = document.querySelector(".btns");
	const btnNode = document.createElement("button");

    btnNode.addEventListener("click", event => {
        const currentTextNode = document.querySelector(".current_text .text");
        currentTextNode.innerText = text;
    })

	btnNode.innerText = id + " кнопка";
	container.append(btnNode);
})


// const leftTriggerNode = document.querySelector(".triggers .left");
// const rightTriggerNode = document.querySelector(".triggers .right");

const [leftTriggerNode, rightTriggerNode] = document.querySelectorAll(".triggers button");

leftTriggerNode.addEventListener("click", () => {
	// уменьшаем значение currentPostId - номер id поста
	currentPostId--;
	// проверяем, не ушли ли мы из диапазона значений id 
	// если ушли, то в качестве id указываем id последнего поста
	currentPostId = currentPostId < 1? texts.length: currentPostId;
	// находим параграф, в который мы запишем текст поста
	const currentTextNode = document.querySelector(".current_text .text");
	// находим по id нужный пост и текст поста записываем в нужный параграф (currentTextNode)
	currentTextNode.innerText = texts.find(({id}) => id === currentPostId).text;
})

rightTriggerNode.addEventListener("click", () => {
	currentPostId++;
	currentPostId = currentPostId > texts.length? 1: currentPostId;
	const currentTextNode = document.querySelector(".current_text .text");
	currentTextNode.innerText = texts.find(({id}) => id === currentPostId).text;
})