import groovy.io.FileType

def OriginalFilePath = "c:/groovylab/test.txt"

void trimmedFileCopy(String OriginalFilePath) {
    File OriginalFile = new File(OriginalFilePath)
    TrimmedFilePath = OriginalFile.absolutePath.replace(".", "_Trimmed.")
    def isFileCreationSuccess  = new File(TrimmedFilePath).createNewFile()
    if(!isFileCreationSuccess) {
        print "Unable to create File."
        return
    }
    OriginalFile.eachLine { line ->
        List list="${line}".tokenize()
        list.each { word ->
            new File(TrimmedFilePath).append("${word}")
        }
    }
}

trimmedFileCopy(OriginalFilePath)
