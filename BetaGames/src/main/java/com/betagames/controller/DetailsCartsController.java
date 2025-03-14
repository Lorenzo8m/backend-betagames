package com.betagames.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.betagames.dto.DetailsCartDTO;
import com.betagames.request.DetailsCartRequest;
import com.betagames.response.ResponseBase;
import com.betagames.response.ResponseList;
import com.betagames.service.interfaces.IDetailsCartsService;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/rest/")
@CrossOrigin(origins = "*")
public class DetailsCartsController {

    @Autowired
    Logger log;

    @Autowired
    IDetailsCartsService detailsCartsService;

    @PostMapping("user/detailsCarts/create")
    public ResponseBase create(@RequestBody(required = true) DetailsCartRequest req) {
        ResponseBase response = new ResponseBase();
        response.setRc(true);
        try {
            detailsCartsService.create(req);
            response.setMsg("Successfully created detailsCart");
        } catch (Exception e) {
            log.error("Failed to create detailsCart" + e.getMessage());
            response.setMsg(e.getMessage());
            response.setRc(false);
        }
        return response;
    }

    @PostMapping("user/detailsCarts/update")
    public ResponseBase update(@RequestBody(required = true) DetailsCartRequest req) {
        ResponseBase response = new ResponseBase();
        response.setRc(true);
        try {
            detailsCartsService.update(req);
            response.setMsg("Successfully updated detailsCart");
        } catch (Exception e) {
            log.error("Failed to update detailsCart" + e.getMessage());
            response.setMsg(e.getMessage());
            response.setRc(false);
        }
        return response;
    }

    @PostMapping("user/detailsCarts/delete")
    public ResponseBase delete(@RequestBody(required = true) DetailsCartRequest req) {
        ResponseBase response = new ResponseBase();
        response.setRc(true);
        try {
            detailsCartsService.delete(req);
            response.setMsg("Successfully delete detailsCart");
        } catch (Exception e) {
            log.error("Failed to update detailsCart" + e.getMessage());
            response.setMsg(e.getMessage());
            response.setRc(false);
        }
        return response;
    }

    @PostMapping("user/detailsCarts/deleteAllByCart")
    public ResponseBase deleteAllByCart(@RequestBody(required = true) DetailsCartRequest req) {
        ResponseBase response = new ResponseBase();
        response.setRc(true);
        try {
            detailsCartsService.deleteAllByCart(req);
            response.setMsg("Successfully delete all detailsCart");
        } catch (Exception e) {
            log.error("Failed to update detailsCart" + e.getMessage());
            response.setMsg(e.getMessage());
            response.setRc(false);
        }
        return response;
    }
    
    @GetMapping("admin/detailsCarts/list")
    public ResponseList<DetailsCartDTO> list() {
        ResponseList<DetailsCartDTO> response = new ResponseList<DetailsCartDTO>();
        response.setRc(true);
        try {
            response.setData(detailsCartsService.list());
        } catch (Exception e) {
            log.error(e.getMessage());
            response.setMsg(e.getMessage());
            response.setRc(false);
        }
        return response;
    }
    @GetMapping("user/detailsCarts/listByCarts")
    public ResponseList<DetailsCartDTO> listByCarts(@RequestParam("id") Integer id) {
        ResponseList<DetailsCartDTO> response = new ResponseList<DetailsCartDTO>();
        response.setRc(true);
        try {
            response.setData(detailsCartsService.listByCarts(id));
        } catch (Exception e) {
            log.error(e.getMessage());
            response.setMsg(e.getMessage());
            response.setRc(false);
        }
        return response;
    }
}
