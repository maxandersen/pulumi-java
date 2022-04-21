// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information on the client (user or application) that made some action
 * 
 */
public final class ClientInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final ClientInfoResponse Empty = new ClientInfoResponse();

    /**
     * The email of the client.
     * 
     */
    @Import(name="email")
    private @Nullable String email;

    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * The name of the client.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The object id of the client.
     * 
     */
    @Import(name="objectId")
    private @Nullable String objectId;

    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    /**
     * The user principal name of the client.
     * 
     */
    @Import(name="userPrincipalName")
    private @Nullable String userPrincipalName;

    public Optional<String> userPrincipalName() {
        return Optional.ofNullable(this.userPrincipalName);
    }

    private ClientInfoResponse() {}

    private ClientInfoResponse(ClientInfoResponse $) {
        this.email = $.email;
        this.name = $.name;
        this.objectId = $.objectId;
        this.userPrincipalName = $.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientInfoResponse $;

        public Builder() {
            $ = new ClientInfoResponse();
        }

        public Builder(ClientInfoResponse defaults) {
            $ = new ClientInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder email(@Nullable String email) {
            $.email = email;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder objectId(@Nullable String objectId) {
            $.objectId = objectId;
            return this;
        }

        public Builder userPrincipalName(@Nullable String userPrincipalName) {
            $.userPrincipalName = userPrincipalName;
            return this;
        }

        public ClientInfoResponse build() {
            return $;
        }
    }

}
