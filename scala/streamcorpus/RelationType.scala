/**
 * generated by Scrooge ${project.version}
 */
package streamcorpus

import com.twitter.scrooge.ThriftEnum

/**
 * RelationType is used in Relation to map relation "name" to type.
 * This list borrows from ACE with these string replacements: s/-//
 * and s/./_/
 *
 * http://projects.ldc.upenn.edu/ace/docs/English-Events-Guidelines_v5.4.3.pdf
 */
@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"), date = "2013-08-12T15:12:53.355-0400")
case object RelationType {
  
  case object PhysLocated extends RelationType {
    val value = 0
    val name = "PhysLocated"
  }
  
  case object PhysNear extends RelationType {
    val value = 1
    val name = "PhysNear"
  }
  
  case object PartwholeGeographical extends RelationType {
    val value = 2
    val name = "PartwholeGeographical"
  }
  
  case object PartwholeSubsidiary extends RelationType {
    val value = 3
    val name = "PartwholeSubsidiary"
  }
  
  case object PartwholeArtifact extends RelationType {
    val value = 4
    val name = "PartwholeArtifact"
  }
  
  case object PersocBusiness extends RelationType {
    val value = 5
    val name = "PersocBusiness"
  }
  
  case object PersocFamily extends RelationType {
    val value = 6
    val name = "PersocFamily"
  }
  
  case object PersocLastingPersonal extends RelationType {
    val value = 7
    val name = "PersocLastingPersonal"
  }
  
  case object OrgaffEmployment extends RelationType {
    val value = 8
    val name = "OrgaffEmployment"
  }
  
  case object OrgaffOwnership extends RelationType {
    val value = 9
    val name = "OrgaffOwnership"
  }
  
  case object OrgaffFounder extends RelationType {
    val value = 10
    val name = "OrgaffFounder"
  }
  
  case object OrgaffStudentAlum extends RelationType {
    val value = 11
    val name = "OrgaffStudentAlum"
  }
  
  case object OrgaffSportsAffiliation extends RelationType {
    val value = 12
    val name = "OrgaffSportsAffiliation"
  }
  
  case object OrgaffInvestorShareholder extends RelationType {
    val value = 13
    val name = "OrgaffInvestorShareholder"
  }
  
  case object OrgaffMembership extends RelationType {
    val value = 14
    val name = "OrgaffMembership"
  }
  
  case object ArtUserOwnerInventorManufacturer extends RelationType {
    val value = 15
    val name = "ArtUserOwnerInventorManufacturer"
  }
  
  case object GenaffCitizenResidentReligionEthnicity extends RelationType {
    val value = 16
    val name = "GenaffCitizenResidentReligionEthnicity"
  }
  
  case object GenaffOrgLocation extends RelationType {
    val value = 17
    val name = "GenaffOrgLocation"
  }
  
  case object BusinessDeclareBankruptcy extends RelationType {
    val value = 18
    val name = "BusinessDeclareBankruptcy"
  }
  
  case object BusinessEndOrg extends RelationType {
    val value = 19
    val name = "BusinessEndOrg"
  }
  
  case object BusinessMergeOrg extends RelationType {
    val value = 20
    val name = "BusinessMergeOrg"
  }
  
  case object BusinessStartOrg extends RelationType {
    val value = 21
    val name = "BusinessStartOrg"
  }
  
  case object ConflictAttack extends RelationType {
    val value = 22
    val name = "ConflictAttack"
  }
  
  case object ConflictDemonstrate extends RelationType {
    val value = 23
    val name = "ConflictDemonstrate"
  }
  
  case object ContactPhoneWrite extends RelationType {
    val value = 24
    val name = "ContactPhoneWrite"
  }
  
  case object ContactMeet extends RelationType {
    val value = 25
    val name = "ContactMeet"
  }
  
  case object JusticeAcquit extends RelationType {
    val value = 26
    val name = "JusticeAcquit"
  }
  
  case object JusticeAppeal extends RelationType {
    val value = 27
    val name = "JusticeAppeal"
  }
  
  case object JusticeArrestJail extends RelationType {
    val value = 28
    val name = "JusticeArrestJail"
  }
  
  case object JusticeChargeIndict extends RelationType {
    val value = 29
    val name = "JusticeChargeIndict"
  }
  
  case object JusticeConvict extends RelationType {
    val value = 30
    val name = "JusticeConvict"
  }
  
  case object JusticeExecute extends RelationType {
    val value = 31
    val name = "JusticeExecute"
  }
  
  case object JusticeExtradite extends RelationType {
    val value = 32
    val name = "JusticeExtradite"
  }
  
  case object JusticeFine extends RelationType {
    val value = 33
    val name = "JusticeFine"
  }
  
  case object JusticePardon extends RelationType {
    val value = 34
    val name = "JusticePardon"
  }
  
  case object JusticeReleaseParole extends RelationType {
    val value = 35
    val name = "JusticeReleaseParole"
  }
  
  case object JusticeSentence extends RelationType {
    val value = 36
    val name = "JusticeSentence"
  }
  
  case object JusticeSue extends RelationType {
    val value = 37
    val name = "JusticeSue"
  }
  
  case object JusticeTrialHearing extends RelationType {
    val value = 38
    val name = "JusticeTrialHearing"
  }
  
  case object LifeBeBorn extends RelationType {
    val value = 39
    val name = "LifeBeBorn"
  }
  
  case object LifeDie extends RelationType {
    val value = 40
    val name = "LifeDie"
  }
  
  case object LifeDivorce extends RelationType {
    val value = 41
    val name = "LifeDivorce"
  }
  
  case object LifeInjure extends RelationType {
    val value = 42
    val name = "LifeInjure"
  }
  
  case object LifeMarry extends RelationType {
    val value = 43
    val name = "LifeMarry"
  }
  
  case object MovementTransport extends RelationType {
    val value = 44
    val name = "MovementTransport"
  }
  
  case object PersonnelElect extends RelationType {
    val value = 45
    val name = "PersonnelElect"
  }
  
  case object PersonnelEndPosition extends RelationType {
    val value = 46
    val name = "PersonnelEndPosition"
  }
  
  case object PersonnelNominate extends RelationType {
    val value = 47
    val name = "PersonnelNominate"
  }
  
  case object PersonnelStartPosition extends RelationType {
    val value = 48
    val name = "PersonnelStartPosition"
  }
  
  case object TransactionTransferMoney extends RelationType {
    val value = 49
    val name = "TransactionTransferMoney"
  }
  
  case object TransactionTransferOwnership extends RelationType {
    val value = 50
    val name = "TransactionTransferOwnership"
  }

  /**
   * Find the enum by its integer value, as defined in the Thrift IDL.
   * @throws NoSuchElementException if the value is not found.
   */
  def apply(value: Int): RelationType = {
    value match {
      case 0 => PhysLocated
      case 1 => PhysNear
      case 2 => PartwholeGeographical
      case 3 => PartwholeSubsidiary
      case 4 => PartwholeArtifact
      case 5 => PersocBusiness
      case 6 => PersocFamily
      case 7 => PersocLastingPersonal
      case 8 => OrgaffEmployment
      case 9 => OrgaffOwnership
      case 10 => OrgaffFounder
      case 11 => OrgaffStudentAlum
      case 12 => OrgaffSportsAffiliation
      case 13 => OrgaffInvestorShareholder
      case 14 => OrgaffMembership
      case 15 => ArtUserOwnerInventorManufacturer
      case 16 => GenaffCitizenResidentReligionEthnicity
      case 17 => GenaffOrgLocation
      case 18 => BusinessDeclareBankruptcy
      case 19 => BusinessEndOrg
      case 20 => BusinessMergeOrg
      case 21 => BusinessStartOrg
      case 22 => ConflictAttack
      case 23 => ConflictDemonstrate
      case 24 => ContactPhoneWrite
      case 25 => ContactMeet
      case 26 => JusticeAcquit
      case 27 => JusticeAppeal
      case 28 => JusticeArrestJail
      case 29 => JusticeChargeIndict
      case 30 => JusticeConvict
      case 31 => JusticeExecute
      case 32 => JusticeExtradite
      case 33 => JusticeFine
      case 34 => JusticePardon
      case 35 => JusticeReleaseParole
      case 36 => JusticeSentence
      case 37 => JusticeSue
      case 38 => JusticeTrialHearing
      case 39 => LifeBeBorn
      case 40 => LifeDie
      case 41 => LifeDivorce
      case 42 => LifeInjure
      case 43 => LifeMarry
      case 44 => MovementTransport
      case 45 => PersonnelElect
      case 46 => PersonnelEndPosition
      case 47 => PersonnelNominate
      case 48 => PersonnelStartPosition
      case 49 => TransactionTransferMoney
      case 50 => TransactionTransferOwnership
      case _ => throw new NoSuchElementException(value.toString)
    }
  }

  /**
   * Find the enum by its integer value, as defined in the Thrift IDL.
   * Returns None if the value is not found
   */
  def get(value: Int): Option[RelationType] = {
    value match {
      case 0 => scala.Some(PhysLocated)
      case 1 => scala.Some(PhysNear)
      case 2 => scala.Some(PartwholeGeographical)
      case 3 => scala.Some(PartwholeSubsidiary)
      case 4 => scala.Some(PartwholeArtifact)
      case 5 => scala.Some(PersocBusiness)
      case 6 => scala.Some(PersocFamily)
      case 7 => scala.Some(PersocLastingPersonal)
      case 8 => scala.Some(OrgaffEmployment)
      case 9 => scala.Some(OrgaffOwnership)
      case 10 => scala.Some(OrgaffFounder)
      case 11 => scala.Some(OrgaffStudentAlum)
      case 12 => scala.Some(OrgaffSportsAffiliation)
      case 13 => scala.Some(OrgaffInvestorShareholder)
      case 14 => scala.Some(OrgaffMembership)
      case 15 => scala.Some(ArtUserOwnerInventorManufacturer)
      case 16 => scala.Some(GenaffCitizenResidentReligionEthnicity)
      case 17 => scala.Some(GenaffOrgLocation)
      case 18 => scala.Some(BusinessDeclareBankruptcy)
      case 19 => scala.Some(BusinessEndOrg)
      case 20 => scala.Some(BusinessMergeOrg)
      case 21 => scala.Some(BusinessStartOrg)
      case 22 => scala.Some(ConflictAttack)
      case 23 => scala.Some(ConflictDemonstrate)
      case 24 => scala.Some(ContactPhoneWrite)
      case 25 => scala.Some(ContactMeet)
      case 26 => scala.Some(JusticeAcquit)
      case 27 => scala.Some(JusticeAppeal)
      case 28 => scala.Some(JusticeArrestJail)
      case 29 => scala.Some(JusticeChargeIndict)
      case 30 => scala.Some(JusticeConvict)
      case 31 => scala.Some(JusticeExecute)
      case 32 => scala.Some(JusticeExtradite)
      case 33 => scala.Some(JusticeFine)
      case 34 => scala.Some(JusticePardon)
      case 35 => scala.Some(JusticeReleaseParole)
      case 36 => scala.Some(JusticeSentence)
      case 37 => scala.Some(JusticeSue)
      case 38 => scala.Some(JusticeTrialHearing)
      case 39 => scala.Some(LifeBeBorn)
      case 40 => scala.Some(LifeDie)
      case 41 => scala.Some(LifeDivorce)
      case 42 => scala.Some(LifeInjure)
      case 43 => scala.Some(LifeMarry)
      case 44 => scala.Some(MovementTransport)
      case 45 => scala.Some(PersonnelElect)
      case 46 => scala.Some(PersonnelEndPosition)
      case 47 => scala.Some(PersonnelNominate)
      case 48 => scala.Some(PersonnelStartPosition)
      case 49 => scala.Some(TransactionTransferMoney)
      case 50 => scala.Some(TransactionTransferOwnership)
      case _ => scala.None
    }
  }

  def valueOf(name: String): Option[RelationType] = {
    name.toLowerCase match {
      case "physlocated" => scala.Some(RelationType.PhysLocated)
      case "physnear" => scala.Some(RelationType.PhysNear)
      case "partwholegeographical" => scala.Some(RelationType.PartwholeGeographical)
      case "partwholesubsidiary" => scala.Some(RelationType.PartwholeSubsidiary)
      case "partwholeartifact" => scala.Some(RelationType.PartwholeArtifact)
      case "persocbusiness" => scala.Some(RelationType.PersocBusiness)
      case "persocfamily" => scala.Some(RelationType.PersocFamily)
      case "persoclastingpersonal" => scala.Some(RelationType.PersocLastingPersonal)
      case "orgaffemployment" => scala.Some(RelationType.OrgaffEmployment)
      case "orgaffownership" => scala.Some(RelationType.OrgaffOwnership)
      case "orgafffounder" => scala.Some(RelationType.OrgaffFounder)
      case "orgaffstudentalum" => scala.Some(RelationType.OrgaffStudentAlum)
      case "orgaffsportsaffiliation" => scala.Some(RelationType.OrgaffSportsAffiliation)
      case "orgaffinvestorshareholder" => scala.Some(RelationType.OrgaffInvestorShareholder)
      case "orgaffmembership" => scala.Some(RelationType.OrgaffMembership)
      case "artuserownerinventormanufacturer" => scala.Some(RelationType.ArtUserOwnerInventorManufacturer)
      case "genaffcitizenresidentreligionethnicity" => scala.Some(RelationType.GenaffCitizenResidentReligionEthnicity)
      case "genafforglocation" => scala.Some(RelationType.GenaffOrgLocation)
      case "businessdeclarebankruptcy" => scala.Some(RelationType.BusinessDeclareBankruptcy)
      case "businessendorg" => scala.Some(RelationType.BusinessEndOrg)
      case "businessmergeorg" => scala.Some(RelationType.BusinessMergeOrg)
      case "businessstartorg" => scala.Some(RelationType.BusinessStartOrg)
      case "conflictattack" => scala.Some(RelationType.ConflictAttack)
      case "conflictdemonstrate" => scala.Some(RelationType.ConflictDemonstrate)
      case "contactphonewrite" => scala.Some(RelationType.ContactPhoneWrite)
      case "contactmeet" => scala.Some(RelationType.ContactMeet)
      case "justiceacquit" => scala.Some(RelationType.JusticeAcquit)
      case "justiceappeal" => scala.Some(RelationType.JusticeAppeal)
      case "justicearrestjail" => scala.Some(RelationType.JusticeArrestJail)
      case "justicechargeindict" => scala.Some(RelationType.JusticeChargeIndict)
      case "justiceconvict" => scala.Some(RelationType.JusticeConvict)
      case "justiceexecute" => scala.Some(RelationType.JusticeExecute)
      case "justiceextradite" => scala.Some(RelationType.JusticeExtradite)
      case "justicefine" => scala.Some(RelationType.JusticeFine)
      case "justicepardon" => scala.Some(RelationType.JusticePardon)
      case "justicereleaseparole" => scala.Some(RelationType.JusticeReleaseParole)
      case "justicesentence" => scala.Some(RelationType.JusticeSentence)
      case "justicesue" => scala.Some(RelationType.JusticeSue)
      case "justicetrialhearing" => scala.Some(RelationType.JusticeTrialHearing)
      case "lifebeborn" => scala.Some(RelationType.LifeBeBorn)
      case "lifedie" => scala.Some(RelationType.LifeDie)
      case "lifedivorce" => scala.Some(RelationType.LifeDivorce)
      case "lifeinjure" => scala.Some(RelationType.LifeInjure)
      case "lifemarry" => scala.Some(RelationType.LifeMarry)
      case "movementtransport" => scala.Some(RelationType.MovementTransport)
      case "personnelelect" => scala.Some(RelationType.PersonnelElect)
      case "personnelendposition" => scala.Some(RelationType.PersonnelEndPosition)
      case "personnelnominate" => scala.Some(RelationType.PersonnelNominate)
      case "personnelstartposition" => scala.Some(RelationType.PersonnelStartPosition)
      case "transactiontransfermoney" => scala.Some(RelationType.TransactionTransferMoney)
      case "transactiontransferownership" => scala.Some(RelationType.TransactionTransferOwnership)
      case _ => scala.None
    }
  }

  lazy val list: List[RelationType] = scala.List[RelationType](
    PhysLocated,
    PhysNear,
    PartwholeGeographical,
    PartwholeSubsidiary,
    PartwholeArtifact,
    PersocBusiness,
    PersocFamily,
    PersocLastingPersonal,
    OrgaffEmployment,
    OrgaffOwnership,
    OrgaffFounder,
    OrgaffStudentAlum,
    OrgaffSportsAffiliation,
    OrgaffInvestorShareholder,
    OrgaffMembership,
    ArtUserOwnerInventorManufacturer,
    GenaffCitizenResidentReligionEthnicity,
    GenaffOrgLocation,
    BusinessDeclareBankruptcy,
    BusinessEndOrg,
    BusinessMergeOrg,
    BusinessStartOrg,
    ConflictAttack,
    ConflictDemonstrate,
    ContactPhoneWrite,
    ContactMeet,
    JusticeAcquit,
    JusticeAppeal,
    JusticeArrestJail,
    JusticeChargeIndict,
    JusticeConvict,
    JusticeExecute,
    JusticeExtradite,
    JusticeFine,
    JusticePardon,
    JusticeReleaseParole,
    JusticeSentence,
    JusticeSue,
    JusticeTrialHearing,
    LifeBeBorn,
    LifeDie,
    LifeDivorce,
    LifeInjure,
    LifeMarry,
    MovementTransport,
    PersonnelElect,
    PersonnelEndPosition,
    PersonnelNominate,
    PersonnelStartPosition,
    TransactionTransferMoney,
    TransactionTransferOwnership
  )
}


/**
 * RelationType is used in Relation to map relation "name" to type.
 * This list borrows from ACE with these string replacements: s/-//
 * and s/./_/
 *
 * http://projects.ldc.upenn.edu/ace/docs/English-Events-Guidelines_v5.4.3.pdf
 */
@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"), date = "2013-08-12T15:12:53.355-0400")
sealed trait RelationType extends ThriftEnum with Serializable