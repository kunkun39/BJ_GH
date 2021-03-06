package com.changhong.system.domain;

import com.changhong.common.domain.EntityBase;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: Jack Wang
 * Date: 14-4-9
 * Time: 上午9:15
 */
public class User extends EntityBase implements UserDetails {
    private String name;
    private String contactWay;

    private String username;
    private String password;
    private boolean enabled = true;

    public User() {
    }

    public User(String name, String contactWay, String username, String password) {
        this.name = name;
        this.contactWay = contactWay;
        this.username = username;
        this.password = password;
        this.enabled = true;
    }

    /*************************************************GETTER**********************************************************/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public Collection<GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        Role role = new Role("ROLE_SYSTEM");
        grantedAuthorities.add(role);
        return grantedAuthorities;
    }
}
