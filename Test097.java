/*===================
  ���� �迭 ����
  - �迭�� ����
===================*/

// Test098.java�� ��

// �� �迭 ������ ����� ������ ����, �ּҰ� ���� �� ���� ���°� �����Ѵ�.
//    �ּҰ� ���� �� ���� ���� �� ������ �����ϸ� ���纻�� ������ ��ġ�� �Ǵ� ���� ���.
//								  (�迭 �� �ƴ϶� ��� ������ �����Ϳ� �ش��ϴ� ����)
//    ������ ���� �� ���� ���� �� ���� ��ҷ� ����ִ� ���� ���� �����
//								  ������ �����ص� ���纻�� ������ ��ġ�� �ʴ� ���� ���

// �ּҰ� ����
public class Test097 {

	public static void main(String[] args) {

		int[] nums = {10, 20, 30, 40, 50};		//-- �迭 ����
		int[] copys;							//-- ���纻���� ���� �迭

		int temp;								//-- �ǽ� ����(�׽�Ʈ)�� ���� �Ͻ� ����

		// check
		copys = nums;							//-- ����

		temp = nums[0];

		nums[0] = 1500;

		for (int i=0; i<copys.length; i++)
		{
			System.out.printf("%d\t", copys[i]);
		}
		System.out.println();
		
		System.out.println("temp : " + temp);

	}
}