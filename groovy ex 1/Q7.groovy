import groovy.io.FileType

def dir =new File("c:/groovylab")
def NewFilePath = "c:/groovylab/NewFile.txt"
def isFileCreationSuccess  = new File(NewFilePath).createNewFile()

if (!isFileCreationSuccess) {
    (1..10).find {
        NewFilePath = "c:/groovylab/NewFile${it}.txt"
        isFileCreationSuccessAgain  = new File(NewFilePath).createNewFile()
        if(isFileCreationSuccessAgain) {
            return true;
        }
    }
    if(!isFileCreationSuccessAgain) {
        print "Unable to create File."
        return
    }
}

dir.eachFile(FileType.FILES) { dirFile ->
    new File(dirFile.absolutePath).eachLine { line ->
        new File(NewFilePath).append("${line}\n")
    }
}
