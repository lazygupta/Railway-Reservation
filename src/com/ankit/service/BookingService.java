package com.ankit.service;

import java.util.List;

import com.ankit.beans.HistoryBean;
import com.ankit.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
