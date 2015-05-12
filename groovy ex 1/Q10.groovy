import groovy.io.FileType
import java.awt.image.*
import javax.imageio.*

def OriginalImagePath = "c:/groovylab/img1.jpg"

TrimmedImagePath = OriginalImagePath.replace(".", "_copy.")
    def isFileCreationSuccess  = new File(TrimmedImagePath).createNewFile()
    if(!isFileCreationSuccess) {
        print "Unable to create File."
        return
    }

BufferedImage bi = ImageIO.read(new File(OriginalImagePath))
ImageIO.write( bi, "jpg", new File(TrimmedImagePath))

