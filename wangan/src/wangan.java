import Segmenter.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Chunker.*;
import ChunkerTrainer.*;
import POSTagger.*;
import POSTaggerTrainer.*;
import SegmenterTrainer.*;

public class wangan {
	static Scanner san = new Scanner(System.in);
	public static void main(String[] args)  
    {
	
		String w= "";
		Pattern p = Pattern.compile("\\s+");
		while(true){
		            System.out.print("���������ַ���(��q�˳�)��");
		            StringBuffer sb = new StringBuffer(san.nextLine());
		            Matcher m = p.matcher(sb);
		            w= m.replaceAll(" ");
		            if ( w.equals("SegmenterTrainer") )
		            	{SegmenterTrainer a;
		            	System.out.print("SegmenterTrainer��ϣ�\n");
		            	}
		            else if( w.equals("POSTaggerTrainer")) 
		                {POSTaggerTrainer a;
		                System.out.print("POSTaggerTrainer��ϣ�\n");
		                }
		            else if(w.equals("ChunkerTrainer"))
		            {ChunkerTrainer a;
		            System.out.print("ChunkerTrainer��ϣ�\n");
		            }
		            else if(w.equals("Segmenter"))
		            {Segmenter a;
		            System.out.print("Segmenter��ϣ�\n");
		            }
		            else if(w.equals("POSTagger"))
		            {POSTagger a;
		            System.out.print("POSTagger��ϣ�\n");
		            }
		            else if( w.equals("Chunker"))
		            {Chunker a;
		            System.out.print("Chunker��ϣ�\n");
		            }
		            else if(w.equals("q"))
		            	break;
		            else
		            	System.out.print("��������������������롣\n"); 	  
		          }	    
		
    }  
	
}
