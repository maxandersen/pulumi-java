// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines renewal, billing, and transfer settings for a `Registration`.
 * 
 */
public final class ManagementSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagementSettingsResponse Empty = new ManagementSettingsResponse();

    /**
     * The renewal method for this `Registration`.
     * 
     */
    @Import(name="renewalMethod", required=true)
    private String renewalMethod;

    public String renewalMethod() {
        return this.renewalMethod;
    }

    /**
     * Controls whether the domain can be transferred to another registrar.
     * 
     */
    @Import(name="transferLockState", required=true)
    private String transferLockState;

    public String transferLockState() {
        return this.transferLockState;
    }

    private ManagementSettingsResponse() {}

    private ManagementSettingsResponse(ManagementSettingsResponse $) {
        this.renewalMethod = $.renewalMethod;
        this.transferLockState = $.transferLockState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementSettingsResponse $;

        public Builder() {
            $ = new ManagementSettingsResponse();
        }

        public Builder(ManagementSettingsResponse defaults) {
            $ = new ManagementSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder renewalMethod(String renewalMethod) {
            $.renewalMethod = renewalMethod;
            return this;
        }

        public Builder transferLockState(String transferLockState) {
            $.transferLockState = transferLockState;
            return this;
        }

        public ManagementSettingsResponse build() {
            $.renewalMethod = Objects.requireNonNull($.renewalMethod, "expected parameter 'renewalMethod' to be non-null");
            $.transferLockState = Objects.requireNonNull($.transferLockState, "expected parameter 'transferLockState' to be non-null");
            return $;
        }
    }

}
