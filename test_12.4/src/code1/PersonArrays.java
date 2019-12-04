package code1;

/**
 * @program:test_12.4
 * @author: Nine_odes
 * @description:
 * @create:2019-12-04 14:40
 */
class PersonArrays<T>{
    private T[] personList;

    public PersonArrays(T[] personList) {
        this.personList = personList;
    }
    public boolean Insert(int index, T e){
        if(index >= 0 && index < personList.length){
            personList[index] = e;
            return true;
        }
        return false;
    }

    public T get(int index){
        if(index >= 0 && index < personList.length){
            return personList[index];
        }
        return null;
    }
}
