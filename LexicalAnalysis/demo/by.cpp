#include <iostream>
#include <fstream>
#include <string>
#include <stdlib.h>
using namespace std;
string keyWords[]={"break","char","const","do","double","else","float","for","if","int","long","return","short","static","void","while"};
int keyWordsNum=sizeof(keyWords)/sizeof(keyWords[0]);//关键字数
 
 
char opera[]={'+','-','*','/','=','%'};
int operaNum=sizeof(opera)/sizeof(opera[0]);//算符数
 
 
char bound[]={ ';' , '{' , '}' , '(' , ')' , '<' , '>' , '#', '\'', '\"'};
int boundNum=sizeof(bound)/sizeof(bound[0]);//界符数
 

bool flag=false;//为true表示是关键字
 
 
//判断标识符
bool  isIde(string word,bool flag)
{	
	if(!flag)
	{
		for(int i=0;i<word.length();i++)
		{
			if(
				(word[i]>='a'&&word[i]<='z')      ||  
				(word[i]>='A'&&word[i]<='Z')      ||  
				(word[i]>='0'&&word[i]<='9'&&((word[0]>='a'&&word[0]<='z')||(word[0]>='A'&&word[0]<='Z')))     ||
				word[i]=='_'
			)//字母数字下划线组成并且第一个必须是字母或者下划线
			{	
				cout<<"标识符："<<word<<endl;
				break;
			}
		}		
	}
	return flag;
}
 
//判断关键字，这个地方要用flag使得关键字和标识符区分开
bool isKeyWords(string word,bool flag)
{
	if(!flag)
	{
		for(int i=0;i<keyWordsNum;i++)
		{
			if(word==keyWords[i])
			{
				cout<<"关键字："<<word<<endl;
				flag=true;
			}
		}
	}
	return flag;
}

//算符的判断
void isOpera(char word)
{
	for(int j=0;j<operaNum;j++)
	{
		
			if(word==opera[j])
			{
				cout<<"算符："<<word<<endl;
				break;
			}
		
	}	
}

//界符的判断
void isBound(char word)
{
	
		for(int j=0;j<boundNum;j++)
		{
			if(word==bound[j])
			{			
				cout<<"界符："<<word<<endl;
				break;
			}			
		}
	
}

//判断是常数
void isCon(string word)
{
	for(int j=0;j<word.length();j++)
	{
		if(word[j]>='0'&&word[j]<='9')
		{				
			cout<<"常数："<<word<<endl;
			break;
		}		
	}
}

//判断是符号
bool isSymbol(char ch)
{
	if(
	ch!=' '&&ch!='\n'&&ch!='\t'&&
	ch!='+'&&ch!='-'&&ch!='*'&&ch!='/'&&ch!='='&&ch!='%'&&
	ch!=','&&ch!='{'&&ch!='}'&&ch!='('&&ch!=')'&&ch!=';'&&ch!='<'&&ch!='>'&&ch!='#'&&ch!='\''&&ch!='\"'
	)
		return false;
	else
		return true;
}

int main()
{
	char ch;
	string complWord="";
	string isNotSpace="";
	//文件流：输入的方式读取文件
    ifstream infile("bianYi.txt",ios::in);
    if(!infile)
    {
        cerr<<"读取文件出错了！"<<endl;
        exit(1);
    }
	while(infile.get(ch))//从文件读取字符进来
	{
		if(ch!=' '&&ch!='\n')//换行及空格			
			isNotSpace+=ch;
		if(!isSymbol(ch))
		{
			complWord+=ch;	//不是符号的话就说明是单词的一部分	
			
		}
		else
		{
			//先判断是不是关键字，若是flag变为true
			flag=isKeyWords(complWord,flag);
			//再判断是不是标示符
			isIde(complWord,flag);
			//再判断是不是常数
			isCon(complWord);
			complWord="";
			flag=false;
			isOpera(ch);
			isBound(ch);
		}		
	}
    return 0;
}
