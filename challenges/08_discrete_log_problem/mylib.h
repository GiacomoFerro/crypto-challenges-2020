
//list of prototypes

bool is_prime(int);
void calculate_CoGroup(int, int group[]);
bool check_coprimes(int, int);
void print_array(int a[],int dim);
int optimize(int group[],int p);
void allocate_val(int a[], int b[], int dim);
int calculate_generator(int group[], int p);
bool is_contained(int num, int a[], int dim);
void calculate_discreteLog(int g, int group[], int p, int ris[]);
int calculate_legendre(int,int);
bool is_even(int);
bool is_quadratic_residue(int q,int p);
void calculate_jacobi(int a, int b, int p, int q, int jac[]);


//begin of functions


void calculate_jacobi(int a, int b, int p, int q, int jac[]){
	//TODO
}




int calculate_legendre(int a, int p){
	// number is square mod p iff his legendre number is 1

	//TODO

}


bool is_quadratic_residue(int q, int p){
 
	//TODO

}


/*allocate values of the group*/
void allocate_val(int real[], int old[], int p){

	int i,index;

	for(i=0,index=0; i<p-1; i++){
		if(old[i]!=0){
			real[index]=old[i];
			index++;
		}	
	}
}
/*
remove zero values
*/
int optimize(int group[], int p){
	
	int i,dim;

	for(i=0,dim=0; i<p-1; i++){
		if(group[i]!=0){
			dim++;
		}
	}
	return dim;


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
return true if n is prime number
*/
bool is_prime(int n){


}

/*calculate a coprimes group*/
void calculate_CoGroup(int p, int group[]){

	int i=0, index=0;

	for(i=1; i<=p-1; i++){
		if(check_coprimes(i,p)){
			group[index]=i;
			index++;
		}
	}

}

/* check if two numbers are coprime*/
bool check_coprimes(int a, int b){
	
	//TODO

}

/* given a cyclic group and prime number p, calculate its generator*/
int calculate_generator(int group[], int p){

	//TODO

}

bool is_contained(int num, int a[], int dim){

	int i;
	
	for(i=0; i<dim; i++){
		if(num==a[i]){
			return true;
		}
	}
	return false;
}

/* calculate discrete log given a seed of the cyclic group*/
void calculate_discreteLog(int g, int group[], int p, int ris[]){

	//TODO

}

bool is_even(int i){
	
	return i%2==0;	

}

