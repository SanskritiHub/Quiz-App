package com.example.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Questions>{

        val questionList = ArrayList<Questions>()
        val ques1 = Questions(

            1, "What country does this flag belong to?",
            R.drawable.brazil,
            "China",
            "Argentina",
            "Brazil",
            "UK",
            3

         )
        questionList.add(ques1)

        val ques2 = Questions(
            2, "Who's in the picture?",
            R.drawable.china,
            "President of China",
            "President of Japan",
            "President of Vietnam",
            "President of South Korea",
            1

        )
        questionList.add(ques2)

        val ques3 = Questions(
            3, "Which shoes is this?",
            R.drawable.jordans,
            "Air Force One",
            "Nike Air Jordan",
            "Jordan",
            "Nike",
            2

        )
        questionList.add(ques3)

        val ques4 = Questions(
            4, "Which one is the tallest statue?",
            R.drawable.statues,
            "The Motherland Calls, Russia",
            "Spring Temple, China",
            "Statue Of Unity, India",
            "Guanyin Of Nanshan, China",
            3
         )
        questionList.add(ques4)

        val ques5 = Questions(
            5, "Which food is this",
            R.drawable.sushi,
            "Egg Wrap",
            "Rice Balls",
            "Dora Cake",
            "Sushi",
            4
        )
        questionList.add(ques5)

        return questionList

    }

}