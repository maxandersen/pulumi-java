// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AuditLogConfigResponse {
    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    private final List<String> exemptedMembers;
    /**
     * The log type that this config enables.
     * 
     */
    private final String logType;

    @CustomType.Constructor
    private AuditLogConfigResponse(
        @CustomType.Parameter("exemptedMembers") List<String> exemptedMembers,
        @CustomType.Parameter("logType") String logType) {
        this.exemptedMembers = exemptedMembers;
        this.logType = logType;
    }

    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
    */
    public List<String> exemptedMembers() {
        return this.exemptedMembers;
    }
    /**
     * The log type that this config enables.
     * 
    */
    public String logType() {
        return this.logType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuditLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> exemptedMembers;
        private String logType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuditLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.logType = defaults.logType;
        }

        public Builder exemptedMembers(List<String> exemptedMembers) {
            this.exemptedMembers = Objects.requireNonNull(exemptedMembers);
            return this;
        }
        public Builder exemptedMembers(String... exemptedMembers) {
            return exemptedMembers(List.of(exemptedMembers));
        }
        public Builder logType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }        public AuditLogConfigResponse build() {
            return new AuditLogConfigResponse(exemptedMembers, logType);
        }
    }
}
