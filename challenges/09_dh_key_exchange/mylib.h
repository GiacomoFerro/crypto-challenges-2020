#define MAXUSER 100

struct principal{
	
	int public_key;
	int private_key;
	int symmetric_key;
	
};

struct directory{

	//list of principal's public keys. max 100 principals
	int P[MAXUSER];
	
};

typedef struct principal principal;
typedef struct directory directory;

//list of prototypes
bool is_prime(int);
void print_array(int a[],int dim);
int calculate_generator(int group[], int p);
bool is_contained(int num, int a[], int dim);
void update_principals(principal pr[], int ,int, int group[],int);
directory update_dir(principal *, directory, int pos);
int generate_Kab(principal pr[] , directory dir, int prime, int initiator, int responder);

//begin of functions

/*
insert public key of the principal in the directory 'dir'
*/
directory update_dir(principal pr[], directory dir, int pos){
	dir.P[pos]=pr[pos].public_key;
	return dir;
   
}

/*generate KAB given:
 	prime = prime number
 	indexInit = index of principal private key in list of principal pr
	indexResp = index of prinicpal public key in dir
	pr = list of principal private key
	dir = directory of principal public key
	 
*/
int generate_Kab( principal pr[],  directory dir, int prime, int indexInit, int indexResp){
	
	//TODO

}

/*
	update of public anche private key for a principal of index 'pos' in the list
*/

void update_principals(principal pr[], int seed , int prime, int group[],int pos){
	
	//TODO
	
}


void print_array(int a[], int dim){

	int i;

	printf("[");
	for(i=0; i<dim; i++){
		printf(" %d ",a[i]);
	}
	printf("]\n");

}

/*
check if n is prime
*/
bool is_prime(int n){

	//TODO

}


/*
calculate generator of the group
*/
int calculate_generator(int group[], int p){

	//TODO

}

// check if num is contained in array a
bool is_contained(int num, int a[], int dim){

	int i;
	
	for(i=0; i<dim; i++){
		if(num==a[i]){
			return true;
		}
	}
	return false;
}


