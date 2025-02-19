
![https://hacktoberfest.digitalocean.com/](https://pbs.twimg.com/profile_banners/1040669393255055360/1662652901/1500x500)

# 🎃 HacktoberFest Starter Project 🎃

Use this project to make your first contribution to an open source project on GitHub. Practice making your first pull request to a public repository before doing the real thing!

This repository is open to all members of the GitHub community. Any member may contribute to this project without being a collaborator.

# Don't forget to give ⭐ ( To give star you can see on your screen on top right hand side Just smash it 💥 :)

Celebrate [Hacktoberfest](https://hacktoberfest.digitalocean.com/) by getting involved in the open source community by completing some simple tasks in this project.


## STEPS FOR CONTRIBUTING



### Level 1 Contributions - Add a minimal of 3 objects to the questions or answers json of your choice. 

We are using Json to create a list of frequently given interview questions and answers for different languages!
In every directory, you will find two files `questions` and `answers`

If you'd like to contribute to **questions.json**:
1. Fork this repo
2. Navigate to the language folder you would like to contribute to. 
3. Open Questions, here copy the last item in the list, and fill in each label. 
	 
	 **id**: incremental number.

	 **question**: An interview question.

	 **details**: An in depth answer of the question, **no more than 150 characters.**

	 **questionType**: "multi" for a multiple answer type question, or "bool" for a true or false type question.  

	 **trueOrFalse**: if your question is multi, leave this false. If your question is true or false, type the correct answer. 

	 **shortAns**: The One Sentence Answer to your question PLEASE DO NOT INCLUDE THE TERM/SUBJECT USED IN THE QUESTION HERE, also Prefix with **"it is"**, **Please keep these less than 60 Characters**

	 **tag**: A one word tag that specifies what part of a project your question is in reference to.
	
	Please make sure to match the syntax of the previous items. Questions should end with a punctuation mark.
	Example: Please Make sure to start "shortAns" with "It is" (ie if the answer is "a cat" then say "It is a cat."
	
    {
      "id": 0,
      
      "question": "What is Android?",
      
      "details": "Android is a stack of software for mobile devices which includes an Operating System, middleware and some key applications. The application executes within its own process and its own instance of Dalvik Virtual Machine.",
      
      "questionType": "multi",
      
      "trueOrFalse": false,
      
      "shortAns": "**It is** a stack of software for mobile devices.",
      
      "tag": "android"
      },
    
    {
    
      "id": 1,
      
      "question": "The Android Operating System runs on many different devices?",
      
      "details": "Android operating system devices — including computers, digital cameras, media players, notebooks, and smartphones. There are now more than 24,000 different Android devices.",
      
      "questionType": "bool",
      
      "trueOrFalse": true,
      
      "shortAns": "**NOTHING GOES HERE FOR BOOLEAN QUESTIONS" = "",
      
      "tag": "Operating System"
      
    }

4. Open Contributors.md file and add your name and relevant information. 

5. Make Pull Request.

Json Objects in the Answers.json are terms that will be used to hide the correct answer supplied by an item from Questions. json.  Please Make sure to start "Answer" with "It is" (ie if the answer is "a cat" then say "It is a cat." 


If you'd like to contribute to **answers.json**:
1. Fork this repo
2. Navigate to the language folder you would like to contribute to. 
3. Open Answers.json, here copy the last item in the list, and fill in each label. 
	 
 **answer**: A topic with a basic small description. 
 **details**: Detailed Information on the subject supplied in Answer, **no more than 150 characters.**
	
Please make sure to match the syntax of the previous items. Answers should end with a punctuation mark.
Example: 

   {
   
      "answer": "**It is** everything you can see on the screen of the app.",
      
      "details": "Think of the individual UI elements like buttons, labels, and text fields."
      
   }, 
    
    {
    
      "answer": "**It is** a month-long celebration of open source software run by DigitalOcean.",
      
      "details": "Hacktoberfest encourages participation in the open source community, which grows bigger every year. Complete the 2021 challenge and earn a limited edition T-shirt."
      
    }

4. Open Contributers.md file and add your name and relevant information.
5. Make Pull Request.




### LEVEL 2 CONTRIBUTIONS - RESOLVE A SMALL "ISSUE" TICKET!

Want to get your hands wet with some programming? Look at the open issues and find one that allows you to contribute to one of the modules! These will vary but should be easy enough. 

1. Find an issue and ask for rights/claim to work on it. 
2. A Maintiner will grant said permissions. 
3. Fork the repo and create a branch to save your work to. 
4. Resolve the issue
5. Pull latest changes from master branch into your branch and resolve all merge conflicts. 
6. Create a PR!
7. Your PR will be reviewed, after resolving all request, your PR will be accepted
8. Open Contributors.md file and add your name and relevant information. 
9. CELEBRATE GOOD TIMES COME ON!!
10. RINSE REPEAT! You're a fireball!




### LEVEL 3 CONTRIBUTIONS - BUILD A MODULE OF THE PROJECT :O!! YOU'RE A BOSS!

Want a challenge? Here you will rebuild the project with options to use the supplied UI. You will focus on showing off a few different libraries and an architecture of your choice (MVP, MVC, MVVM, HILT, Coroutines, etc etc etc endless possibilities) To show other developers different ways in which these things can be combined to build the quiz application. Please focus on and gain experience with the repository layer, dependency injection, view models, and whatever else you like! Lets see how many different modules we can create! 

1. navigate to `https://github.com/Tc2r1/DevInterview_Questions/tree/master/Interview_Prep_App/`
2. decide if you want to work in Native_Java or Native_Kotlin, or something else (for something else skip to 6b) open the folder you choose.
3. Fork the repo and create a branch to save your work to. 
4. copy the template application folder and rename it based on what your project will showcase. for example "retrofit, coroutines, viewmodel, jetpack compose" along with your username (IE: retrofit2_tc2r1) 

5. Open the "Interview_Prep_App" folder in android studio and add your module to the settings.gradle file.
6. Rename the module id com.interviewprep.unique_folder_name_from_step_3
6b. For those who want to work in something besides native android, create a folder with your application type in `Interview_Prep_App` folder: "SwiftUI" "Html5" etc. 

7. Use your skills and libraries of choice to recreate the project.
8. Pull latest changes from master branch into your branch and resolve all merge conflicts. 
9. Open Contributors.md file and add your name and relevant information.
10. Add a README.md to the base of your project folder/ module that list what makes your version of the quiz app special (aka libraries you used, patterns, languages, etc)
11. Create a PR (With detailed information and images if possible of your work)!
12. Your PR will be reviewed, after resolving all request, your PR will be accepted
13. CELEBRATE GOOD TIMES COME ON!!
14. RINSE REPEAT! You're a fireball!


## What is Hacktoberfest?
A month-long celebration from October 1st - 31st sponsored by [Digital Ocean](https://hacktoberfest.digitalocean.com/) and [GitHub](https://github.com/blog/2433-celebrate-open-source-this-october-with-hacktoberfest) to get people involved in [Open Source](https://github.com/open-source). Create your very first pull request to any public repository on GitHub and contribute to the open source developer community.



<h1 align="center"> Hacktoberfest 2022 🎉</h1>

<div align="center">
<img src="https://img.shields.io/badge/hacktoberfest-2022-blueviolet" alt="Hacktober Badge"/>
<img src="https://img.shields.io/badge/hacktoberfest-2021-blueviolet" alt="Hacktober Badge"/>
 <img src="https://img.shields.io/static/v1?label=%F0%9F%8C%9F&message=If%20Useful&style=style=flat&color=BC4E99" alt="Star Badge"/>
 <a href="https://github.com/Tc2r1" ><img src="https://img.shields.io/badge/Contributions-welcome-violet.svg?style=flat&logo=git" alt="Contributions"/></a>

</div>

### 🗣 Hacktoberfest encourages participation in the open source community, which grows bigger every year. Complete the 2021 challenge and earn a limited edition T-shirt.

📢 **Register [here](https://hacktoberfest.com/auth/) for Hacktoberfest and make four pull requests (PRs) between October 1st-31st to grab free SWAGS 🔥.**


## Rules

- Don't use filthy words and be welcome for beginners and other people in this community.

---

## Github Contribution Rules
- Pull requests can be submitted to any opted-in repository on GitHub or GitLab.
- The pull request must contain commits you made yourself.
- If a maintainer reports your pull request as spam, it will not be counted toward your participation in Hacktoberfest.
- If a maintainer reports behavior that’s not in line with the project’s code of conduct, you will be ineligible to participate.
- To get a shirt, you must make four approved pull requests (PRs) on opted-in projects between October 1-31 in any time zone.
- This year, the first 50,000 participants can earn a T-shirt.
---

Contributions of any kind welcome!

-Best of luck ✌️

# Don't forget to give ⭐ ( To give star you can see on your screen on top right hand side Just smash it 💥 :) ) 


# Contributers List  🏆

🙏 Thanks

<a href="https://github.com/Tc2r1/DevInterview_Questions/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=Tc2r1/DevInterview_Questions" />
</a>

Made with [contrib.rocks](https://contrib.rocks).

>    NOTE: if you should be on the list of contributors but we forgot you, don't be shy and let us know!

## License
[![By-nc-nd](https://licensebuttons.net/l/by-nc-nd/4.0/88x31.png)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

[Nudennie White](https://www.linkedin.com/in/nudennie-w-99411075/)
