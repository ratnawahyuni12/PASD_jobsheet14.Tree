public class BinaryTreeArray20 {
    Mahasiswa20[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray20() {
        this.dataMahasiswa = new Mahasiswa20[10];
    }

    void populateData (Mahasiswa20 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder (int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // 4a. method add(Mahasiswa data) untuk memasukkan data ke dalam binary tree
    void add(Mahasiswa20 data){
        idxLast++;
        if (idxLast >= dataMahasiswa.length){
            Mahasiswa20[] dataBaru = new Mahasiswa20[dataMahasiswa.length * 2];
            for (int i = 0; i < dataMahasiswa.length; i++){
                dataBaru[i] = dataMahasiswa[i];
            }
            dataMahasiswa = dataBaru;
        }
        dataMahasiswa[idxLast] = data;
    }
 
    // 4b. method traversePreOrder()
    void traversePreOrder(int idxStart){
        if(idxStart <= idxLast){
            if (dataMahasiswa[idxStart] != null){
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2*idxStart+1);
                traversePreOrder(2*idxStart+2);
            }
        }
    }
}