package ru.grigoriev.dao_withh_hibernate.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
public class Controller {

    @GetMapping("/read")
    @Secured({"ROLE_READ"})
    public String getRead() {
        return "In read";
    }

    @GetMapping("/write")
    @RolesAllowed({"ROLE_WRITE"})
    public String getWrite() {
        return "In write";
    }
    @GetMapping("/read-or-write")
    @PreAuthorize("hasAnyRole('WRITE') || hasAnyRole('DELETE')")
    public String getReadOrWrite() {
        return "In read-or-write";
    }

    @GetMapping("/username")
    @PreAuthorize("#username == authentication.principal.username")
    public String getUserName(@RequestParam("username") String username) {
        return "In username";
    }
}


