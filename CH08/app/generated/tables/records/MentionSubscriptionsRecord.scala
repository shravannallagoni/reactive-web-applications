/**
 * This class is generated by jOOQ
 */
package generated.tables.records


import generated.tables.MentionSubscriptions

import java.lang.Long
import java.sql.Timestamp

import javax.annotation.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = Array(
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	),
	comments = "This class is generated by jOOQ"
)
class MentionSubscriptionsRecord extends UpdatableRecordImpl[MentionSubscriptionsRecord](MentionSubscriptions.MENTION_SUBSCRIPTIONS) with Record3[Long, Timestamp, Long] {

	/**
	 * Setter for <code>public.mention_subscriptions.id</code>.
	 */
	def setId(value : Long) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>public.mention_subscriptions.id</code>.
	 */
	def getId : Long = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[Long]
	}

	/**
	 * Setter for <code>public.mention_subscriptions.created_on</code>.
	 */
	def setCreatedOn(value : Timestamp) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>public.mention_subscriptions.created_on</code>.
	 */
	def getCreatedOn : Timestamp = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[Timestamp]
	}

	/**
	 * Setter for <code>public.mention_subscriptions.user_id</code>.
	 */
	def setUserId(value : Long) : Unit = {
		setValue(2, value)
	}

	/**
	 * Getter for <code>public.mention_subscriptions.user_id</code>.
	 */
	def getUserId : Long = {
		val r = getValue(2)
		if (r == null) null else r.asInstanceOf[Long]
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------
	override def key() : Record1[Long] = {
		return super.key.asInstanceOf[ Record1[Long] ]
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row3[Long, Timestamp, Long] = {
		super.fieldsRow.asInstanceOf[ Row3[Long, Timestamp, Long] ]
	}

	override def valuesRow : Row3[Long, Timestamp, Long] = {
		super.valuesRow.asInstanceOf[ Row3[Long, Timestamp, Long] ]
	}
	override def field1 : Field[Long] = MentionSubscriptions.MENTION_SUBSCRIPTIONS.ID
	override def field2 : Field[Timestamp] = MentionSubscriptions.MENTION_SUBSCRIPTIONS.CREATED_ON
	override def field3 : Field[Long] = MentionSubscriptions.MENTION_SUBSCRIPTIONS.USER_ID
	override def value1 : Long = getId
	override def value2 : Timestamp = getCreatedOn
	override def value3 : Long = getUserId

	override def value1(value : Long) : MentionSubscriptionsRecord = {
		setId(value)
		this
	}

	override def value2(value : Timestamp) : MentionSubscriptionsRecord = {
		setCreatedOn(value)
		this
	}

	override def value3(value : Long) : MentionSubscriptionsRecord = {
		setUserId(value)
		this
	}

	override def values(value1 : Long, value2 : Timestamp, value3 : Long) : MentionSubscriptionsRecord = {
		this.value1(value1)
		this.value2(value2)
		this.value3(value3)
		this
	}

	/**
	 * Create a detached, initialised MentionSubscriptionsRecord
	 */
	def this(id : Long, createdOn : Timestamp, userId : Long) = {
		this()

		setValue(0, id)
		setValue(1, createdOn)
		setValue(2, userId)
	}
}
