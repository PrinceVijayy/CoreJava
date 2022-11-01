package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class _11_mergeSort {
  public static void main(String[] args) {
    _11_mergeSort obj = new _11_mergeSort();
    List<Integer> my_list = new ArrayList<>();
    //    List<Integer> my list2=new ArrayList<>();
    my_list.add(1);
    my_list.add(3);
    my_list.add(2);
    my_list.add(4);
    System.out.println(obj.mergeSort(my_list));
  }

  public List<Integer> mergeSort(List<Integer> my_list) {
    List<Integer> result = new ArrayList<>();
    if (my_list.size() == 1) {
      return my_list;
    }
    int mid_index = my_list.size() / 2;
    List<Integer> left = new ArrayList<>();
    for (int i = 0; i < mid_index; i++) {
      left.add(my_list.get(i));
    }
    List<Integer> right = new ArrayList<>();
    for (int j = mid_index; j<my_list.size(); j++) {
      right.add(my_list.get(j));
    }
    mergeSort(left);
    mergeSort(right);

    return merge(left,right);
  }

  public List<Integer> merge(List<Integer> list1, List<Integer> list2) {
    List<Integer> combinedList = new ArrayList<>();
    int i = 0;
    int j = 0;
    while (i < list1.size() && j < list2.size()) {
      if (list1.get(i) < list2.get(j)) {
        combinedList.add(list1.get(i));
        i++;
      } else {
        combinedList.add(list2.get(j));
        j++;
      }
    }

    while (i < list1.size()) {
      combinedList.add(list1.get(i));
      i++;
    }
    while (j < list2.size()) {
      combinedList.add(list2.get(j));
      j++;
    }
    return combinedList;
  }
}
