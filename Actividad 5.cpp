#include <iostream>
using namespace std;
int main(){
	int longuitud=5, actual=0, j=0;
	int agreglo[longuitud]={905,210,550,102,443};
	
	for(int i = 1; i <= longuitud - 1; i++){
		actual= agreglo[i];
		j=i-1;
		while( j >= 0 && agreglo[j] > actual){
			agreglo[j+1]= agreglo[j];
			j=j-1;
		}
		agreglo[j+1]=actual;
	}
	for(int i = 0; i <= longuitud - 1; i++){
		cout<<agreglo[i]<<", ";
	}
	
}
