val a: Option[String] = Some("bubu")

a.fold(-1)(_.length)

