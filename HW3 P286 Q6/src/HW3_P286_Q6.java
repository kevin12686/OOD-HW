import java.util.Scanner;

public class HW3_P286_Q6 {
	public static void main(String Arge[]){
		//�إߪ���ɴN����l��
		StudentRecord S1 = new StudentRecord(new int[]{4, 6, 7}, 72, 85);
		
		//���槹����k�~�|���`���Z�P�Ť�
		S1.excute();
		
		//��X���Z��T
		System.out.println(S1);		
		System.out.println();
		
		//�إߪ���ɤ�������l�ȫK�ϥιw�]��
		StudentRecord S2 = new StudentRecord();
		
		//�����ϥΪ̦ۦ��J���Z�A�ù磌��i��]�w
		Scanner scan = new Scanner(System.in);
		int[] q = new int[3];
		for(int i = 0; i < 3; i++){
			System.out.print("Please key in " + (i + 1) + "th quizze : ");
			q[i] = scan.nextInt();
		}
		S2.quizzes = q.clone();
		System.out.print("Please key in midterm exam : ");
		S2.midexam = scan.nextInt();
		System.out.print("Please key in fianl exam : ");
		S2.finexam = scan.nextInt();
		
		//���槹����k�~�|���`���Z�P�Ť�
		S2.excute();
		
		//��X���Z��T
		System.out.println(S2);
		System.out.println();
		
		//����⪫���`���Z�P�Ť��O�_�۵��ÿ�X���G
		System.out.println("S1 is equal to S2 ? " + S1.equals(S2));
		
		scan.close();
	}
}
