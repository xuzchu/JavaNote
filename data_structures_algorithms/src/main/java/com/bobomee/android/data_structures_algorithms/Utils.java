/*
 * Copyright (C) 2017.  BoBoMEe(wbwjx115@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.bobomee.android.data_structures_algorithms;

/**
 * Project ID：400YF17050
 * Resume:     <br/>
 *
 * @author 汪波
 * @version 1.0
 * @see
 * @since 2017/3/10.汪波.
 */
public class Utils {
  public static void swap(int[] arr, int one, int two) {
    int temp = arr[one];
    arr[one] = arr[two];
    arr[two] = temp;
  }

  public static int getMax(int [] arr){
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }
}
