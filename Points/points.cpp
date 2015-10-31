#include <iostream>
#include <string.h>

using namespace std;

void point(int& x, int& y)
{
    cout << "(" << x << "," << y << ")";
}

void get_input(char* command)
{
    int x=0;
    int y=0;

    int dx=1;
    int dy=1;

    int i=0;

    int s = strlen(command);

    while (i < s)
    {
        if (command[i] == '<') {
                x -=dx;
        }
        if (command[i] == '>') {
                x += dx;
        }
        if (command[i] == '^') {
                y +=dy;
        }
        if (command[i] == 'v') {
                y -=dy;
        }
        if (command[i] == '~') {
                if (command[i+1] == '<') {
                        dx = -1;
                }
                if (command[i+1] == '>') {
                        dx = -1;
                }
                if (command[i+1] == '^') {
                        dy = -1;
                }
                if (command[i+1] == 'v') {
                        dy = -1;
                }
        }
        i++;
    }
    point(x, y);

}

int main()
{
    char* cmd = new char[1000];

    int a;
    int b;

    cin >> a;
    cin >> b;

    point(a, b);

    cin >> cmd;

    get_input(cmd);

    return 0;
}


