package com.betagames.service.implementation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betagames.dto.RolesDTO;
import com.betagames.model.Roles;
import com.betagames.repository.IRolesRepository;
import com.betagames.request.RolesRequest;
import com.betagames.service.interfaces.IRolesService;
/*
 * 
 * @author Simone Checco
 */
import com.betagames.service.interfaces.IServiceMessagesService;

@Service
public class RolesImplementation implements IRolesService {

    @Autowired
    IServiceMessagesService serviceMessagesService;
    @Autowired
    IRolesRepository rolesRep;

    @Override
    public List<RolesDTO> listRoles() throws Exception {
        List<Roles> listRoles = rolesRep.findAll();

        return listRoles.stream()
                .map(role -> new RolesDTO(role.getId(), role.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public void create(RolesRequest req) throws Exception {

        if (req.getName().equalsIgnoreCase("")) {
            throw new Exception(serviceMessagesService.getMessage("roles-empty"));
        }
        Optional<Roles> role = rolesRep.findByName(req.getName());
        if (role.isPresent()) {
            throw new Exception(serviceMessagesService.getMessage("roles-Name"));
        }
        Roles r = new Roles();
        r.setName(req.getName());
        rolesRep.save(r);
    }

    @Override
    public void update(RolesRequest req) throws Exception {
        Optional<Roles> roles = rolesRep.findById(req.getId());
        if (roles.isEmpty()) {
            throw new Exception(serviceMessagesService.getMessage("roles_Id"));
        }
        Roles r = roles.get();
        r.setName(req.getName());
        rolesRep.save(r);
    }

    @Override
    public void delete(RolesRequest req) throws Exception {
        Optional<Roles> roles = rolesRep.findById(req.getId());

        if (roles.isEmpty()) {
            throw new Exception(serviceMessagesService.getMessage("roles_Id"));
        }

        Roles r = roles.get();
        rolesRep.delete(r);
    }

}
