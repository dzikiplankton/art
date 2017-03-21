package art

class BootStrap {

    def init = { servletContext ->

        def puggerfly = new ArtWork(name: "Puggerfly", description: "Beautiful picture of puggerfly", link:"http://i.imgur.com/5uJnPv8.jpg").save()

    }

    def destroy = {
    }
}
