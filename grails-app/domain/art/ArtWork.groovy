package art

class ArtWork {

    String name
    String description
    String link

    static constraints = {
        name maxSize: 255
        description maxSize: 10000
        link nullable: true
    }
    String toString(){
        return name + description + link
    }


}
