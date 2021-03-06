/*
 * Copyright (C) 2015 The Holodeck B2B Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.holodeckb2b.common.testhelpers.pmode;

import org.holodeckb2b.interfaces.pmode.security.IUsernameTokenConfiguration;

/**
 * @author Sander Fieten (sander at holodeck-b2b.org)
 */
public class UsernameTokenConfig implements IUsernameTokenConfiguration {

    private String          username;
    private String          password;
    private PasswordType    pwdType;
    private boolean         includeNonce;
    private boolean         includeCreated;

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @Override
    public PasswordType getPasswordType() {
        return pwdType;
    }

    public void setPasswordType(final PasswordType pwdType) {
        this.pwdType = pwdType;
    }

    @Override
    public boolean includeNonce() {
        return includeNonce;
    }

    public void setIncludeNonce(final boolean includeNonce) {
        this.includeNonce = includeNonce;
    }

    @Override
    public boolean includeCreated() {
        return includeCreated;
    }

    public void setIncludeCreated(final boolean includeCreated) {
        this.includeCreated = includeCreated;
    }

}
