const maps = [];
maps.push("0-0");// 需要补个0-0，后面len--
maps.push("1-2");
maps.push("4-2");
maps.push("1-2");
maps.push("3-1");
maps.push("2-2");
maps.push("5-1");

console.log("原先的顺序：", maps);

const newMaps = qSort(maps);
newMaps.length--;

console.log("排序后的顺序(0-0是个临时的位置，这里被干掉了)：", newMaps)

function qSort(list, secondary) {
  if (list.length === 1 || list.length === 0) return list;
  let pivot = list[0];//参照值
  let lesser = [];//比参照值小的值集合
  let greater = [];//比参照值大的值集合
  for (let i = 1; i < list.length; i++) {
    if (secondary && list[i].split("-")[0] > pivot.split("-")[0] || list[i].split("-")[1] > pivot.split("-")[1]) {
      lesser.push(list[i]);
    } else {
      greater.push(list[i]);
    }
  }

  lesser = qSort(lesser, true);//lesser重排
  greater = qSort(greater, true);//greater重排

  //重新拼接数组-从小到大
  return qSort(lesser).concat(pivot, qSort(greater));
}