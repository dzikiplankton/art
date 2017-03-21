package art

class HomeController {

    def index() {
        respond([name: session.name ?: 'user', artWorkTotal: ArtWork.count()])
    }

    def updateName(String name){
        session.name = name
        flash.message = "Name updated"
        redirect action: 'index'
    }
}
