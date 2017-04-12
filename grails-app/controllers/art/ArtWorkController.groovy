package art

import grails.plugin.springsecurity.annotation.Secured


@Secured('ROLE_ADMIN')
class ArtWorkController {

    static scaffold = ArtWork

}
