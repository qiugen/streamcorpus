/**
 * generated by Scrooge ${project.version}
 */
package streamcorpus

import com.twitter.scrooge.{
  ThriftException, ThriftStruct, ThriftStructCodec3}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport}
import java.nio.ByteBuffer
import scala.collection.mutable
import scala.collection.{Map, Set}


object Tagging extends ThriftStructCodec3[Tagging] {
  val Struct = new TStruct("Tagging")
  val TaggerIdField = new TField("tagger_id", TType.STRING, 1)
  val RawTaggingField = new TField("raw_tagging", TType.STRING, 2)
  val TaggerConfigField = new TField("tagger_config", TType.STRING, 3)
  val TaggerVersionField = new TField("tagger_version", TType.STRING, 4)
  val GenerationTimeField = new TField("generation_time", TType.STRUCT, 5)

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: Tagging) {
  }

  override def encode(_item: Tagging, _oproto: TProtocol) { _item.write(_oproto) }
  override def decode(_iprot: TProtocol): Tagging = Immutable.decode(_iprot)

  def apply(
    taggerId: String,
    rawTagging: ByteBuffer,
    taggerConfig: Option[String] = None,
    taggerVersion: Option[String] = None,
    generationTime: Option[StreamTime] = None
  ): Tagging = new Immutable(
    taggerId,
    rawTagging,
    taggerConfig,
    taggerVersion,
    generationTime
  )

  def unapply(_item: Tagging): Option[Product5[String, ByteBuffer, Option[String], Option[String], Option[StreamTime]]] = Some(_item)

  object Immutable extends ThriftStructCodec3[Tagging] {
    override def encode(_item: Tagging, _oproto: TProtocol) { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): Tagging = {
      var taggerId: String = null
      var _got_taggerId = false
      var rawTagging: ByteBuffer = null
      var _got_rawTagging = false
      var taggerConfig: String = null
      var _got_taggerConfig = false
      var taggerVersion: String = null
      var _got_taggerVersion = false
      var generationTime: StreamTime = null
      var _got_generationTime = false
      var _done = false
      _iprot.readStructBegin()
      while (!_done) {
        val _field = _iprot.readFieldBegin()
        if (_field.`type` == TType.STOP) {
          _done = true
        } else {
          _field.id match {
            case 1 => { /* taggerId */
              _field.`type` match {
                case TType.STRING => {
                  taggerId = {
                    _iprot.readString()
                  }
                  _got_taggerId = true
                }
                case _ => TProtocolUtil.skip(_iprot, _field.`type`)
              }
            }
            case 2 => { /* rawTagging */
              _field.`type` match {
                case TType.STRING => {
                  rawTagging = {
                    _iprot.readBinary()
                  }
                  _got_rawTagging = true
                }
                case _ => TProtocolUtil.skip(_iprot, _field.`type`)
              }
            }
            case 3 => { /* taggerConfig */
              _field.`type` match {
                case TType.STRING => {
                  taggerConfig = {
                    _iprot.readString()
                  }
                  _got_taggerConfig = true
                }
                case _ => TProtocolUtil.skip(_iprot, _field.`type`)
              }
            }
            case 4 => { /* taggerVersion */
              _field.`type` match {
                case TType.STRING => {
                  taggerVersion = {
                    _iprot.readString()
                  }
                  _got_taggerVersion = true
                }
                case _ => TProtocolUtil.skip(_iprot, _field.`type`)
              }
            }
            case 5 => { /* generationTime */
              _field.`type` match {
                case TType.STRUCT => {
                  generationTime = {
                    streamcorpus.StreamTime.decode(_iprot)
                  }
                  _got_generationTime = true
                }
                case _ => TProtocolUtil.skip(_iprot, _field.`type`)
              }
            }
            case _ =>
              TProtocolUtil.skip(_iprot, _field.`type`)
          }
          _iprot.readFieldEnd()
        }
      }
      _iprot.readStructEnd()
      new Immutable(
        taggerId,
        rawTagging,
        if (_got_taggerConfig) Some(taggerConfig) else None,
        if (_got_taggerVersion) Some(taggerVersion) else None,
        if (_got_generationTime) Some(generationTime) else None
      )
    }
  }

  /**
   * The default read-only implementation of Tagging.  You typically should not need to
   * directly reference this class; instead, use the Tagging.apply method to construct
   * new instances.
   */
  class Immutable(
    val taggerId: String,
    val rawTagging: ByteBuffer,
    val taggerConfig: Option[String] = None,
    val taggerVersion: Option[String] = None,
    val generationTime: Option[StreamTime] = None
  ) extends Tagging

  /**
   * This Proxy trait allows you to extend the Tagging trait with additional state or
   * behavior and implement the read-only methods from Tagging using an underlying
   * instance.
   */
  trait Proxy extends Tagging {
    protected def _underlying_Tagging: Tagging
    def taggerId: String = _underlying_Tagging.taggerId
    def rawTagging: ByteBuffer = _underlying_Tagging.rawTagging
    def taggerConfig: Option[String] = _underlying_Tagging.taggerConfig
    def taggerVersion: Option[String] = _underlying_Tagging.taggerVersion
    def generationTime: Option[StreamTime] = _underlying_Tagging.generationTime
  }
}

trait Tagging extends ThriftStruct
  with Product5[String, ByteBuffer, Option[String], Option[String], Option[StreamTime]]
  with java.io.Serializable
{
  import Tagging._

  def withoutPassthroughs(f: TField => Boolean) = this
  def withPassthroughs(pts: TraversableOnce[(TField, TTransport)]) = this

  def taggerId: String
  def rawTagging: ByteBuffer
  def taggerConfig: Option[String]
  def taggerVersion: Option[String]
  def generationTime: Option[StreamTime]

  def _1 = taggerId
  def _2 = rawTagging
  def _3 = taggerConfig
  def _4 = taggerVersion
  def _5 = generationTime

  override def write(_oprot: TProtocol) {
    Tagging.validate(this)
    _oprot.writeStructBegin(Struct)
    if (taggerId ne null) {
      val taggerId_item = taggerId
      _oprot.writeFieldBegin(TaggerIdField)
      _oprot.writeString(taggerId_item)
      _oprot.writeFieldEnd()
    }
    if (rawTagging ne null) {
      val rawTagging_item = rawTagging
      _oprot.writeFieldBegin(RawTaggingField)
      _oprot.writeBinary(rawTagging_item)
      _oprot.writeFieldEnd()
    }
    if (taggerConfig.isDefined) {
      val taggerConfig_item = taggerConfig.get
      _oprot.writeFieldBegin(TaggerConfigField)
      _oprot.writeString(taggerConfig_item)
      _oprot.writeFieldEnd()
    }
    if (taggerVersion.isDefined) {
      val taggerVersion_item = taggerVersion.get
      _oprot.writeFieldBegin(TaggerVersionField)
      _oprot.writeString(taggerVersion_item)
      _oprot.writeFieldEnd()
    }
    if (generationTime.isDefined) {
      val generationTime_item = generationTime.get
      _oprot.writeFieldBegin(GenerationTimeField)
      generationTime_item.write(_oprot)
      _oprot.writeFieldEnd()
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    taggerId: String = this.taggerId, 
    rawTagging: ByteBuffer = this.rawTagging, 
    taggerConfig: Option[String] = this.taggerConfig, 
    taggerVersion: Option[String] = this.taggerVersion, 
    generationTime: Option[StreamTime] = this.generationTime
  ): Tagging =
    new Immutable(
      taggerId, 
      rawTagging, 
      taggerConfig, 
      taggerVersion, 
      generationTime
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[Tagging]

  override def equals(other: Any): Boolean = _root_.scala.runtime.ScalaRunTime._equals(this, other)

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 5

  override def productElement(n: Int): Any = n match {
    case 0 => taggerId
    case 1 => rawTagging
    case 2 => taggerConfig
    case 3 => taggerVersion
    case 4 => generationTime
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "Tagging"
}