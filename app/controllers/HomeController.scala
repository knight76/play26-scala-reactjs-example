package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc._

@Singleton
class HomeController @Inject()(cc: MessagesControllerComponents,
                               indexTemplate: views.html.index) extends AbstractController(cc) {

  def index = Action { implicit request: Request[AnyContent] =>
    Ok(indexTemplate())
  }
}