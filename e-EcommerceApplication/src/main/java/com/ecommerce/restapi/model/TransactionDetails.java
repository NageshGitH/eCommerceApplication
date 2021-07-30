package com.ecommerce.restapi.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="transaction_details")
public class TransactionDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="transaction_id")
	private long transactionId;
	@Column(name="amount")
	private double amount;
	@Column(name="from_account")
	private long fromAccount;
	@Column(name="to_account")
	private long toAccount;
	@Column(name="transaction_time")
	private Timestamp transactionTime;
	@Column(name="transaction_type")
	private String transactionType;
	@Column(name="remarks")
	private String remarks;
}
