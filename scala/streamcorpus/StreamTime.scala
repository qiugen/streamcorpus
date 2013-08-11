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

/**
 * StreamTime is a timestamp measured in seconds since the 1970 epoch.
 * epoch_ticks is always in the UTC timezone.  This is used in several
 * structs below to record various moments in history.
 *
 * Implementations of these interfaces in various languages may
 * provide convenience methods for insuring that these two fields are
 * consistent with each other.
 */
object StreamTime extends ThriftStructCodec3[StreamTime] {
  val Struct = new TStruct("StreamTime")
  val EpochTicksField = new TField("epoch_ticks", TType.DOUBLE, 1)
  val ZuluTimestampField = new TField("zulu_timestamp", TType.STRING, 2)

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: StreamTime) {
  }

  override def encode(_item: StreamTime, _oproto: TProtocol) { _item.write(_oproto) }
  override def decode(_iprot: TProtocol): StreamTime = Immutable.decode(_iprot)

  def apply(
    epochTicks: Double,
    zuluTimestamp: String
  ): StreamTime = new Immutable(
    epochTicks,
    zuluTimestamp
  )

  def unapply(_item: StreamTime): Option[Product2[Double, String]] = Some(_item)

  object Immutable extends ThriftStructCodec3[StreamTime] {
    override def encode(_item: StreamTime, _oproto: TProtocol) { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): StreamTime = {
      var epochTicks: Double = 0.0
      var _got_epochTicks = false
      var zuluTimestamp: String = null
      var _got_zuluTimestamp = false
      var _done = false
      _iprot.readStructBegin()
      while (!_done) {
        val _field = _iprot.readFieldBegin()
        if (_field.`type` == TType.STOP) {
          _done = true
        } else {
          _field.id match {
            case 1 => { /* epochTicks */
              _field.`type` match {
                case TType.DOUBLE => {
                  epochTicks = {
                    _iprot.readDouble()
                  }
                  _got_epochTicks = true
                }
                case _ => TProtocolUtil.skip(_iprot, _field.`type`)
              }
            }
            case 2 => { /* zuluTimestamp */
              _field.`type` match {
                case TType.STRING => {
                  zuluTimestamp = {
                    _iprot.readString()
                  }
                  _got_zuluTimestamp = true
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
        epochTicks,
        zuluTimestamp
      )
    }
  }

  /**
   * The default read-only implementation of StreamTime.  You typically should not need to
   * directly reference this class; instead, use the StreamTime.apply method to construct
   * new instances.
   */
  class Immutable(
    val epochTicks: Double,
    val zuluTimestamp: String
  ) extends StreamTime

  /**
   * This Proxy trait allows you to extend the StreamTime trait with additional state or
   * behavior and implement the read-only methods from StreamTime using an underlying
   * instance.
   */
  trait Proxy extends StreamTime {
    protected def _underlying_StreamTime: StreamTime
    def epochTicks: Double = _underlying_StreamTime.epochTicks
    def zuluTimestamp: String = _underlying_StreamTime.zuluTimestamp
  }
}

trait StreamTime extends ThriftStruct
  with Product2[Double, String]
  with java.io.Serializable
{
  import StreamTime._

  def withoutPassthroughs(f: TField => Boolean) = this
  def withPassthroughs(pts: TraversableOnce[(TField, TTransport)]) = this

  def epochTicks: Double
  def zuluTimestamp: String

  def _1 = epochTicks
  def _2 = zuluTimestamp

  override def write(_oprot: TProtocol) {
    StreamTime.validate(this)
    _oprot.writeStructBegin(Struct)
    if (true) {
      val epochTicks_item = epochTicks
      _oprot.writeFieldBegin(EpochTicksField)
      _oprot.writeDouble(epochTicks_item)
      _oprot.writeFieldEnd()
    }
    if (zuluTimestamp ne null) {
      val zuluTimestamp_item = zuluTimestamp
      _oprot.writeFieldBegin(ZuluTimestampField)
      _oprot.writeString(zuluTimestamp_item)
      _oprot.writeFieldEnd()
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    epochTicks: Double = this.epochTicks, 
    zuluTimestamp: String = this.zuluTimestamp
  ): StreamTime =
    new Immutable(
      epochTicks, 
      zuluTimestamp
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[StreamTime]

  override def equals(other: Any): Boolean = _root_.scala.runtime.ScalaRunTime._equals(this, other)

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 2

  override def productElement(n: Int): Any = n match {
    case 0 => epochTicks
    case 1 => zuluTimestamp
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "StreamTime"
}