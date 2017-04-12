package art

class BootStrap {

    def init = { servletContext ->

        def puggerfly = new ArtWork(
                name: "Puggerfly",
                description: "\n" +
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas risus velit, faucibus eget hendrerit non, ullamcorper eu urna. Vivamus ullamcorper tortor risus. Nulla placerat urna id pulvinar iaculis. Aliquam at nulla felis. Fusce in libero ac ligula condimentum egestas. Phasellus blandit purus et odio tincidunt, et congue nisl volutpat. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Praesent ultricies libero ipsum, sit amet rutrum tellus vehicula eget. Nulla molestie tincidunt tortor lacinia commodo. Aliquam luctus tempus leo vitae fringilla. Quisque scelerisque vulputate cursus. Nulla facilisi.",
                link:"http://i.imgur.com/5uJnPv8.jpg"
        ).save()
        def puggerpillar = new ArtWork(
                name: "Puggerpillar",
                description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nulla turpis, egestas ac libero vitae, fermentum vehicula urna. Etiam dui enim, interdum efficitur consequat non, rutrum dapibus velit. Ut pharetra, eros vestibulum scelerisque euismod, est risus fringilla lorem, non pellentesque diam massa sed mauris. Nam sapien dui, congue a nulla quis, sagittis pellentesque magna. Donec tortor purus, malesuada in fermentum et, fermentum nec lectus. Morbi massa sapien, porta ac mi quis, euismod fringilla odio. Fusce gravida sed augue eu tempus. Aliquam sit amet velit lectus. Suspendisse id ex vitae lorem.",
                link:"http://4.bp.blogspot.com/-6pw97i42na4/T54y74sQr3I/AAAAAAAA4qE/AC5aQ01Qg68/s1600/tumblr_lzqxojPQXo1qgu73wo1_500.jpg"
        ).save()

        def adminRole = new Arole(authority: 'ROLE_ADMIN').save()
        def userRole = new Arole(authority: 'ROLE_USER').save()

        def testUser = new Auser(username: 'me', password: 'you').save()

        AuserArole.create testUser, adminRole

        AuserArole.withSession {
            it.flush()
            it.clear()
        }

        assert Auser.count() == 1
        assert Arole.count() == 2
        assert AuserArole.count() == 1

    }

    def destroy = {
    }
}
