#include<iostream>
using namespace std;

int main(){
int min=0,max=0;
int i=0;
int n;
int num;
int flag=0;
cout<<"Enter n: ";
cin>>n;
while(i<n){
    cout<<"Enter "<<(i+1)<<": ";
    cin>>num;
    if(flag==0){
        max=num;
        min=num;
        flag=1;
    }
    else{
        if(num>max){
            max=num;
        }
        if(num<min){
            min=num;
        }
    }
    i++;
}

return 0;
}