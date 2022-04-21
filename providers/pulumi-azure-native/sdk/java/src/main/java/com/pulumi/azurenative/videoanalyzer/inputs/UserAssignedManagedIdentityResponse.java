// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The details of the user assigned managed identity used by the Video Analyzer resource.
 * 
 */
public final class UserAssignedManagedIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserAssignedManagedIdentityResponse Empty = new UserAssignedManagedIdentityResponse();

    /**
     * The client ID.
     * 
     */
    @Import(name="clientId", required=true)
    private String clientId;

    public String clientId() {
        return this.clientId;
    }

    /**
     * The principal ID.
     * 
     */
    @Import(name="principalId", required=true)
    private String principalId;

    public String principalId() {
        return this.principalId;
    }

    private UserAssignedManagedIdentityResponse() {}

    private UserAssignedManagedIdentityResponse(UserAssignedManagedIdentityResponse $) {
        this.clientId = $.clientId;
        this.principalId = $.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserAssignedManagedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserAssignedManagedIdentityResponse $;

        public Builder() {
            $ = new UserAssignedManagedIdentityResponse();
        }

        public Builder(UserAssignedManagedIdentityResponse defaults) {
            $ = new UserAssignedManagedIdentityResponse(Objects.requireNonNull(defaults));
        }

        public Builder clientId(String clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder principalId(String principalId) {
            $.principalId = principalId;
            return this;
        }

        public UserAssignedManagedIdentityResponse build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            return $;
        }
    }

}
