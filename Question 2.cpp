
#include <iostream>

#include <algorithm>


using namespace std;


struct student {

    int id;

    string name;

    double cgpa;

};


bool cmp(student a, student b)

{

    if(a.cgpa == b.cgpa){

        if(a.name == b.name){

            return a.id < b.id;

        }

        return a.name < b.name;

    }

    return a.cgpa > b.cgpa;

}


int main()

{

    int n;

    cin >> n;


    student students[n];


    for(int i=0;i<n;i++){

        cin >>students[i].id;

        cin >>students[i].name;

        cin >>students[i].cgpa;

    }


    sort(students,students+n,cmp);


    for(int i=0;i<n;i++){

        cout << students[i].name <<endl;

    }



}

/*

5

33 Rumpa 3.68

85 Ashis 3.85

56 Samiha 3.75

19 Samara 3.75

22 Fahim 3.76

 */
	
	
	
