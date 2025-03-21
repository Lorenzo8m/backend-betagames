package com.betagames.service.interfaces;

import java.util.List;

import com.betagames.dto.DetailsOrderDTO;
import com.betagames.request.DetailsOrderRequest;

/**
 * 
 * @author Simone Checco
 */
public interface IDetailsOrderService {

    List<DetailsOrderDTO> searchByOrder(Integer id) throws Exception;

}
