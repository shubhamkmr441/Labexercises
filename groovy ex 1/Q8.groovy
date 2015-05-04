
import groovy.io.FileType
def OrginalFile = "c:/groovylab/test.txt"
def OddLinesFile = "c:/groovylab/OddLinesFile.txt"
def isFileCreationSuccess  = new File(OddLinesFile).createNewFile()
if(!isFileCreationSuccess) {
    print "Unable to create File."
    return
}
new File(OrginalFile).eachLine { line,idx ->
    if(idx%2==1) {
        if(idx<10){
            formattedIdx=" ${idx}:"
        }
        else {
            formattedIdx="${idx}:"
        }
        new File(OddLinesFile).append("${formattedIdx} ${line}\n")
    }
}
