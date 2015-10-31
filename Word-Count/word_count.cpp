#include <iostream>
#include <fstream>
#include <string.h>

using namespace std;

int check_rows(int rowCount, int colCount, char** myArray, const char* word)
{
    int s = strlen(word);

    int counter=0;
    for (int i=0; i< rowCount; i++) {
        if (strncmp((const char*)myArray[i], word, s/*colCount*/) == 0 ) {

            counter++;
            }
        }
    return counter;
}

int check_col(int rowCount, int colCount, char** myArray, const char* word)
{
    char str[rowCount+1];

    int s = strlen(word);

    int counter=0;
    for (int i=0; i< colCount; i++) {
        for (int j=0; j < rowCount; j++) {
            str[j] = myArray[j][i];
        }
        if(strncmp((const char*)str, word, s/*rowCount*/) == 0) {
                counter++;
            }
    }
    return counter;
}

int check_diagonal(int rowCount, int colCount, char** myArray, const char* word)
{
    char str[rowCount+1];

    int s = strlen(word);

    int counter=0;
    for (int i=0; i< colCount; i++) {
        for (int j=0; j < rowCount; j++) {
                if (i == j) {
                    str[i] = myArray[j][i];
                            }
                        }
                if(strncmp((const char*)str, word, s/*rowCount*/) == 0) {
                    counter++;
                    }
                }
    return counter;
}

// function made in order to help checking colons from the botom to the top
void reverse(char s[])
{
    int length = strlen(s) ;
    int c, i, j;

    for (i = 0, j = length - 1; i < j; i++, j--)
    {
        c = s[i];
        s[i] = s[j];
        s[j] = c;
    }
    cout << s;
}

int main()
{
	int line = 0;
    int rowCount=5;
    int colCount=4;

    char** myArray = new char*[rowCount];

	for(int k = 0; k < rowCount; k++)
	{
        myArray[k] = new char[colCount];
    }

  	ifstream file("matrix.txt");
    string str;

    while (getline(file, str))
    {
		strncpy(myArray[line], str.c_str(), colCount);
 		line++;
    }

    char s[5] = "word";
    reverse(s);

    cout << endl;

    int n1 = check_rows(rowCount, colCount, myArray, "word");
    int n2 = check_col(rowCount, colCount, myArray, s);
    int n3 = check_diagonal(rowCount, colCount, myArray, "word");
    int n4 = check_col(rowCount, colCount, myArray, "word");

    cout << n1 + n2 + n3 + n4 << endl;

    return 0;
}
