package skillFactoryTasks.module_12.Task_12_5_8;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Card> set = new HashSet<>();

        // �����
        set.add(new Card("6", "�����"));
        set.add(new Card("7", "�����"));
        set.add(new Card("8", "�����"));
        set.add(new Card("9", "�����"));
        set.add(new Card("10", "�����"));
        set.add(new Card("�����", "�����"));
        set.add(new Card("����", "�����"));
        set.add(new Card("������", "�����"));
        set.add(new Card("���", "�����"));

        // �����
        set.add(new Card("6", "�����"));
        set.add(new Card("7", "�����"));
        set.add(new Card("8", "�����"));
        set.add(new Card("9", "�����"));
        set.add(new Card("10", "�����"));
        set.add(new Card("�����", "�����"));
        set.add(new Card("����", "�����"));
        set.add(new Card("������", "�����"));
        set.add(new Card("���", "�����"));

        // ������
        set.add(new Card("6", "������"));
        set.add(new Card("7", "������"));
        set.add(new Card("8", "������"));
        set.add(new Card("9", "������"));
        set.add(new Card("10", "������"));
        set.add(new Card("�����", "������"));
        set.add(new Card("����", "������"));
        set.add(new Card("������", "������"));
        set.add(new Card("���", "������"));

        // ����
        set.add(new Card("6", "����"));
        set.add(new Card("7", "����"));
        set.add(new Card("8", "����"));
        set.add(new Card("9", "����"));
        set.add(new Card("10", "����"));
        set.add(new Card("�����", "����"));
        set.add(new Card("����", "����"));
        set.add(new Card("������", "����"));
        set.add(new Card("���", "����"));

        // ������� ������ ����� � ������ ������
        set.add(new Card("�����", "�����"));
        set.add(new Card("�����", "������"));
        set.add(new Card("7", "�����"));
        set.add(new Card("���", "����"));

        System.out.println(set.size()); // 36
    }
}
