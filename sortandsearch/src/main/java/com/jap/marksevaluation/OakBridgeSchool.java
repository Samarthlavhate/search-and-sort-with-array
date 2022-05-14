package com.jap.marksevaluation;

public class OakBridgeSchool
{
    // This function takes as input the marks of all subjects and returns a total marks of each of the students
    public int[] calculateTotalMarks(int [] math,int science[], int[] english, int[] language,int[] social)
    { 
int i=0;

int[] totalmarks =new int[math.length];
		for(i=0;i<math.length;i++){
			totalmarks[i]=math[i]+science[i]+english[i]+language[i]+social[i];
		}

        return totalmarks;
    }
    // This function takes as input the total marks of each student and return
    // the average total marks of each student
     public int[] calculateAverageTotalMarks(int[] totalMarks){
	 
		  int[] aver =new int[totalMarks.length];
	   
		for(int i=0;i<totalMarks.length;i++){
			aver[i]=totalMarks[i]/5;
		}

        return aver;
    }
    // This function takes as input the math marks and returns the average score by all students
    public int calculateAverageMathMarks (int[] math)
    {   int i;
		int totalofmath=0;
		int mathave;
		for(i=0;i<math.length;i++){
			totalofmath= totalofmath+math[i];
		}
		mathave=totalofmath/math.length;

       return mathave;
    }
    // This function takes as input the science marks and returns the average score by all students
    public int calculateAverageScienceMarks (int[] science)
    {       int i;
		int totalofscience=0;
		int scienceave;
		for(i=0;i<science.length;i++){
			totalofscience= totalofscience+science[i];
		}
		scienceave=totalofscience/science.length;
        return scienceave;
    }
    // This function takes as input the social marks and returns the average score by all students
    public int calculateAverageSocialMarks (int[] social)
    {      int i;
		int totalofsocial=0;
		int socialave;
		for(i=0;i<social.length;i++){
			totalofsocial= totalofsocial+social[i];
		}
		socialave=totalofsocial/social.length;
        return socialave;
    }
    // This function takes as input the language marks and returns the average score by all students
    public int calculateAverageLanguageMarks (int[] language)
    {    int i;
		int totaloflanguage=0;
		int languageave;
		for(i=0;i<language.length;i++){
			totaloflanguage= totaloflanguage+language[i];
		}
		languageave=totaloflanguage/language.length;
        return languageave;
    }
    // This function takes as input the english marks and returns the average score by all students
    public int calculateAverageEnglishMarks (int[] english)
    {    int i;
		int totalofenglish=0;
		int englishave;
		for(i=0;i<english.length;i++){
			totalofenglish=totalofenglish+english[i];
		}
		englishave=totalofenglish/english.length;
       return englishave;
    }
    // This function takes as input the total marks of each student and the student names
    // and returns the name os the top scorer
    public String findTopScorer(int[] totalMarks,String [] studentNames)
    {   String name="";
	 int topper=totalMarks[0];
	 int i=1;
	for (;i<studentNames.length-1;i++){
		if(topper<totalMarks[i]){
           topper=totalMarks[i];
		   name=studentNames[i];
		}
	}
        //return the name of  the top scorer , extract the name from the studentNames array

        return name;
    }
    // This function takes as input all the marks in subjects and returns
    // as an array of 1 and 0 the passed and failed student status
    // 1 - pass
    // 0 - fail
    public int[] isPassed(int [] math,int science[], int[] social, int[] language,int[] english)
    {int i;
	int[] result =new int[math.length];

		for(i=0;i<math.length;i++){
			if(math[i]>=35&&science[i]>=35&&social[i]>=35&&language[i]>=35&&english[i]>=35){
                  result[i]=1;}
				  else{
					  result[i]=0;
				  }
		}
        return result;
    }
    // This function takes as input the pass fail status array and student names
    // and returns the names of failed students who need to re appear for the exam
    public String[] listOfStudentsToReAppearForExam(int [] passFailStatus,String studentNames[])
    { int i;
	int j=0;
	int size=0;
     for(i=0;i<passFailStatus.length;i++){
		 if(passFailStatus[i]!=1){
			 size++;
		 }

	 }
	 String[] failstudent=new String[size];
	 for(i=0;i<passFailStatus.length;i++){

		 if(passFailStatus[i]!=1){
			 failstudent[j]=studentNames[i];
			 System.out.print(failstudent);
			 j++;
		 }
	 }
	        
        return failstudent;
    }
    // This function takes as input the pass fail status array and student names
    // and returns the names of passed students

    public String[] listOfStudentsPassedTheExam(int [] studentIndex,String studentNames[])
    { int i;
	int j=0;
	int size=0;
     for(i=0;i<studentIndex.length;i++){
		 if(studentIndex[i]==1){
			 size++;
		 }

	 }
	 String[] passtudent=new String[size];
	 for(i=0;i<studentIndex.length;i++){
		 if(studentIndex[i]==1){
			 passtudent[j]=studentNames[i];
			 System.out.print(passtudent);
			 j++;
		 }
	 }
	        
        return passtudent;
    }
    // This function takes as input the average total marks of students
    // and returns the grade accordingly

    public char[] generateGrades(int [] averageTotalMarks)
{ int i;
	char[] grade=new char[averageTotalMarks.length];
	for(i=0;i<averageTotalMarks.length;i++){
		if(averageTotalMarks[i]>=90)
		grade[i]='A';
		else if(averageTotalMarks[i]>=80&&averageTotalMarks[i]<=89)
		grade[i]='B';
		else if(averageTotalMarks[i]>=70&&averageTotalMarks[i]<=79)
		grade[i]='C';
		else if(averageTotalMarks[i]>=60&&averageTotalMarks[i]<=69)
		grade[i]='D';
		else if(averageTotalMarks[i]>=50&&averageTotalMarks[i]<=59)
		grade[i]='E';
		else
		grade[i]='F';
	}
        return grade;
    }

    //This function takes the total marks of students and roll numbers abd returns the roll nos
    // in sorted order of total marks from smallest score to highest score

    public int[] sortByTotalMarks(int[] totalMarks,int [] rollNos)
    {    
		
		for(int pass=1;pass<totalMarks.length;pass++){
			for(int i=0;i<=totalMarks.length-1-pass;i++){
				if(totalMarks[i]>totalMarks[i+1]){
					int temp= totalMarks[i];
					totalMarks[i]=totalMarks[i+1];
					totalMarks[i+1]=temp;
					int temp2= rollNos[i];
					rollNos[i]=rollNos[i+1];
					rollNos[i+1]=temp2;
				
				}
			}
		}
        return rollNos;
    }

    
}
