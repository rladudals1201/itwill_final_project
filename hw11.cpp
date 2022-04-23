#include <iostream>
#include <fstream>
#include <ctime>
#include <stdlib.h>
#include <sys/time.h>
#include "sort.h"
using namespace std ;

int main (int argc , char*argv []) {
 int T = atoi (argv [1]); // num of test case
 cout <<"T="<<T <<endl ;
 int N ; // 각 테스트케이스 별 레코드의 길이
 int i ; // iterator
 double result[4]; // result 배열에 각 알고리즘 별로 실행시간을 저장하게 됩
//니다.
 /*
 * result[0]: insertion sort
 * result[1]: quick sort
 * result[2]: natural merge sort
 * result[3]: heap sort
 * */
 struct timeval start_t , end_t ;
 double diff_t ;
 if (argc <3 ) {
 cerr <<"wrong argument count"<<endl ;
 return 1 ;
 }
 cout <<"--INS--|--QUICK--|--NATMG--|--HEAP--|"<<endl ;
	int* insertArray;
	int* quickArray;
	int* mergeArray;
	int* heapArray;
for (i = 2 ; i <T + 2 ; i++) {

	fstream fin(argv[i]);
	if(!fin)
	{
	cerr << argv[i] << " open failed" << endl;
	return 1;
	}	
	
	fin >> N;
	insertArray = new int[N + 1];
	quickArray = new int[N + 1];
	mergeArray = new int[N + 1];
	heapArray = new int[N + 1];
	int temp = N;
	Node * root = new Node;

	
	insertArray[0] = 0;
	quickArray[0] = 0;
	
	heapArray[0] = 0;	
	int index = 1;
	int num;
	
	while(temp) {	
		fin >> num;
		insertArray[index] = num;
		index++;
		temp--;
	}

	for(int k =1; k <= N; k++) {
		quickArray[k] = insertArray[k];
		mergeArray[k] = insertArray[k];
		heapArray[k] = insertArray[k];
		if(root->data == 0) {
			root->data = insertArray[k];
		}else {
			Node* node = new Node;
			node->data = insertArray[k];
			Node* temp = root;
			while(temp->link) {
				temp = temp->link;
			}
			temp->link = node;
		}
	}	
	gettimeofday(&start_t, NULL);
	InsertionSort(insertArray, N);
	gettimeofday(&end_t, NULL);

	diff_t = (double)(end_t.tv_sec-start_t.tv_sec)+
	((double)(end_t.tv_usec-start_t.tv_usec)/1000000);
	result[0] = diff_t;

	

	gettimeofday(&start_t, NULL);
	QuickSort(quickArray,1, N);
	gettimeofday(&end_t, NULL);
	diff_t = (double)(end_t.tv_sec-start_t.tv_sec)+
	((double)(end_t.tv_usec-start_t.tv_usec)/1000000);
	result[1] = diff_t;
	delete[] quickArray;
int k = 1;
vector<int> stop;//초기 패스(오름차순으로 정렬이 된 부분의 마지막 인덱스를 저장)
while(k <= N) {
	
	if(mergeArray[k ] <= mergeArray[k  + 1]) {

		while(k  < N && mergeArray[k ] <= mergeArray[k  + 1]) {
			k ++;
		}
		stop.push_back(k );
		k++;
	}else {
		
		stop.push_back(k );
		k ++;
	}
}	
	gettimeofday(&start_t, NULL);
	NaturalMergeSort(mergeArray,stop, N);
	gettimeofday(&end_t, NULL);
	diff_t = (double)(end_t.tv_sec-start_t.tv_sec)+
	((double)(end_t.tv_usec-start_t.tv_usec)/1000000);
	result[2] = diff_t;
	delete[] mergeArray;

	
	
	gettimeofday(&start_t, NULL);
	HeapSort(heapArray, N);
	gettimeofday(&end_t, NULL);
	diff_t = (double)(end_t.tv_sec-start_t.tv_sec)+
	((double)(end_t.tv_usec-start_t.tv_usec)/1000000);
	result[3] = diff_t;
	delete[] heapArray;
	
 /* 결과를 출력합니다. (이 부분은 수정하지 않습니다) */
 cout.precision(5);
 cout <<fixed ;
 for (int j = 0 ; j <4 ; j ++) {
 cout <<result [j ] <<"|";
 }
 cout <<"N="<<N <<endl ;
 }
}

